import java.awt.*;
import java.awt.event.*;
public class ButtonCounter extends Frame{
  private Button button=new Button("1");
  
  public ButtonCounter(String title){
    super(title);
    //ΪButtonע��ActionEvent�ļ�����
    button.addActionListener(new ActionListener(){  //����һ���ڲ���
        public void actionPerformed(ActionEvent evt){
          int count=Integer.parseInt(button.getLabel());
          button.setLabel(new Integer(++count).toString());  //��Button�ı�ż�1
        }
      }
    );

    add(button);
    setSize(100,100);
    setVisible(true);
  }
  public static void main(String args[]){
    new ButtonCounter("hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
