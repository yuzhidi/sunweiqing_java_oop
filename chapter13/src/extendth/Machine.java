package extendth;
public class Machine extends Thread{
  public void run(){
    for(int a=0;a<50;a++)
      System.out.println(a);
  }
  
  public static void main(String args[]){
    Machine machine=new Machine();
    machine.start();  //����machine�߳�
  }	
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


