public class WithFinally {
  public void methodA(int money)throws SpecialException{
      if(--money<=0) throw new SpecialException("Out of money");
      System.out.println("methodA");
  }
  public static void main(String args[]){
     try{
        new WithFinally().methodA(1);  //�׳�SpecialException�쳣
        System.out.println("main");
     }catch(SpecialException e){
        System.out.println("Wrong");
     }finally{
       System.out.println("Finally");
     }
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
