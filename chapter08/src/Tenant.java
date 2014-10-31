public class Tenant{
  private double money;

  public Tenant(double money){
    this.money=money;
  }

  public boolean rentHouse(double expectedRent){
    //�ӷ����г��ҵ�һ�����ݳ������
    RenterIFC renter=HouseMarket.findRenter();

    //�������ͬ��Ԥ�ڵ����۸񣬾��������������ִ��
    if(! renter.isAgree(expectedRent)) return false;

    //�Ӵ����ȡ��Ԥ�����
    money-=expectedRent;

    //����𽻸����ݴ���
    renter.fetchRent(expectedRent);

    return true;
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
