public class ExTrace{
  public void methodA(int money)throws SpecialException{
      if(--money<=0) throw new SpecialException("Out of money");
  }
  public void methodB(int money)throws Exception{
     try{
        methodA(1);
     }catch(SpecialException e){
        System.out.println("---Output of methodB()---");
        System.out.println(e.getMessage());
        throw new Exception("Wrong");
     }
  }
  public static void main(String args[]){
     try{
        new ExTrace().methodB(1);
     }catch(Exception e){
        System.out.println("---Output of main()---");
        e.printStackTrace();
     }
  }
}






/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
