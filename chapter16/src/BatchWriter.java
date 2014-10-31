import java.io.*;
import java.nio.*;
public class BatchWriter{
  public static void main(String args[])throws IOException{
    ByteBuffer bb=ByteBuffer.allocate(1024);

    IntBuffer ib=bb.asIntBuffer();
    ib.put(new int[]{10,20,30,40,50});  //�򻺳���д��һ��int���͵�����
    System.out.println(ib.get(3));  //��ӡ40

    ib.put(3,400);
    System.out.println(ib.get(3));  //��ӡ400

    ib.rewind();
    while(ib.hasRemaining()){  //���δ�ӡ10,20,30,400,50
      int i=ib.get();
      if(i==0)break;  
      System.out.println(i);
    }
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
