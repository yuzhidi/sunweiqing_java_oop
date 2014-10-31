import java.io.*;
import java.nio.*;
import java.nio.charset.*;
public class CharsetConverter {
  public static void main(String args[])throws IOException{
    final int BSIZE=1024;
    //����1
    ByteBuffer bb=ByteBuffer.wrap("���".getBytes("UTF-8"));
    CharBuffer cb=bb.asCharBuffer();
    System.out.println(cb);  //��ӡ??
    
    //����2
    bb=ByteBuffer.wrap("���".getBytes("UTF-16BE"));
    cb=bb.asCharBuffer(); 
    System.out.println(cb);  //��ӡ����á�

    //����3
    bb=ByteBuffer.wrap("���".getBytes("UTF-8"));
    Charset cs=Charset.forName("UTF-8");
    cb=cs.decode(bb);  
    System.out.println(cb);  //��ӡ����á�

    //����4
    cs=Charset.forName("GBK");
    bb=cs.encode("���");
    cb=cs.decode(bb);
    for(int i=0;i<cb.limit();i++)  //��ӡ����á�
      System.out.print(cb.get());  
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
