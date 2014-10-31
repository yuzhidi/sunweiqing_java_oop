package interrupt;
import java.util.*;
public class Machine extends Thread{
  private int a=0;
  private Timer timer=new Timer(true);
  
  public synchronized void reset(){a=0;}

  public void run(){
    while(true){
      synchronized(this){
         while(a>3){
          final Thread thread=Thread.currentThread();
          timer.schedule(new TimerTask(){  //����һ���̳�TimerTask��������
              public void run(){
                System.out.println(thread.getName()+" has waited for 3 seconds");
                thread.interrupt();  //�ж�����
              }
          },3000);
          
        try{
            this.wait();  //����ȴ�ʱ�䳬��3�룬���յ�InterruptedException
           }catch(InterruptedException e){
             System.out.println(thread.getName()+ " is interrupted");
             return;
           }
         }

         a++;
         System.out.println("a="+a);
      }
    }
  }

  public static void main(String args[])throws Exception{
    Machine machine=new Machine();
    machine.start();
   }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


