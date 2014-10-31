import java.io.*;
public class Redirecter{
  /** Ϊ��׼I/O�ض��� */
  public static void redirect(InputStream in,PrintStream out,PrintStream err){
    System.setIn(in);
    System.setOut(out);
    System.setErr(err);
  }

  /** �����Ա�׼������������д����׼������ͱ�׼��׼��������� */
  public static void copy()throws IOException{
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(reader);
    String data;
    while((data=br.readLine())!=null && data.length()!=0){
     System.out.println(data);  //���׼�����д����
     System.err.println(data);  //���׼���������д����
    }
  }
  public static void main(String args[])throws IOException{
    InputStream standardIn=System.in;
    PrintStream standardOut=System.out;
    PrintStream standardErr=System.err;

    InputStream in=new BufferedInputStream(new FileInputStream("D:\\test.txt"));
    PrintStream out=new PrintStream(
new BufferedOutputStream(new FileOutputStream("D:\\out.txt")));
    PrintStream err=new PrintStream
(new BufferedOutputStream(new FileOutputStream("D:\\err.txt")));
    redirect(in,out,err);  //�ѱ�׼I/O�ض����ļ�
    copy();  //��D:\test.txt�ļ��е����ݿ�����D:\out.txt��D:\err.txt�ļ���

    //�����û���������������ʹ������ʱ��Ӧ�ùر�����
    in.close();
    out.close();
    err.close();

    redirect(standardIn,standardOut,standardErr);  //ʹ��׼I/O����Ĭ�ϵ���
    copy();  //�ѴӼ���������������������̨
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
