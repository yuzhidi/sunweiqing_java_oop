import java.awt.*;
public class SimplePanel{
  public static void main(String args[]){
    Frame f=new Frame("hello");
    Panel p=new Panel();
    p.add(new Button("press me"));
    p.setBackground(Color.YELLOW);  //����Panel�ı�����ɫ
    f.add(p);  //��Panel���뵽Frame��
    f.setSize(100,100);
    f.setBackground(Color.BLUE);  //����Frame�ı�����ɫ
    f.setVisible(true);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
