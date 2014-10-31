package nooverride;

class Outer{
  Inner in;
  Outer(){in=new Inner();}  //����Outer.Inner���ʵ��

  public class Inner{  //public���ʼ���
    public Inner(){System.out.println("inner of Outer");}
  }
}

public class SubOuter extends Outer{
  class Inner{  //Ĭ�Ϸ��ʼ���
    public Inner(){System.out.println("inner of SubOuter");}
  }

  public static void main(String args[]){
     SubOuter.Inner in1=new SubOuter().new Inner();
     Outer.Inner in2=new Outer().new Inner();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
