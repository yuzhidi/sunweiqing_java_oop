package initbase;

class Base{
  static int a=1;
  static{
    System.out.println("init Base");
  }
  static void method(){
    System.out.println("method of Base");
  }
}
class Sub extends Base{
  static{
    System.out.println("init Sub");
  }
}
public class Sample{
  public static void main(String args[]){
    System.out.println("a="+Sub.a);  //������ʼ��Base��
    Sub.method();  
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
