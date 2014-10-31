import java.awt.*;
import java.awt.event.*;
public class FrameCounter extends Frame implements ActionListener{
  private Button button=new Button("1");

  public FrameCounter(String title){
    super(title);
    //��FrameCounter�����ʵ��ע��ΪButton�ļ�����
    button.addActionListener(this);

    add(button);
    setSize(100,100);
    setVisible(true);
  }

  /** ʵ��ActionListener��actionPerformed()���� */
  public void actionPerformed(ActionEvent evt){
     int count=Integer.parseInt(button.getLabel());
     button.setLabel(new Integer(++count).toString());  //��Button�ϵı�ż�1
  }

  public static void main(String args[]){
    new FrameCounter("hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
