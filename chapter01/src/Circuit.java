public class Circuit{
  private Bulb bulb;
  public void setBulb(Bulb bulb){
    this.bulb=bulb; 
  }
  public void switchOn(){
    bulb.light();
  }

  public void switchOff(){
    bulb.goOut();
  }
 
  public void transportPower(){System.out.println("transport power ");}
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
