import java.io.*;
public class FileInputStreamTester{
  public static void main(String agrs[])throws IOException{
    FileInputStream in=new FileInputStream("D:\\test.txt");
    int data;
    while((data=in.read())!=-1)
      System.out.print(data +" ");
    in.close();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
