package visitstatic;

class A{
  public static class B{
    int v1;
    static int v2;

    public static class C{
      static int v3;
      int v4;
    }
  }
}

public class Tester{
  public void test(){
    A.B b=new A.B();
    A.B.C c=new A.B.C();
    b.v1=1;
    b.v2=1;
    //A.B.v1=1;  //�������
    A.B.v2=1;  //�Ϸ�
    A.B.C.v3=1;  //�Ϸ�
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
