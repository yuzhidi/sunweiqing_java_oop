import java.awt.*;
import java.awt.event.*;
public class AdapterDemo extends Frame{
  private Dialog dialog;
  private Label label;

  public AdapterDemo(String title){
    super(title);

    dialog=new Dialog(this,"Note",true);
    label=new Label();
    dialog.add(label);
    dialog.setSize(100,100);

    dialog.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent evt){
      dialog.setVisible(false);  //���ػỰ��
    }
    });

    requestFocus();  //ʹFrame�ܹ������û��ļ�������

    addKeyListener(new KeyAdapter(){
      public void keyTyped(KeyEvent ev){
        char key=ev.getKeyChar();  
        label.setText("�û�ѡ��ļ�Ϊ: " +key);
        dialog.setVisible(true);  //��ʾ�Ự��
      }
    });

    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent evt){
         System.exit(0);  //��������
      }
    });

    setSize(300,300);
    setVisible(true);
  }

  public static void main(String args[]){
    new AdapterDemo("Hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
