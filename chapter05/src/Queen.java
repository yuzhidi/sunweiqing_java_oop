public class Queen {
  private final int size;  //���̵Ĵ�С��Ҳ��ʾ�ʺ����Ŀ
  private int[] location;  //�ʺ������̵�ÿ���ϵ��е�λ��
  private int[] colsOccupied;  //�ʺ���������ռ�ݵ���
  private int[] cross1Occupied;  //�ʺ���������ռ�ݵ����Խ���
  private int[] cross2Occupied;  //�ʺ���������ռ�ݵķ��Խ���
  private static int count;  //��������ĸ���

  private static final int STATUS_OCCUPIED=1;  //ռ��״̬
  private static final int STATUS_OCCUPY_CANCELED=0;  //δռ��״̬

  public Queen(int size){
     //��ʼ��
     this.size=size;
     location=new int[size];
     colsOccupied=new int[size];
     cross1Occupied=new int[2*size];
     cross2Occupied=new int[2*size];
  }

  public void printLocation(){
      System.out.println("�����ǻʺ��������ϵĵ�"+count+"�ְڷ�λ��");
      for(int i=0;i<size;i++)
        System.out.println("��:"+i+"  ��:"+location[i]);
  }
  
  /** �ж�λ��(i,j)�Ƿ�ռ�� */
  private boolean isOccupied(int i,int j){
    return (colsOccupied[j]==1)
          || (cross1Occupied[i-j+size-1]==1)
          || (cross2Occupied[i+j]==1);
  }
  
  /** �������flagΪ1����ʾռ��λ��(i,j)��
   *  �������flagΪ0����ʾȡ��ռ��λ��(i,j)
   */
  private void setStatus(int i,int j,int flag){
    colsOccupied[j]=flag;  //����ռ���ȡ��ռ���j��
    cross1Occupied[i-j+size-1]=flag;  //����ռ���ȡ��ռ�����Խ���
    cross2Occupied[i+j]=flag;  //����ռ���ȡ��ռ�췴�Խ���
  }
    
  /** �ӵ�i�п�ʼ�ڷŻʺ� */
  public void place(int i){
    for(int j=0;j<size;j++)  //�ڵ�i�У��ֱ��԰ѻʺ����ÿһ����
      if(!isOccupied(i,j)){  //�жϸ�λ���Ƿ�ռ��
          location[i]=j;  //�ڷŻʺ��ڵ�i�аѻʺ���ڵ�j��
          setStatus(i,j,STATUS_OCCUPIED);  //����ռ��(i,j)λ��
          if( i<size-1)
            place(i+1);  //������лʺ�û�а��꣬�ݹ�ڷ���һ�еĻʺ�
          else{
            count++;   //ͳ�ƽ�������ĸ���
            printLocation();  //������񣬴�ӡ���лʺ��λ��
          }
          //���ݣ�����ռ��λ��(i,j)
          setStatus(i,j,STATUS_OCCUPY_CANCELED);
     }
  }
  
  public void start(){
    place(0);  //�ӵ�0�п�ʼ���ûʺ�
  }
  
  public static void main(String args[]){
    new Queen(8).start();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
