public class Sleeper extends Thread{
  public void run(){
    try{
      sleep(60000);  //˯��1����
      System.out.println("sleep over");
    }catch(InterruptedException e){
      System.out.println("sleep interrupted");
    }
    System.out.println("end");
  }

  public static void main(String[] args)throws Exception{
    Sleeper sleeper = new Sleeper();
    sleeper.start();
    Thread.sleep(10);
    sleeper.interrupt();  //�ж�Sleeper�̵߳�˯��
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


