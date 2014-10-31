import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class BordersDemo extends JFrame{

  /** ���ղ���ָ���ı߿򴴽�һ��JPanel���� */
  public static JPanel getPanelWithBorder(Border b) {
    JPanel jp = new JPanel();
    jp.setLayout(new BorderLayout());
    String nm = b.getClass().toString();
    nm = nm.substring(nm.lastIndexOf('.') + 1);
    //��JPanel������һ��JLabel������ʾ�߿��������
    jp.add(new JLabel(nm, JLabel.CENTER),BorderLayout.CENTER);
    jp.setBorder(b);  //����JPanel�ı߿�
    return jp;
  }

  public BordersDemo(String title) {
    super(title);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(2,4));
    contentPane.add(getPanelWithBorder (new TitledBorder("Title")));
    contentPane.add(getPanelWithBorder (new EtchedBorder()));
    contentPane.add(getPanelWithBorder (new LineBorder(Color.BLUE)));
    contentPane.add(getPanelWithBorder(
      new MatteBorder(5,5,30,30,Color.PINK)));
    contentPane.add(getPanelWithBorder (
      new BevelBorder(BevelBorder.RAISED)));
    contentPane.add(getPanelWithBorder (
      new SoftBevelBorder(BevelBorder.LOWERED)));
    contentPane.add(getPanelWithBorder(new CompoundBorder(
      new EtchedBorder(),
      new LineBorder(Color.BLUE))));

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);

  }
  public static void main(String[] args) {
   new BordersDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
