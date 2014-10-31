import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class BufferTester {
  public static void main(String args[])throws IOException{
     final int BSIZE=1024;
     //��test.txt�ļ��е����ݿ�����out.txt��
     FileChannel in=new FileInputStream("D:\\test.txt").getChannel();
     FileChannel out=new FileOutputStream("D:\\out.txt").getChannel();

     ByteBuffer buff=ByteBuffer.allocate(BSIZE);
     while(in.read(buff)!=-1){
       buff.flip();
       out.write(buff);
       buff.clear();
     }
     in.close();
     out.close();
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
