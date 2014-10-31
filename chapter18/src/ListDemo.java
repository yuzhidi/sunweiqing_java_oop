import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ListDemo extends JFrame {
  private String[] cities = {
    "����", "�Ϻ�", "�Ͼ�", "����",
    "����", "����", "����", "����","����"
  };

  private JList list = new JList(cities);
  private JTextArea textArea =new JTextArea(5, 20);

  private ListSelectionListener listener =
    new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        if(e.getValueIsAdjusting()) return;
        textArea.setText("");
        Object[] items=list.getSelectedValues();
        for(int i = 0; i < items.length; i++)
          textArea.append(items[i] + "\n");
      }
    };

  public ListDemo(String title) {
    super(title);
    textArea.setEditable(false);
    list.setVisibleRowCount(5);  //�ڽ�������ʾ5��ѡ��
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    contentPane.add(textArea);
    contentPane.add(new JScrollPane(list)); //��������
    list.addListSelectionListener(listener);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
     new ListDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
