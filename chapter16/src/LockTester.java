import java.io.*;
import java.nio.channels.*;
public class LockTester {
  public static void main(String args[])throws Exception{
    FileOutputStream fos=new FileOutputStream("D:\\test.txt");
    FileLock fl=fos.getChannel().tryLock();
    if(fl!=null){
      System.out.println("Locked File");
      System.out.println(fl.isShared());
      Thread.sleep(60000);  //�����ļ�60��
      fl.release();
      System.out.println("Released Lock");
    }
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
