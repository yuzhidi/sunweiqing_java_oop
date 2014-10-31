import java.awt.*;
import java.awt.event.*;
public class BorderLayoutDemo extends Frame{
  private final String names[]={"Hide North","Hide South","Hide East","Hide West","Hide Center"};
  private final String locations[]={BorderLayout.NORTH,BorderLayout.SOUTH,
BorderLayout.EAST,BorderLayout.WEST,BorderLayout.CENTER};
  private Button[] buttons=new Button[5];

  public BorderLayoutDemo(String title){
    super(title);
    final BorderLayout layout=(BorderLayout)this.getLayout();
    ActionListener listener=new ActionListener(){  //�¼�������
        public void actionPerformed(ActionEvent event){
           for(int i=0;i<buttons.length;i++)
             if(event.getSource()==buttons[i])
               buttons[i].setVisible(false);  //�����û�ѡ��İ�ť
             else
               buttons[i].setVisible(true);
           layout.layoutContainer(BorderLayoutDemo.this);  //���µ���Frame�Ĳ���
        }
     };

    for(int i=0;i<buttons.length;i++){
      buttons[i]=new Button(names[i]);
      buttons[i].addActionListener(listener);
      add(buttons[i],locations[i]);
    }
    setSize(250,250);
    setVisible(true);
  }

  public static void main(String args[]){
     new BorderLayoutDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
