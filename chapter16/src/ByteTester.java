import java.io.*;
public class ByteTester {
  public static void main(String agrs[])throws IOException{
     ByteArrayOutputStream out=new ByteArrayOutputStream();
     out.write(259);
     
     byte[] buff=out.toByteArray(); //����ֽ�����
     out.close();

     System.out.println("buff.length="+buff.length);

     ByteArrayInputStream in=new ByteArrayInputStream(buff);
     int data;
     while((data=in.read())!=-1)
       System.out.println(data);
     
     in.close();
  }

}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
