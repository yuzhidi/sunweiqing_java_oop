import java.io.*;
public class UseBuffer{
  public static void main(String agrs[])throws IOException{
    final int SIZE=1024;
    FileInputStream in=new FileInputStream("D:\\test.txt");
    FileOutputStream out=new FileOutputStream("D:\\out.txt");

    byte[] buff=new byte[SIZE];  //�����ֽ����黺����

    int len=in.read(buff);  //��test.txt�ļ��е����ݶ��뵽buff��
    while(len!=-1){
      out.write(buff,0,len);  //��buff�е�����д��out.txt�ļ���
      len=in.read(buff);
    }
    in.close();
    out.close();
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
