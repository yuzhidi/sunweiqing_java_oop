import java.io.*;
import java.nio.*;
public class UseView {
  public static void main(String args[])throws IOException{
    ByteBuffer bb=ByteBuffer.allocate(1024);

    bb.asCharBuffer().put("��");
    System.out.println(bb.getChar());  //��ӡ���á�

    bb.rewind();
    bb.asIntBuffer().put(123);
    System.out.println(bb.getInt());  //��ӡ123

    bb.rewind();
    bb.asFloatBuffer().put(123.45F);
    System.out.println(bb.getFloat());  //��ӡ123.45
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
