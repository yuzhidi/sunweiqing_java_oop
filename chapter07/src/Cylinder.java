public class Cylinder{  //Բ����
  private double r; //�뾶
  private double h; //��
  public static final double PI=3.14;

  public Cylinder(double r,double h){this.r=r;this.h=h;}
  
  public double getCircumference(){ //����Բ���������ܳ�
    return 2*PI*r;
  }
  public double getBottomArea(){  //����Բ�����������
    return PI*r*r;
  }
  
  public double getAllArea(){  //��������Բ��������
    return 2*PI*r*r+2*PI*r*h;
  }
  public double getVolume(){  //��������Բ��������
    return PI*r*r*h;
  }   
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
