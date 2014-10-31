package poly;
class Base{
  String var="BaseVar";  //ʵ������
  static String staticVar="StaticBaseVar";  //��̬����

  void method(){  //ʵ������
     System.out.println("Base method");
  }
  static void staticMethod(){  //��̬����
     System.out.println("Static Base method");
  }
}

public class Sub extends Base{
  String var="SubVar";  //ʵ������
  static String staticVar="StaticSubVar";  //��̬����

  void method(){  //���Ǹ����method()���� 
     System.out.println("Sub method");
  }
  static void staticMethod(){  //���ظ����staticMethod()����
      System.out.println("Static Sub method");
  }

  String subVar="Var only belonging to Sub";
  void subMethod(){
      System.out.println("Method only belonging to Sub");
  }

  public static void main(String args[]){
    Base who=new Sub();  //who������ΪBase���ͣ�����Subʵ��
    System.out.println("who.var="+who.var);  //��ӡBase���var����
    System.out.println("who.staticVar="+who.staticVar); //��ӡBase���staticVar����
    who.method();  //��ӡSubʵ����method()����
    who.staticMethod();  //��ӡBase���staticMethod()����
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
