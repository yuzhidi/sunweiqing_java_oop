package visitcontrol;

class Outer{
  public class InnerTool{  //�ڲ���
    public int add(int a,int b){
      return a+b;
    }
  }

  private InnerTool tool=new InnerTool();

  public void add(int a,int b,int c){
    tool.add(tool.add(a,b),c);
  }
}

public class Tester{
  public static void main(String args[]){
    Outer o=new Outer();
    o.add(1,2,3);
    Outer.InnerTool tool=new Outer().new InnerTool();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
