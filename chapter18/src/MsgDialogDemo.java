import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MsgDialogDemo extends JFrame {
  private JButton[] b = {
    new JButton("Alert"), new JButton("Yes/No"),
    new JButton("Color"), new JButton("Input"),
    new JButton("Fruit")
  };
  private JTextField txt = new JTextField(15);
  
  private ActionListener al = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      String id = ((JButton)e.getSource()).getText();
      if(id.equals("Alert"))
        JOptionPane.showMessageDialog(null,
          "����ļ��п����в���!", "����",
          JOptionPane.ERROR_MESSAGE);

      else if(id.equals("Yes/No")){
        int sel=JOptionPane.showConfirmDialog(null,
          "��Ҫ�����ļ���", "��ʾ",
          JOptionPane.YES_NO_OPTION);

        txt.setText(sel==JOptionPane.YES_OPTION?"��Ҫ�����ļ�":"����Ҫ�����ļ�");

      }else if(id.equals("Color")) {
        Object[] options = { "Red", "Green" ,"Blue"};
        int sel = JOptionPane.showOptionDialog(
          null, "��ѡ������ϲ������ɫ!", "ѡ����ɫ",
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.WARNING_MESSAGE, null,
          options, options[0]);
        if(sel != JOptionPane.CLOSED_OPTION)
          txt.setText("��ѡ�����ɫ��: " + options[sel]);

      } else if(id.equals("Input")) {
        String val = JOptionPane.showInputDialog(
            "�㻹��ʲô��Ҫ˵?");
        txt.setText(val);

      }else if(id.equals("Fruit")) {
        Object[] selections = {"Apple", "Orange", "Banana"};
        Object val = JOptionPane.showInputDialog(
          null, "��ѡ������ϲ����ˮ��!", "ѡ��ˮ��",
          JOptionPane.INFORMATION_MESSAGE,
          null, selections, selections[0]);
        if(val != null)
          txt.setText(val.toString());
      }
    }
  };
  public MsgDialogDemo(String title) {
    super(title);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    for(int i = 0; i < b.length; i++) {
      b[i].addActionListener(al);
      contentPane.add(b[i]);
    }
    contentPane.add(txt);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
     new MsgDialogDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
