package noname;

public class A {
A(int v){System.out.println("another constructor");}
  A(){System.out.println("default constructor");}

  void method(){System.out.println("from A");};

  public static void main(String args[]){
    new A().method();  //��ӡfrom A

    A a=new A(){  //������
      void method(){System.out.println("from anonymous");}
    };
    a.method();  //��ӡfrom anonymous
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
