import java.awt.*;
public class ManualLayout {
  public static void main(String args[]){  
    Frame f=new Frame("hello");
    f.setLayout(null);  //ȡ�����ֹ�����
    f.setSize(300,100);  //��300����100
    Button b=new Button("press me");
    b.setSize(100,30);  //��100����30
    b.setLocation(40,60); //x����40,y����60
    f.add(b);
    f.setVisible(true);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
