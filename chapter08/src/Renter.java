public class Renter implements RenterIFC{
  /** ���������ͼ۸� */
  private double rentDeadLine;
  /** ��� */
  private double money;

  public Renter(double rentDeadLine,double money){
    this.rentDeadLine=rentDeadLine;
    this.money=money;
  }
  public double getRentDeadLine(){
    return rentDeadLine;
  }
  public boolean isAgree(double expectedRent){
    //��������ߵ������۸�ȷ��������ͼ۸��100Ԫ����ͬ�����
    return expectedRent-this.rentDeadLine>100;
  }

  public void fetchRent(double rent){
    money+=rent;
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
