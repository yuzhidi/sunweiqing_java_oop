import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
public class FileChannelTester {
  public static void main(String args[])throws IOException{
    final int BSIZE=1024;
  
  //���ļ���д����
    FileChannel fc=new FileOutputStream("D:\\test.txt").getChannel();
    fc.write(ByteBuffer.wrap("���,".getBytes()));
    fc.close();

    //���ļ�ĩβ�������
    fc=new RandomAccessFile("D:\\test.txt","rw").getChannel();
    fc.position(fc.size());  //��λ���ļ�ĩβ
    fc.write(ByteBuffer.wrap("����!".getBytes()));
    fc.close();

    //������
    fc=new FileInputStream("D:\\test.txt").getChannel();
    ByteBuffer buff=ByteBuffer.allocate(BSIZE);
    fc.read(buff);  //���ļ��е����ݶ��뵽ByteBuffer��
    buff.flip();
    Charset cs=Charset.defaultCharset(); //��ñ���ƽ̨���ַ�����
    System.out.println(cs.decode(buff)); //ת��ΪUnicode����
    
fc.close();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
