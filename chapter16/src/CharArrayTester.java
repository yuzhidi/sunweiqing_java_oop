import java.io.*;
public class CharArrayTester {
  public static void main(String args[])throws IOException{
    char[] buff=new char[]{'a','��','��','1'};
    CharArrayReader reader=new CharArrayReader(buff);
    int data;
    while((data=reader.read())!=-1)
      System.out.print((char)data+" ");
    reader.close();  //CharArrayReader��close()������ִ���κβ���
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
