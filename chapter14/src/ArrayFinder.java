public class ArrayFinder{
  public static void print(int[] array,int middle){
      for(int i=0;i<array.length;i++){
        System.out.print(array[i]);
        if(i==middle)System.out.print("*");
        System.out.print("  ");
      }

      System.out.println();
  }

  /** ���ö�������㷨 */
  public static int indexOf(int[] array, int value){
   int low=0;
   int high=array.length-1;
   int middle;

   while(low<=high){
     middle=(low+high)/2;  //�����м�Ԫ�ص�����
     print(array,middle);  //��ӡ���飬���ڸ��ٲ��ҹ���
     if(array[middle]==value)return middle;

     if(value<array[middle])
       high=middle-1;
     else
       low=middle+1;
   }
   return -1;  //û���ҵ���Ԫ�أ�����-1
  }

  public static void main(String args[]){
    int[] array={4,5,6,7,9,13,17};
    System.out.println("location of 13: "+indexOf(array,13));  //����13�������е�λ��
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
