import java.io.*;
public class FilterOutputTester{
  public static void main(String[] args)throws IOException {
    FileOutputStream out1=new FileOutputStream("D:\\test.txt");
    BufferedOutputStream out2=new BufferedOutputStream(out1,2);  //װ��һ���ļ������
    DataOutputStream out=new DataOutputStream(out2);  //װ��һ�������������
    out.writeUTF("��ð�");
   
    InputStream in1=new FileInputStream("D:\\test.txt");
    BufferedInputStream in2=new BufferedInputStream(in1); //װ��һ���ļ�������
    DataInputStream in=new DataInputStream(in2); //װ��һ������������
    System.out.println(in.readUTF());
    in.close();
 }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
