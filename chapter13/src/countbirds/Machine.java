package countbirds;
public class Machine implements Runnable {
  private int a=1;  //��������
  public void run() {
    for(int i=0;i<1000;i++){
      a+=i;
      Thread.yield();  //�������߳����еĻ���
      a-=i;
      System.out.println(a);
    }
  }
  public static void main(String args[]) throws InterruptedException{
    Machine machine=new Machine();
    Thread t1=new Thread(machine);
    Thread t2=new Thread(machine);
    t1.start();
    // t2.start();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


