package usesuper;
class Base{
  String var="Base's Variable";
  void method(){System.out.println("call Base's method"); }
}

public class Sub extends Base{
  String var="Sub's variable";  //���ظ����var����
  void method(){System.out.println("call Sub's method");}  //���Ǹ����method()����

  void test(){
    String var="Local variable";  //�ֲ�����

    System.out.println("var is "+var);  //��ӡmethod()�����ľֲ�����
    System.out.println("this.var is "+ this.var);  //��ӡSubʵ����ʵ������
    System.out.println("super.var is "+ super.var); //��ӡ��Base���ж����ʵ������

    method();  //����Subʵ����method()����
    this.method();  //����Subʵ����method()����
    super.method();  //������Base���ж����method()����
  }

  public static void main(String args[]){
    Sub sub=new Sub();
    sub.test();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
