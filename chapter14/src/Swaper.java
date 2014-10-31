public class Swaper {

  /** ����array1������array2��������� */
  public static void change(int[] array1, int[] array2){
    for(int i=0;i<array1.length;i++){
      int temp=array1[i];
      array1[i]=array2[i];
      array2[i]=temp;
    }
  }

  /** ��������a�����b������ */
  public static void change(int a,int b){
    int temp=a;
    a=b;
    b=temp;
  }

  /** ����ַ����е������ַ�  */
  public static char[] getChars(String str){
    if(str==null)
      return new char[0];  //���س���Ϊ0������

    char[] result=new char[str.length()];
    for(int i=0;i<str.length();i++)
      result[i]=str.charAt(i);

    return result;
  }

  public static void main(String args[]){
    int[] array1={1,3,5,7},array2={2,4,6,8};
    
    change(array1,array2);  //������array1������������array2����
    for(int i=0;i<array2.length;i++)
      System.out.println("array2["+i+"]="+array2[i]);

    change(array2[1],array2[2]);
    System.out.println("array2[1]="+array2[1]);
    System.out.println("array2[2]="+array2[2]);

    char[] chars=getChars("Hello"); //����ַ�����Hello���е������ַ�
    for(int i=0;i<chars.length;i++)
      System.out.print(chars[i]);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
