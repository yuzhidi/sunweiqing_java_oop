package diffnames;

public class A{
  int v=1;
  class B{
    int v=2;
    public void test(){
      System.out.println("v="+v);  //��ӡv=2
      System.out.println("this.v="+this.v);  //��ӡthis.v=2
      System.out.println("A.this.v="+A.this.v);  //��ӡA.this.v=1
    }
  }

  public static void main(String args[]){
    new A().new B().test();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
