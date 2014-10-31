import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class BigFileTester {
  public static void main(String args[])throws IOException{
    int capacity=0x8000000; //128M
    MappedByteBuffer mb=new RandomAccessFile("D:\\test.txt","rw")
                        .getChannel()
                        .map(FileChannel.MapMode.READ_WRITE,0,capacity);
    mb.put("��ð�".getBytes("GBK"));  //���ļ���д�����GBK������ַ�������ð���
    mb.flip();
    System.out.println(Charset.forName("GBK").decode(mb));
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
