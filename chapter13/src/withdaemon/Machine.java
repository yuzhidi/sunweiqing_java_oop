package withdaemon;
public class Machine extends Thread{
  private int a;
  private static int count;

  public void start(){
    super.start();
    Thread deamon=new Thread(){  //�����߳���
      public void run(){
        while(true){  //����ѭ��
          //ÿ��1���ʵ������a��Ϊ0��
          reset();
          try{
            sleep(1000);
          }catch(InterruptedException e){throw new RuntimeException(e);}
        }
      }
    };
    deamon.setDaemon(true);
    deamon.start();
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

 


