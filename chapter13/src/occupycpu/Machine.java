package occupycpu;
public class Machine extends Thread{
  private static StringBuffer log=new StringBuffer();
  private static int count=0;

  public void run(){
    for(int a=0;a<20;a++){
      log.append(currentThread().getName()+":"+a+" ");
      if(++count %10==0)log.append("\n");
     }
  }
  public static void main(String args[])throws Exception{
    Machine machine1=new Machine();
    Machine machine2=new Machine();
    machine1.setName("m1");
    machine2.setName("m2");
    machine1.start();
    machine2.start();
    while(machine1.isAlive() || machine2.isAlive())
      Thread.sleep(500);  //���߳�˯��500�룬�ȴ�machine1��machine2�߳����н���
    System.out.println(log);
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


