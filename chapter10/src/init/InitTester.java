package init;
class Base{
static int a=1;
  static{
    System.out.println("init Base");
  }
}

class Sub extends Base{
  static int b=1;
  static{
    System.out.println("init Sub");
  }
}

public class InitTester{
  static{System.out.println("init InitTester");}

/*
  public static void main(String args[]){
    System.out.println("b="+Sub.b);  //ִ�����д���ʱ�������γ�ʼ��Base���Sub��
  }
*/

 public static void main(String args[]){
    Base base;  //�����ʼ��Base��
    System.out.println("After defining base");
    base=new Base();  //ִ�����д���ʱ����ʼ��Base��
    System.out.println("After creating an object of Base");
    System.out.println("a="+base.a);
    System.out.println("b="+Sub.b);  //ִ�����д���ʱ��������ʼ��Sub��
  }

}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
