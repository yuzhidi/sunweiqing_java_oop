import java.io.*;
public class ByteArrayTester {
  public static void main(String agrs[])throws IOException{
    byte[] buff=new byte[]{2,15,67,-1,-9,9};
    ByteArrayInputStream in=new ByteArrayInputStream(buff,1,4);
    int data=in.read();
    while(data!=-1){
      System.out.print(data +" ");
      data=in.read();
    }
    in.close();  //ByteArrayInputStream��close()����ʵ���ϲ�ִ���κβ���
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
