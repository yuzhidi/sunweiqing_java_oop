public class Bulb{
  private Circuit circuit;
  public void setCircuit(Circuit circuit){
    this.circuit=circuit; 
  }
  public void light(){
    circuit.transportPower(); 
  }
  public void goOut(){System.out.println("go out");}
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
