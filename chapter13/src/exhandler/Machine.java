package exhandler;
class MachineGroup extends ThreadGroup{
  public MachineGroup(){super("MachineGroup");}

  public void uncaughtException(Thread t, Throwable e){
    System.out.println(getName()+" catches an exception from "+t.getName());
    super.uncaughtException(t,e);
  }
}

class MachineHandler implements Thread.UncaughtExceptionHandler{
  private String name;
  public MachineHandler(String name){this.name=name;}

  public void uncaughtException(Thread t, Throwable e){
    System.out.println(name+" catches an exception from "+t.getName());
  }
}

public class Machine extends Thread{
  public Machine(ThreadGroup group, String name){super(group,name);}
  public void run(){
    int a=1/0;  //throw ArithmeticException����ʱ�쳣
  }
  public static void main(String args[])throws Exception{
    ThreadGroup group=new MachineGroup();
     //����Machine���Ĭ���쳣������     
    UncaughtExceptionHandler defaultHandler=new MachineHandler("DefaultHandler");   

    Machine.setDefaultUncaughtExceptionHandler(defaultHandler); 
    
    Machine m1=new Machine(group,"machine1");
    Machine m2=new Machine(group,"machine2");
    
    UncaughtExceptionHandler currHandler=new MachineHandler("Machine2\'handler");   
              //����m2�ĵ�ǰ�쳣������
    m2.setUncaughtExceptionHandler(currHandler);

    m1.start();
    m2.start(); 
  } 
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


