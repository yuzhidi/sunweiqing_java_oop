import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class TextAreaDemo extends JFrame {
  JTextArea area1=new JTextArea(5,10);  //����5��10�е��ı�����
  JTextArea area2=new JTextArea(5,10);  //����5��10�е��ı�����

  //�ڴ�ֱ����������ʾ����������ˮƽ����ֻ�е���Ҫ��ʱ�����ʾ������
JScrollPane pane1=new JScrollPane(area1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                               JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  
  //panel2��Ĭ�Ϸ�ʽ�������ڴ�ֱ��ˮƽ����ֻ�е���Ҫ��ʱ�����ʾ������
  JScrollPane pane2=new JScrollPane(area2);
  JButton copyButton=new JButton("Copy");
  public TextAreaDemo(String title) {
    super(title);
    copyButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //�ѵ�һ���ı������б�ѡ�е��ı��������ڶ����ı�������
        area2.setText(area1.getSelectedText());
      }
    });
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(pane1);
    contentPane.add(copyButton);
    contentPane.add(pane2);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);

  }
  public static void main(String[] args) {
   new TextAreaDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
