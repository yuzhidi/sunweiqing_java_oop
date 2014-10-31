class Counter {
  private static int count;
  private static ThreadLocal<Integer> serialCount=new ThreadLocal<Integer>(){
    protected synchronized Integer initialValue(){
      return new Integer(count++);
    } 
  };
  
  public static int get(){
    return serialCount.get().intValue();
  }
  public static void set(int i){
    serialCount.set(Integer.valueOf(i)); 
  }
}

public class LocalTester extends Thread{
  public void run(){
    for(int i=0;i<3;i++){
      int c=Counter.get();
      System.out.println(getName()+":"+c);
      Counter.set(c+=2);
    }
  }
 
  public static void main(String args[]){
    Thread t1=new LocalTester();
    Thread t2=new LocalTester();
    t1.start();
    t2.start();
  } 
}

/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
