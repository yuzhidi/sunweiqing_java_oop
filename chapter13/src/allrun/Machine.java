package allrun;
public class Machine extends Thread{
  public void run(){
    for(int a=0;a<50;a++){
      System.out.println(currentThread().getName()+":"+a);
      try{
        sleep(100);  //�������߳����еĻ���
      }catch(InterruptedException e){throw new RuntimeException(e);}
    }
  }
  public static void main(String args[]){
    Machine machine1=new Machine();  //������һ��Machine����
    Machine machine2=new Machine();  //�����ڶ���Machine����
    machine1.start();  //������һ��Machine�߳�
    machine2.start();  //�����ڶ���Machine�߳�
    machine1.run();  //���߳�ִ�е�һ��Machine�����run()����
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


