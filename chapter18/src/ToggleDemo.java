import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ToggleDemo extends JFrame {
  private JTextArea area = new JTextArea(6, 15);
  private JScrollPane paneWithTextArea=new JScrollPane(area);
  private JPanel paneWithButtons=new JPanel();
  private JLabel label1=new JLabel("��Ȥ��");
  private JCheckBox
    cb1 = new JCheckBox("��Ӿ"),
    cb2 = new JCheckBox("����"),
    cb3 = new JCheckBox("����");

  private JLabel label2=new JLabel("�Ա�");
  private JRadioButton
    rb1 = new JRadioButton("��",true), //Ĭ��Ϊѡ��״̬
    rb2 = new JRadioButton("Ů");
  private ButtonGroup group=new ButtonGroup();

  private String sex="��";  //�Ա�
  private Set<String> hobbies=new HashSet<String>();  //��Ȥ����

  private ActionListener listener1 =new ActionListener(){  //����JCheckBox������ActionEvent
    public void actionPerformed(ActionEvent event){
         JCheckBox cb=(JCheckBox)event.getSource();
         if(cb.isSelected())
           hobbies.add(cb.getText());
         else
           hobbies.remove(cb.getText());
         printStatus();
    }
  };

  private ActionListener listener2 =new ActionListener(){ //����JRadioButton������ActionEvent
    public void actionPerformed(ActionEvent event){
         JRadioButton rb=(JRadioButton)event.getSource();
         sex=rb.getText();
         printStatus();
    }
  };

  public ToggleDemo(String title) {
    super(title);
    area.setEditable(false);
    cb1.addActionListener(listener1);
    cb2.addActionListener(listener1);
    cb3.addActionListener(listener1);
    rb1.addActionListener(listener2);
    rb2.addActionListener(listener2);
    //��JRadioButton���뵽һ��ButtonGroup��
    group.add(rb1);
    group.add(rb2);

    paneWithButtons.setLayout(new FlowLayout());
    paneWithButtons.add(label1);
    paneWithButtons.add(cb1);
    paneWithButtons.add(cb2);
    paneWithButtons.add(cb3);
    paneWithButtons.add(label2);
    paneWithButtons.add(rb1);
    paneWithButtons.add(rb2);

    Container contentPane = getContentPane();  //Ĭ�ϵĲ��ֹ�����ΪBorderLayout

    contentPane.add(paneWithButtons,BorderLayout.NORTH);
    contentPane.add(paneWithTextArea,BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
  private void printStatus(){
    area.append("������Ȥ���ð�����");
    Iterator<String> it=hobbies.iterator();
    while(it.hasNext())
      area.append(it.next()+" ");
    area.append("  �����Ա�Ϊ��"+sex+"\n" );
  }
  public static void main(String[] args) {
     new ToggleDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
