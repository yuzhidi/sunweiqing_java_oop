import java.io.*;
public class StandardInTester {
  public static void main(String args[])throws IOException{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(reader);
    String data;
    while((data=br.readLine())!=null && data.length()!=0)
     System.out.println("echo:"+data);
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
