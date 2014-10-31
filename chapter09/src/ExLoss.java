public class ExLoss{
  public int methodA(int money)throws SpecialException{
       if(--money<=0) throw new SpecialException("Out of money");
       return money;
  }

  public int methodB(int money)throws Exception{
    try{
      return methodA(money);  //�����׳��쳣
    }catch(SpecialException e){
      throw new Exception("Wrong");
    }finally{
      return 100;
    }
  }

  public static void main(String args[]){
    try{
      System.out.println(new ExLoss().methodB(1));  //��ӡ100
      System.out.println("No Exception");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
