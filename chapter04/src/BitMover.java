public class BitMover{ 
  /** ������4λ���4λ��λ�� */
  public static byte swap(byte b){
    int lowBits=b & 0xF;  //��õ�4λ
    int highBits=b & 0xF0;  //��ø�4λ 

    //�ѵ�4λ����4λ����ɸ�4λ
    //�Ѹ�4λ�޷�������4λ����ɵ�4λ
    //�ٰ����߽���λ��
    int result= lowBits<<4 | highBits>>>4; 
  
    return (byte)result;  //ǿ������ת������ȡint���ݵĺ��λ
  }

  public static void main(String args[]){
     System.out.println(swap((byte)10));  //��ӡ-96
     System.out.println(swap((byte)1));   //��ӡ16
     System.out.println(swap((byte)-1));  //��ӡ-1
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
