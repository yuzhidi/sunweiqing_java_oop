package usetimer;
import java.util.Timer;
import java.util.TimerTask;
public class Machine extends Thread{
  private int a;
  private static int count;

  public void start(){
    super.start();
    Timer timer=new Timer(true);  //����Timer�������߳���Ϊ��̨�߳�
 
  TimerTask task=new TimerTask(){  //������
      public void run(){
        while(true){  //����ѭ��
          reset();
          try{
            sleep(1000);
            }catch(InterruptedException e){/*throw new RuntimeException(e);*/}
        }
      }
    };
  
  timer.schedule(task,10,500);  //���ö�ʱ����
  }
  public void reset(){a=0;}
  public void run(){
    while(true){
      System.out.println(getName()+":"+a++);
      if(count++==100)break;
      yield();
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

 


