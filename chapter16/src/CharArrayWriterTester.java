import java.io.*;
public class CharArrayWriterTester {
  public static void main(String args[])throws IOException{
    CharArrayWriter writer=new CharArrayWriter();
    writer.write('��');
    writer.write('��');
    
    char[] buff=writer.toCharArray();
    System.out.println(new String(buff));  //��ӡ����á�

    writer.close();  //CharArrayWriter��close()������ִ���κβ���

  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
