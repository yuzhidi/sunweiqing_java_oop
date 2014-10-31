package outerref;

public class A{
  private int a1;
  public int a2;
  static int a3;
  public A(int a1,int a2){this.a1=a1;this.a2=a2;}

  protected int methodA(){return a1*a2;}

  class B{  //�ڲ���
    int b1=a1;  //ֱ�ӷ���private��a1
    int b2=a2;  //ֱ�ӷ���public��a2
    int b3=a3;  //ֱ�ӷ���static��a3
    int b4=new A(3,4).a1;  //����һ���½���ʵ��A��a1
    int b5=methodA();  //����methodA()����
  }

  public static void main(String args[]){
    A.B b=new A(1,2).new B();
    System.out.println("b.b1="+b.b1);  //��ӡb.b1=1
    System.out.println("b.b2="+b.b2);  //��ӡb.b2=2
    System.out.println("b.b3="+b.b3);  //��ӡb.b3=0
    System.out.println("b.b4="+b.b4);  //��ӡb.b4=3
    System.out.println("b.b5="+b.b5);  //��ӡb.b5=2
  }
}

/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
