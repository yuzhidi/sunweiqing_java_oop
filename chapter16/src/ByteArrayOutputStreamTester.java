import java.io.*;
public class ByteArrayOutputStreamTester{
  public static void main(String agrs[])throws IOException{
     ByteArrayOutputStream out=new ByteArrayOutputStream();
     out.write("���".getBytes("UTF-8"));  //�ѡ���á���UTF-8����д���ֽ�������
     
     byte[] buff=out.toByteArray(); //����ֽ�����
     out.close();  //ByteArrayOutputStream��close()������ִ���κβ���

     ByteArrayInputStream in=new ByteArrayInputStream(buff); 
     int len=in.available();
     byte[] buffIn=new byte[len];
     in.read(buffIn);  //��buff�ֽ������е����ݶ��뵽buffIn��
     in.close();  //ByteArrayInputStream��close()������ִ���κβ���

     System.out.println(new String(buffIn, "UTF-8"));  //���ַ����봴���ַ���
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
