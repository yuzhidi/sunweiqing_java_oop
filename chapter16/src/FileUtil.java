import java.io.*;
public class FileUtil {
  /** ��һ���ļ������ж�ȡ�ַ��������ñ���ƽ̨���ַ����� */
  public void readFile(String fileName)throws IOException{
    readFile(fileName,null);
  }

/** ��һ���ļ������ж�ȡ�ַ���������charsetNameָ���ļ����ַ����� */
  public void readFile(String fileName, String charsetName)throws IOException{
    InputStream in=new FileInputStream(fileName);
    InputStreamReader reader;
    if(charsetName==null)
      reader=new InputStreamReader(in);
    else
      reader=new InputStreamReader(in,charsetName);
    BufferedReader br=new BufferedReader(reader);
    String data;
    while((data=br.readLine())!=null)  //���ж�ȡ����
      System.out.println(data);

    br.close();
 }

 /** ��һ���ļ��е��ַ����ݿ�������һ���ļ��У����ҽ�������ص��ַ�����ת�� */
 public void copyFile(String from, String charsetFrom,String to,String charsetTo)throws IOException{
    InputStream in=new FileInputStream(from);
    InputStreamReader reader;
    if(charsetFrom==null)
      reader=new InputStreamReader(in);
    else
      reader=new InputStreamReader(in,charsetFrom);
    BufferedReader br=new BufferedReader(reader);

    OutputStream out=new FileOutputStream(to);
    OutputStreamWriter writer=new OutputStreamWriter(out,charsetTo);
    BufferedWriter bw=new BufferedWriter(writer);
    PrintWriter pw=new PrintWriter(bw,true);

    String data;
    while((data=br.readLine())!=null)
      pw.println(data);  //��Ŀ���ļ�����д����

    br.close();
    pw.close();
  }

  public static void main(String args[])throws IOException{
     FileUtil util=new FileUtil ();
     
//���ձ���ƽ̨���ַ������ȡ�ַ�
     util.readFile("D:\\test.txt");
     
//��test.txt�ļ��е��ַ����ݿ�����out.txt�У�out.txt����UTF-8����
     util.copyFile("D:\\test.txt",null,"D:\\out.txt","UTF-8");
     
//���ձ���ƽ̨���ַ������ȡ�ַ����������������
     util.readFile("D:\\out.txt");  
     
//����UTF-8�ַ������ȡ�ַ�
     util.readFile("D:\\out.txt","UTF-8");
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
