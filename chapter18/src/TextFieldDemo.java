import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldDemo extends JFrame {
  private JButton
    b1 = new JButton("�����ı�"),
    b2 = new JButton("����");
  private JTextField
    t1 = new JTextField(30),
    t2 = new JTextField(30),
    t3 = new JTextField(30);
  private String str = new String(); //����û���ǰѡ����ı�
  private UpperCaseDocument ucd = new UpperCaseDocument();

  public TextFieldDemo(String title) {
    super(title);
    b1.addActionListener(new ActionListenerB1());
    b2.addActionListener(new ActionListenerB2());

    t1.setDocument(ucd); //JTextField��UpperCaseDocument����
    //���ı����е����ݷ����仯ʱ����DocumentEvent�¼�
    ucd.addDocumentListener(new DocumentListenerT());

    //���û����ı���������س�����ActionEvent�¼�
    t1.addActionListener(new ActionListenerT());

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4,1));
    JPanel buttonPanel=new JPanel();
    buttonPanel.add(b1);
    buttonPanel.add(b2);
    contentPane.add(buttonPanel);
    contentPane.add(t1);
    contentPane.add(t2);
    contentPane.add(t3);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);

  }
  class DocumentListenerT implements DocumentListener {  //������һ��JTextField���ĵ��¼�
    public void changedUpdate(DocumentEvent e) {}
    public void insertUpdate(DocumentEvent e) {
      t2.setText(t1.getText());
      t3.setText("Text: "+ t1.getText());
    }
    public void removeUpdate(DocumentEvent e) {
      t2.setText(t1.getText());
    }
  }
  class ActionListenerT implements ActionListener {  //������һ��JTextField��ActionEvent�¼�
    private int count = 0;
    public void actionPerformed(ActionEvent e) {
      t3.setText("t1 Action Event " + count++);
    }
  }
  class ActionListenerB1 implements ActionListener {  //������һ��JButton
    public void actionPerformed(ActionEvent e) {
       t1.setEditable(true);  //ʹTextField���Ա��༭
    }
  }
  class ActionListenerB2 implements ActionListener {  //�����ڶ���JButton
    public void actionPerformed(ActionEvent e) {
      if(t1.getSelectedText() == null)
        str = t1.getText();
      else
        str = t1.getSelectedText();

      ucd.setUpperCase(false);
      t1.setText("Inserted by Button 2: " + str);
      ucd.setUpperCase(true);
      t1.setEditable(false);  //ʹTextField�����Ա��༭
    }
  }
  public static void main(String[] args) {
   new TextFieldDemo("Hello");
  }
}


class UpperCaseDocument extends PlainDocument {
  private boolean upperCase = true;
  public void setUpperCase(boolean flag) {
    upperCase = flag;
  }
  public void insertString(int offset, String str, AttributeSet attSet)
                          throws BadLocationException {
    if(upperCase) str = str.toUpperCase();
    super.insertString(offset, str, attSet);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
