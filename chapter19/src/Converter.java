public class Converter{
  public static void main(String[] args) {
    toByte("123");  //��ӡ123
    toDouble("123.11D");  //��ӡ123.11
    toByte("123D");  //�׳�NumberFormatException
    toDouble("three");  //�׳�NumberFormatException
  }

  public static void toByte(String s){
    try{
      System.out.println(new Byte(s));
    }catch(Exception e){e.printStackTrace();}
  }

  public static void toDouble(String s){
    try{
      System.out.println(new Double(s));
    }catch(Exception e){e.printStackTrace();}
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
