package privatetest;
class Base {
  private String showMe() {
    return "Base";
  }
  public void print(){
    System.out.println(showMe());  //���׵���Base���showMe()����Sub���showMe()?
  }
}
public class Sub extends Base {
  public String showMe(){
    return "Sub";
  }
  public static void main(String args[]){
    Sub sub=new Sub();
    sub.print();
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
