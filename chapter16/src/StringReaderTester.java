import java.io.*;
public class StringReaderTester {
  public static void main(String args[])throws IOException{
    StringReader reader=new StringReader("abcd1��");
    int data;
    while((data=reader.read())!=-1)
      System.out.print((char)data+" ");
    reader.close();  //StringReader��close()������ִ���κβ���
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
