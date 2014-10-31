package control;
public class Machine extends ControlledThread{
  private int count;  //��������

  public void run(){
    while(true){
     synchronized(this){
       count++;
       System.out.println(Thread.currentThread().getName()+":run "+count+" times");
     }
     if(!checkState()){
       System.out.println(Thread.currentThread().getName()+":stop");
       break;
     }
    }
  }

  public synchronized int getCount(){return count;}

  public synchronized void reset(){
    count=0;
    System.out.println(Thread.currentThread().getName()+":reset");
  }

  public static void main(String args[]){
    Machine machine=new Machine();
    machine.start();
    for(int i=0;i<200;i++){
      if(machine.getCount()>5){
        machine.setState(ControlledThread.SUSP);  //��machine�߳���ͣ
        yield();
        machine.reset();
        machine.setState(ControlledThread.RUN);  //��machine�ָ̻߳�����
       }
       yield();
    }
    machine.setState(ControlledThread.STOP);  //��machine�߳���ֹ����
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


