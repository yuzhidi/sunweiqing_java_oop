public class Sample{
  private int a;  //ʵ������
  public int method(){
    int b=0;  //�ֲ�����
    a++;
    b=a;
    return b;
  }
  public static void main(String args[]){
    Sample s=null;  //�ֲ�����
    int a=0;  //�ֲ�����

    s=new Sample();
    a=s.method(); 
    System.out.println(a);
  }
}

/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 


