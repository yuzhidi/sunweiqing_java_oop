package join;
public class Machine extends Thread{
  public void run(){
    for(int a=0;a<50;a++)
      System.out.println(getName()+":"+a);
  }
  public static void main(String args[])throws Exception{
    Machine machine=new Machine();
    machine.setName("m1");

    machine.start();
    System.out.println("main:join machine");
    machine.join();  //���̵߳ȴ�machine�߳����н���
    System.out.println("main:end");
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


