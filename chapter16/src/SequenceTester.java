import java.io.*;
public class SequenceTester {
  public static void main(String[] args)throws IOException {
    InputStream s1=new ByteArrayInputStream("��".getBytes());  
    InputStream s2=new ByteArrayInputStream("��".getBytes());  
    InputStream in=new SequenceInputStream(s1,s2);
    int data;
    while((data=in.read())!=-1)
      System.out.print(data+" ");
    in.close();  //�ر����б�������������
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
