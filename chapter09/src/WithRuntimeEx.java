public class WithRuntimeEx {
  public int divide(int a,int b){
    if(b==0)throw new IllegalArgumentException("��������Ϊ0");
    return a/b;  
  }
  public static void main(String args[]){
    new WithRuntimeEx ().divide(1,0);
    System.out.println("End");
  }
}







/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
