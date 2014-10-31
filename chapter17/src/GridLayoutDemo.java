import java.awt.*;
import java.awt.event.*;
public class GridLayoutDemo extends Frame{
  private final String names[]={"one","two","three","four","five","six"};
  private Button[] buttons=new Button[6];
  private boolean flag=true;
  final GridLayout layout1=new GridLayout(2,3,5,10);
  final GridLayout layout2=new GridLayout(3,2);

  public GridLayoutDemo(String title){
    super(title);
    setLayout();
    ActionListener listener=new ActionListener(){
        public void actionPerformed(ActionEvent event){
           setLayout();  //�л����񲼾�
           GridLayoutDemo.this.validate();  //ʹ�µĲ�����Ч
         }
    };

    for(int i=0;i<buttons.length;i++){
      buttons[i]=new Button(names[i]);
      buttons[i].addActionListener(listener);
      add(buttons[i]);
    }

    setSize(250,250);
    setVisible(true);
  }

  private void setLayout(){
    if(flag)
      setLayout(layout1);
    else
      setLayout(layout2);

    flag=!flag;
  }
  public static void main(String args[]){
     new GridLayoutDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
