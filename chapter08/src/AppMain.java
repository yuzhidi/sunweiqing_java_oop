public class AppMain {
 public static void main(String[] args)throws Exception {
   //����һ�����ݳ����ߣ����������ͼ۸�2000Ԫ�����1��Ԫ
   Renter renter=new Renter(2000,10000);
   //����һ������������
   Deputy deputy=new Deputy();
   //���������˵������г��Ǽ�
   HouseMarket.registerRenter(deputy);
   //�������ݳ����ߺʹ����˵�ί�й�ϵ
   deputy.registerRenter(renter);

   //����һ�����������ߣ����Ϊ2��Ԫ
   Tenant tenant=new Tenant(20000);

   //������������ͼ�����������Ϊ1800Ԫ�ķ��ݣ��⵽�����˾ܾ�
   tenant.rentHouse(1800);
   //������������ͼ�����������Ϊ2000Ԫ�ķ��ݣ��ⷿ�ɹ�
   tenant.rentHouse(2300);
 }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
