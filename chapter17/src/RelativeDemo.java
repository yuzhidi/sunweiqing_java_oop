import java.awt.*;
import java.util.*;
public class RelativeDemo extends Frame {
  public RelativeDemo(String title) {
    super(title);

    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    setLayout(gridbag);
    c.fill = GridBagConstraints.BOTH;
    c.weightx =1;
    addComponent("Button1", gridbag, c);
    addComponent("Button2", gridbag, c);
    addComponent("Button3", gridbag, c);
    c.gridwidth = GridBagConstraints.REMAINDER; //���һ�����
    addComponent("Button4", gridbag, c);
    c.weightx = 0.0; //�ָ�ΪĬ��ֵ
    addComponent("Button5", gridbag, c); 
    c.gridwidth = GridBagConstraints.RELATIVE; //�����ڶ������
    addComponent("Button6", gridbag, c);
    c.gridwidth = GridBagConstraints.REMAINDER; //���һ�����
    addComponent("Button7", gridbag, c);

    c.gridwidth = 1; //�ָ�ΪĬ��ֵ
    c.gridheight = 2;
    c.weighty = 1.0;
    addComponent("Button8", gridbag, c);
    c.weighty = 0.0; //�ָ�ΪĬ��ֵ
    c.gridwidth = GridBagConstraints.REMAINDER; //���һ�����
    c.gridheight = 1; //�ָ�ΪĬ��ֵ
    addComponent("Button9", gridbag, c);
    addComponent("Button10", gridbag, c);

    pack();
    setVisible(true);
  }
  protected void addComponent(String name,
                            GridBagLayout gridbag,
                            GridBagConstraints c) {
    Button button = new Button(name);
    gridbag.setConstraints(button, c);
    add(button);
  }
  public static void main(String args[]) {
     new RelativeDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
