import java.io.*;
public class RandomTester {
  public static void main(String args[])throws IOException{
     RandomAccessFile rf=new RandomAccessFile("D:\\test.dat","rw");
     for(int i=0;i<10;i++)
       rf.writeLong(i*1000);

     rf.seek(5*8);  //���ļ���ͷ��ʼ��������5��long���ݣ�������д��6��long����
     rf.writeLong(1234);

     rf.seek(0);  //�Ѷ�дָ�붨λ���ļ���ͷ
     for(int i=0;i<10;i++)
      System.out.println("Value"+i+":"+rf.readLong());

     rf.close();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
