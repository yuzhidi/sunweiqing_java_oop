public class FinallyReturn {
  public int methodA(int money)throws SpecialException{
    if(--money<=0) throw new SpecialException("Out of money");
    return money;
  }

  public int methodB(int money){
    try{
      return methodA(money);  //�����׳��쳣
    }catch(SpecialException e){
      return -100;
    }finally{
      return 100;  //�Ḳ��try��catch������return���
    }
  }

  public static void main(String args[]){
    FinallyReturn s=new FinallyReturn ();
    System.out.println(s.methodB(1));  //��ӡ100
    System.out.println(s.methodB(2));  //��ӡ100
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
