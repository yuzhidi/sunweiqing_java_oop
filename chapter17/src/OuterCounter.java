import java.awt.*;
import java.awt.event.*;
public class OuterCounter extends Frame{
  private Button button=new Button("1");

  public OuterCounter(String title){
    super(title);
    //��MyListener��ʵ��ע��ΪButton�ļ�����
    button.addActionListener(new MyListener(2));

    add(button);
    setSize(100,100);
    setVisible(true);
  }

  public static void main(String args[]){
    new OuterCounter("hello");
  }
}

class MyListener implements ActionListener{
  private int step;  //����Button�ϵı��ÿ�����ӵĲ���
  public MyListener(int step){this.step=step;}

  /** ʵ��ActionListener��actionPerformed()���� */
  public void actionPerformed(ActionEvent evt){
     Button button=(Button)evt.getSource();  //����¼�Դ
     int count=Integer.parseInt(button.getLabel());
     button.setLabel(new Integer(step+count).toString());  //��Button�ϵı�ż�step
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
