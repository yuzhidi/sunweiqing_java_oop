import java.io.*;
import java.util.*;

/** ��ܵ������д���ݵ��߳� */
class Sender extends Thread{
 private PipedOutputStream out=new PipedOutputStream();
 public PipedOutputStream getPipedOutputStream(){return out;}

 public void run(){
   try{
     for(int i=-127;i<=128;i++){
      out.write(i);
      yield();
     }
     out.close();
   }catch(Exception e){throw new RuntimeException(e);}
 }
}

/** �ӹܵ������������ݵ��߳� */
public class Receiver extends Thread{
 private PipedInputStream in;
 public Receiver(Sender sender)throws IOException{
   in=new PipedInputStream(sender.getPipedOutputStream());
 }

 public void run(){
  try{
    int data;
    while((data=in.read())!=-1)
      System.out.println(data);
    in.close();
  }catch(Exception e){throw new RuntimeException(e);}
 }

 public static void main(String args[])throws Exception{
   Sender sender=new Sender();
   Receiver receiver=new Receiver(sender);
   sender.start();
   receiver.start();
 }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
