package wrongstart;
public class Machine extends Thread{
  private int a=0;
  public void start(){
    run();
  }
  public void run(){
for(a=0;a<50;a++){  //ʹ��Machine�����ʵ������a
      System.out.println(currentThread().getName()+":"+a);
      try{
        sleep(100);
      }catch(InterruptedException e){ throw new RuntimeException(e);}
    }
  }
  public static void main(String args[]){
    Machine machine=new Machine();
    machine.start();
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


