package suspend;
public class Machine extends Thread{
  private int a;  //��������

  public void run(){
    for(int i=0;i<1000;i++){
      synchronized(this){
       a+=i;
       yield();  //�������߳����еĻ���
       a-=i;
     }
    }
  }

  public synchronized void reset(){ a=0;}

  public static void main(String args[]) throws InterruptedException{
    Machine machine=new Machine();
    machine.start();
    yield();  //��machine�߳����еĻ���
    machine.suspend();  //��machine�߳���ͣ
    machine.reset();  //����machine�����ͬ�������
    machine.resume();  //ʹmachine�ָ̻߳�����
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


