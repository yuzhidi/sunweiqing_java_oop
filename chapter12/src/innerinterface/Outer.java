package innerinterface;

public class Outer{
  public static interface Tool{ public int add(int a,int b);}  //��̬�ڲ��ӿ�

  private Tool tool=new Tool(){public int add(int a,int b){return a+b;}};  //������

  public void add(int a,int b,int c){
    tool.add(tool.add(a,b),c);
  }

  public void setTool(Tool tool){
    this.tool=tool;
}
}

class MyTool implements Outer.Tool{
  public int add(int a,int b){
    int result=a+b;
    System.out.println(result);
    return result;
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
