public class ParamTester{
  public int memberVariable=0;

  public static void main(String args[]){

    //��������ʼ��4���ֲ�����
    int param1=0; // param1�ǻ�����������
    ParamTester param2=new ParamTester(); //param2 �Ƕ�����������
    ParamTester param3=new ParamTester();//param3 �Ƕ�����������
    int[] param4={0}; //param4��������������
		
    //��4���ֲ�������Ϊ�������ݸ�changeParameter()����
    changeParameter(param1, param2, param3, param4);					
    //��ӡ4���ֲ�����
    System.out.println("param1=" +param1);
    System.out.println("param2.memberVariable="+param2.memberVariable);                 System.out.println("param3.memberVariable=" + param3.memberVariable);
    System.out.println("param4[0]="+param4[0]);
  }

  public static void changeParameter(int param1, ParamTester param2, ParamTester   
                                   param3, int[] param4){
    param1=1; //�ı�����������Ͳ�����ֵ
    param2.memberVariable=1; //�ı�������Ͳ�����ʵ������
    param3=new ParamTester();  //�ı�������Ͳ��������ã�ʹ������һ���µĶ���
    param3.memberVariable=1; //�ı��µĶ����ʵ������
    param4[0]=1; //�ı��������Ͳ�����Ԫ��
  }
}

/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
