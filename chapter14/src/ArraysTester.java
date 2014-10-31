import java.util.Arrays;
public class ArraysTester{
  /** ��Arrays������ַ������� */
  public void testStringArray(){
    String[] s1={"Tom1","Jack","Mike","Mary","Tom2"};
    String[] s2={"Tom1","Jack","Mike","Mary","Tom2"};
    System.out.println("s1�Ƿ��s2��ȣ�"+Arrays.equals(s1,s2));

    Arrays.sort(s1);  //Ϊ����s1����
    System.out.println("s1�����s1�Ƿ��s2��ȣ�"+Arrays.equals(s1,s2));

    System.out.println("Jack��s1�����е�λ��: "+Arrays.binarySearch(s1,"Jack"));
    System.out.println("Jack��s2�����е�λ��: "+Arrays.binarySearch(s2,"Jack"));
    System.out.println("s1:"+Arrays.toString(s1));
    System.out.println("s2:"+Arrays.toString(s2));
  }

  /** ��Arrays�����int���� */
  public void testIntArray(){
    int[] a1=new int[5],a2=new int[5],a3={4,5,6,3,9,4};
    Arrays.fill(a1,100);
    //��a1�����е����ݿ�����a2������
    System.arraycopy(a1,0,a2,0,a1.length);
    System.out.println("a1�Ƿ��a2��ȣ�"+Arrays.equals(a1,a2));

    Arrays.sort(a3);
    System.out.println("5��a3�����е�λ��: "+Arrays.binarySearch(a3,5));

    System.out.println("a1:"+Arrays.toString(a1));
    System.out.println("a2:"+Arrays.toString(a2));
    System.out.println("a3:"+Arrays.toString(a3));
  }

  public static void main(String args[]){
    ArraysTester s=new ArraysTester();
    s.testStringArray();
    s.testIntArray();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
