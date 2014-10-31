public class Deputy implements RenterIFC{
  private Renter renter;
  public void registerRenter(Renter renter){
    this.renter=renter;
  }

  public boolean isAgree(double expectedRent){
    //��������ߵ������۸�С�ڷ��������ͼ۸���ͬ�����
    if(expectedRent<renter.getRentDeadLine())return false;

    //������ʾ�ⷿ�ߵ����
    return renter.isAgree(expectedRent);
  }

  public void fetchRent(double rent){
    renter.fetchRent(rent);
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
