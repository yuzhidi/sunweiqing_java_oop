import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ATMPlayer extends JApplet implements Runnable {
  private int index=4;	//ͼƬ������
  private Thread changer;	//��̬�ı�ͼƬ���̣߳��γɶ���Ч��
  private boolean stopFlag=true;  //�����߳�������رյı�־
  private Image[] images; //��ų�ƱͼƬ
  private Image mouth; //�³���
  private JButton contrlButton=new JButton("  ��ʼȡ� ");

  public void init() {

    images=new Image[4];
    
    //��Ϊ����Ӧ�ó���ʱͨ��������δ���ӱ��ػ�������ͼƬ
    Toolkit tk=getToolkit();
    images[0]=tk.getImage(getClass().getResource("money1.jpg"));
    images[1]=tk.getImage(getClass().getResource("money2.jpg"));
    images[2]=tk.getImage(getClass().getResource("money3.jpg"));
    images[3]=tk.getImage(getClass().getResource("money4.jpg"));
    mouth=tk.getImage(getClass().getResource("mouth.jpg"));
    
/*
    //��ΪСӦ�ó���ʱͨ��������δ������������ͼƬ
    images[0]=getImage(getCodeBase(),"money1.jpg");
    images[1]=getImage(getCodeBase(),"money2.jpg");
    images[2]=getImage(getCodeBase(),"money3.jpg");
    images[3]=getImage(getCodeBase(),"money4.jpg");
    mouth=getImage(getCodeBase(),"mouth.jpg");
*/
    contrlButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(stopFlag)start();
        else stop();
    }});

    Container contentPane=getContentPane();
    contentPane.setBackground(Color.WHITE);
    contentPane.add(contrlButton, BorderLayout.NORTH);
  }

  public void start(){
    changer=new Thread(this);
    stopFlag=false;
    index=0;
    contrlButton.setText("  ������ ");
    changer.start();
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(mouth,100,45,this);
    synchronized(this){if(index<4)g.drawImage(images[index],107,50,this);}
  }

  public void stop(){
    stopFlag=true;
    contrlButton.setText("  ��ʼȡ� ");
  }

  public void run(){
    while(!stopFlag){
      repaint(); //The word will be redrawed with new fontSize
      try{
        if(index==3)Thread.sleep(500);
        else Thread.sleep(200);
      }catch(InterruptedException e){throw new RuntimeException(e);}

      if(++index>4) index=0;   //��ʾ��һ����Ƭ
    }

    index=4;
    repaint();  //ˢ��ͼ��
  }

  public static void main(String args[]){
    JFrame gui=new JFrame("ȡ���");
    ATMPlayer atm=new ATMPlayer();
    atm.init();

    gui.setContentPane(atm);
    gui.setSize(300,300);
    gui.setVisible( true );
    gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
