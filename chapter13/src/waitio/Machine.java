package waitio;
public class Machine extends Thread{
  private static StringBuffer log=new StringBuffer();
  private static int count=0;

  public void run(){
    for(int a=0;a<50;a++)
      System.out.println(currentThread().getName()+":"+a);
  }

  public static void main(String args[])throws Exception{
    Machine machine=new Machine();
    machine.start();
    int data=System.in.read();
    machine.run();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


