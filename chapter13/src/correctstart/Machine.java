package correctstart;
public class Machine extends Thread{
  private int a=0;
  private static int count=0;  //ͳ�Ʊ�������Machine�̵߳���Ŀ
  public void start(){
    super.start();
    System.out.println(currentThread().getName()
+":��"+(++count)+"��Machine�߳�����");  //���д��������߳�ִ��
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
    Machine machine1=new Machine();
    Machine machine2=new Machine();
    machine1.start();
    machine2.start();
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


