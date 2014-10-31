public class ReadingLamp{
  /** ���� */ 
  private Bulb bulb;
  
  /** ��Դ��· */
  private Circuit circuit;

  /** ���췽�� */
  public ReadingLamp(Bulb bulb, Circuit circuit){
    this.bulb=bulb;
    this.circuit=circuit;
    bulb.setCircuit(circuit);
    circuit.setBulb(bulb);
  }

  /** ����̨�Ƶĵ��� */
  public void setBulb(Bulb bulb){
    this.bulb=bulb;
    bulb.setCircuit(circuit);
    circuit.setBulb(bulb);
  }

  public void on(){circuit.switchOn();}
  public void off(){circuit.switchOff();}

  public static void main(String args[]){
    Bulb bulb=new Bulb();
    Circuit circuit=new Circuit();
    ReadingLamp lamp=new ReadingLamp(bulb,circuit);
    lamp.on();
    lamp.off();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
