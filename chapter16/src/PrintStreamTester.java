import java.io.*;
public class PrintStreamTester{
  private static void readBuff(byte[] buff)throws IOException{
    ByteArrayInputStream in=new ByteArrayInputStream(buff);
    int data;
    while((data=in.read())!=-1)
       System.out.print(data+" ");
    System.out.println();
in.close();
  }

  public static void main(String agrs[])throws IOException{
     //ͨ��PrintStreamд�ַ������á�
   ByteArrayOutputStream out=new ByteArrayOutputStream();
     PrintStream ps=new PrintStream(out,true);
     ps.print("��");
     ps.close();

     byte[] buff=out.toByteArray(); //����ֽ�����
     System.out.println("���ñ��ز���ϵͳ��Ĭ���ַ����룺");
     readBuff(buff);
     
     //ͨ��DataOutputStreamд�ַ������á�
     out=new ByteArrayOutputStream();
     DataOutputStream ds=new DataOutputStream(out);
     ds.writeUTF("��");
     ds.close();

     buff=out.toByteArray(); //����ֽ�����
     System.out.println("����������Java���Ե�UTF-8�ַ����룺");
     readBuff(buff);
   }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
