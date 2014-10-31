package synsleep;
public class Machine implements Runnable {
  private int a=1;  //��������
  public void run() {
    for(int i=0;i<1000;i++){
      synchronized(this){
        a+=i;
        try{
          Thread.sleep(500); //�������߳����еĻ���
        }catch(InterruptedException e){throw new RuntimeException(e);}
        a-=i;
        System.out.println(Thread.currentThread().getName()+":"+a);
      }
    }
  }

  public void go(){
    for(int i=0;i<1000;i++){
        System.out.println(Thread.currentThread().getName()+":"+i);
        Thread.yield();
     }
  }
  public static void main(String args[]) throws InterruptedException{
    Machine machine=new Machine();
    Thread t1=new Thread(machine);
    Thread t2=new Thread(machine);
    t1.start();
    t2.start();
    machine.go();
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


