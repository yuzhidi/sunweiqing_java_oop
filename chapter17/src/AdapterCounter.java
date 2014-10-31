import java.awt.event.*;
import java.awt.*;
public class AdapterCounter extends Frame{
  private Button button=new Button("1");

  public AdapterCounter(String title){
    super(title);
    //��MyMouseListener��ʵ��ע��ΪButton�ļ�����
    button.addMouseListener(new MyMouseListener(2));

    add(button);
    setSize(100,100);
    setVisible(true);
  }

  public static void main(String args[]){
    new AdapterCounter("hello");
  }
}

class MyMouseListener extends MouseAdapter{
  private int step;  //����Button�ϵı��ÿ�����ӵĲ���
  public MyMouseListener(int step){this.step=step;}
  public void mousePressed(MouseEvent evt){
     Button button=(Button)evt.getSource();
     int count=Integer.parseInt(button.getLabel());
     button.setLabel(new Integer(step+count).toString());  //��Button�ϵı�ż�step
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
