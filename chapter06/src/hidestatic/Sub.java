package  hidestatic;
class Base{
  void method(){  //ʵ������
    System.out.println("method of Base");
  }
  static void staticMethod(){  //��̬����
    System.out.println("static method of Base");
  }
}
public class Sub extends Base{
  void method(){  //���Ǹ����ʵ������method()
    System.out.println("method of Sub");
  }
  static void staticMethod(){  //���ظ���ľ�̬����staticMethod()
    System.out.println("static method of Sub");
  }

  public static void main(String args[]){
    Base sub1=new Sub();  //sub1����������ΪBase���ͣ�����Subʵ��
    sub1.method();  //��ӡ method of Sub
    sub1.staticMethod();  //��ӡ static method of Base

    Sub sub2=new Sub();  //sub2����������ΪSub���ͣ�����Subʵ��
    sub2.method();  //��ӡ method of Sub
    sub2.staticMethod();  //��ӡ static method of Sub
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
