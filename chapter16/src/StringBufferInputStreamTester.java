import java.io.*;
public class StringBufferInputStreamTester {
  public static void main(String agrs[])throws IOException{
    StringBufferInputStream in=new StringBufferInputStream("abcd1��");
    int data;
    while((data=in.read())!=-1)
      System.out.print (data+" ");
    in.close();
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
