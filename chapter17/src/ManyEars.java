import java.awt.*;
import java.awt.event.*;
public class ManyEars extends Frame{
  private Button button=new Button("test");
  private TextArea textArea=new TextArea(40,20);

  public ManyEars (String title){
    super(title);

    // Buttonע��1��MouseListener��������5��ActionListener������
    for(int i=0;i<5;i++)button.addActionListener(new ListenerA());
    button.addMouseListener(new ListenerB());

    add(button,BorderLayout.NORTH);
    add(textArea,BorderLayout.CENTER);
    pack();
    setVisible(true);
  }

  private void print(String str){
    textArea.setText(textArea.getText()+str+"\n");
  }

  private static int count;  //ͳ��ListenerA��ʵ������Ŀ
  class ListenerA implements ActionListener{
    private int serialNumber;
    public ListenerA(){count++;serialNumber=count;}
    public void actionPerformed(ActionEvent evt){
      print("ListenerA"+serialNumber+" receives ActionEvent.");
     }
  }

  class ListenerB extends MouseAdapter{
    public void mousePressed(MouseEvent evt){
      //������е���Buttonע���ActionListener
      ActionListener[] listeners=(ActionListener[])button.getListeners(ActionListener.class);
      print("ListenerB receives MouseEvent.");
      //��Button��ע��һ��ActionListener
      if(listeners.length>0)button.removeActionListener(listeners[0]);
      print("There are "+(listeners.length>0?listeners.length-1:0)+" ListenerA.");
    }
  }

  public static void main(String args[]){
    new ManyEars("hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
