import java.awt.*;
import java.awt.event.*;
public class FlowLayoutDemo{
  public static void main(String args[]){
    final Frame f=new Frame("hello");
    final FlowLayout fl=new FlowLayout();
    
    f.setLayout(fl);  //ʹFrame����FlowLayout����

    Button leftButton=new Button("left");
    leftButton.addActionListener(new ActionListener(){  //ע���¼�������
       public void actionPerformed(ActionEvent event){
         fl.setAlignment(FlowLayout.LEFT);  //�����
         fl.layoutContainer(f);  //ʹFrame���²���
       }
    });
    Button centerButton=new Button("center");
    centerButton.addActionListener(new ActionListener(){  //ע���¼�������
       public void actionPerformed(ActionEvent event){
         fl.setAlignment(FlowLayout.CENTER);  //���ж���
         fl.layoutContainer(f);  //ʹFrame���²���
       }
    });
    Button rightButton=new Button("right");
    rightButton.addActionListener(new ActionListener(){  //ע���¼�������
       public void actionPerformed(ActionEvent event){
         fl.setAlignment(FlowLayout.RIGHT);  //�Ҷ���
         fl.layoutContainer(f); //ʹFrame���²���
       }
    });
    
    f.add(leftButton);
    f.add(centerButton);
    f.add(rightButton);
    f.setSize(200,100);
    f.setVisible(true);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
