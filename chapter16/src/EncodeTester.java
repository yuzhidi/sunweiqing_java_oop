import java.io.*;
public class EncodeTester {
  private static void readBuff(byte[] buff)throws IOException{
    ByteArrayInputStream in=new ByteArrayInputStream(buff);
    int data;
    while((data=in.read())!=-1)
       System.out.print(data+" ");
    System.out.println();
in.close();
  }

  public static void main(String agrs[])throws IOException{
    System.out.println("���ڴ��в���Unicode�ַ����룺");
    char c='��';
    int lowBit=c & 0xFF; //��ö����Ƶĵ�8λ
    int highBit=(c & 0xFF00) >>8; //��ö����Ƶĸ�8λ
    System.out.println (highBit+" "+lowBit);
    
    String s="��";
    System.out.println("���ñ��ز���ϵͳ��Ĭ���ַ����룺");
    readBuff(s.getBytes());

    System.out.println("����GBK�ַ����룺");
    readBuff(s.getBytes("GBK"));

    System.out.println("���ñ�׼UTF-8�ַ����룺");
    readBuff(s.getBytes("UTF-8"));
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
