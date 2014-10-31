package inherit;

class Outer{
  private int a;
  public Outer(int a){this.a=a;}

  class Inner{
    public Inner(){}
    public void print(){System.out.println("a="+a);}  //�����ⲿ���ʵ������a
  }
}

public class Sample extends Outer.Inner{
  //public Sample(){} //�������

  public Sample(Outer o){
    o.super();
  }

  public static void main(String args[]){
     Outer outer1=new Outer(1);
     Outer outer2=new Outer(2);

     Outer.Inner in=outer1.new Inner();
     in.print();

     Sample s1=new Sample(outer1);
     Sample s2=new Sample(outer2);
     s1.print();  //��ӡa=1
     s2.print();  //��ӡa=2
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
