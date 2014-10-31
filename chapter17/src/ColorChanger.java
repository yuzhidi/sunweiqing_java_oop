import java.awt.*;
import java.awt.event.*;
public class ColorChanger extends Frame {
  private Color color=Color.RED;
  private int times; //���ٵ���update()�����Ĵ���
  public ColorChanger(String title){
    super(title);
    Button button=new Button("change color");
    button.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        color=(color==Color.RED)?Color.GREEN:Color.RED;  //�������ʵ���ɫ
        repaint();  //ˢ�����
      }
    });

    add(button,BorderLayout.NORTH);
    setSize(300,300);
    setVisible(true);

  }
  public void update(Graphics g){
     super.update(g);
     //����update()���������õĴ���
     System.out.println("call update "+(++times)+" times");
  }

  public void paint(Graphics g){
    g.setColor(color);  //���û��ʵ���ɫ
    g.fillRect(0,0,300,300);  //��һ������
  }
  public static void main(String args[]){
    new ColorChanger("hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
