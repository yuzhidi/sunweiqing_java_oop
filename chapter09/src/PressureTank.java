public class PressureTank {
  private int pressure;  //��ǰѹ��
  private static final int SAFE_PRESSURE=2;  //������ѹ������2������ѹ���ɴ򿪹���
  private static final int CRITICAL_POINT=3;  //��ըʱ��ѹ���ٽ��Ϊ3������ѹ

  public boolean isSafeForOpen(){
    return pressure<=SAFE_PRESSURE;
  }
  
public void exhaust(){  //����
    pressure=SAFE_PRESSURE;
  }

  public void open(){  //�򿪹���
    if(pressure>=CRITICAL_POINT)throw new ExplosionException();
  }

  public void cook(){ 
    pressure=CRITICAL_POINT;
  }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
