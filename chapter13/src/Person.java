public class Person extends Thread{
  private Well well;
  public Person(Well well){
    this.well=well;
    start();  //���������߳�
  }

  public void run(){
    synchronized(well){
      for(int i=0;i<10;i++){  //��10Ͱˮ
        well.withdraw();
        yield();
      }
    }
  }
  public static void main(String args[]){
    Well well=new Well();
    Person persons[]=new Person[10];
    for(int i=0;i<10;i++)  //����10��Person�߳�
      persons[i]=new Person(well);
  }
}

class Well{
  private int water=1000;
  public void withdraw(){  //��һͰˮ
    water--;
    System.out.println(Thread.currentThread().getName()+": water left:"+water);
  }
}






/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


