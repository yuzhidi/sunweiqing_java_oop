import java.io.*;
import java.nio.*;
public class ViewTester{
  public static void main(String args[])throws IOException{
    ByteBuffer bb=ByteBuffer.allocate(4);
    while(bb.hasRemaining())  //��ӡ4��0
       System.out.println(bb.get());
    bb.rewind();

    CharBuffer cb=bb.asCharBuffer();  //���ByteBuffer��CharBuffer��ͼ
    cb.put("���");
    while(bb.hasRemaining())  //���δ�ӡ79,96,89,125
       System.out.println(bb.get());
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
