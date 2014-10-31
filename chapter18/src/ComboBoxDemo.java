import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame {
 private String[] cities = {
    "����", "�Ϻ�", "�Ͼ�", "����",
    "����", "����", "����", "����","����"
  };
  private JTextField textField = new JTextField(15);
  private JComboBox comboBox = new JComboBox();
  private JButton button = new JButton("��Ӹ������ѡ��");
  private int count = 0;

  public ComboBoxDemo(String title) {
    super(title);
    for(int i = 0; i < 4; i++)
      comboBox.addItem(cities[count++]);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(count < cities.length)
          comboBox.addItem(cities[count++]);
      }
    });
    comboBox.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textField.setText("index: "+ comboBox.getSelectedIndex() + "   " +
        comboBox.getSelectedItem());
      }
    });

    comboBox.setEditable(true);  //ʹ�����б���Ա��༭
    textField .setEditable(false);
   
Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(comboBox);
    contentPane.add(button);
    contentPane.add(textField);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
     new ComboBoxDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
