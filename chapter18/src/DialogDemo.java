import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
  private JLabel label=new JLabel("������������");
  private JTextField textField=new JTextField(10);
  private JButton button = new JButton("OK");

  public MyDialog(JFrame parent) {
    super(parent, "��ʾ", true);
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);
    contentPane.add(textField);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose(); // �رնԻ���
      }
    });
    contentPane.add(button);
    pack();
  }

  public String getText(){return textField.getText();}
}
public class DialogDemo extends JFrame {
  private JButton button = new JButton("�ύ");
  private MyDialog dialog = new MyDialog(this);
  private TextField textField = new TextField(10);

  public DialogDemo (String title) {
    super(title);
    textField.setEditable(false);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);  //��ʾ�Ի���
        textField.setText(dialog.getText());
      }
    });
    
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(button);
    contentPane.add(textField);
    setSize(500,300);
    setVisible( true );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   public static void main( String args[] ){
      new DialogDemo("DialogDemo");
   }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
