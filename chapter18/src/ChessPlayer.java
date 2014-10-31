import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChessPanel extends JPanel{
  private int space=20; //�����ľ���
  private int grids=30; //���̵�������
  private int radius=space/2; //��İ뾶

  //��chesses[i][j]=0,��ʾ����ڵ�(i,j)������
  //��chesses[i][j]=1,��ʾ����ڵ�(i,j)�ϷŰ���
  //��chesses[i][j]=2,��ʾ����ڵ�(i,j)�Ϸź���
  private int[][] chesses=new int[grids+1][grids+1];
  private int currColor=1; //��ǰ�����ɫ

  private JMenuBar chessMenuBar=new JMenuBar();
  private JMenu optMenu=new JMenu("����");
  private JMenuItem startMenuItem=new JMenuItem("��ʼ");
  private JMenuItem exitMenuItem=new JMenuItem("�˳�");

  private ActionListener startHandler=new ActionListener(){
    public void actionPerformed(ActionEvent e){
       clearGrids();  //�������
       currColor=1;
       repaint(); //ˢ��ͼ��
    }
  };
  private ActionListener exitHandler=new ActionListener(){
    public void actionPerformed(ActionEvent e){
      System.exit(0);
    }
  };

   private MouseListener playChessHandler=new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
      int x=e.getX();
      int y=e.getY();
      //��һ������
      if(x<=grids*space && x>=0 && y<=grids*space && y>=0)
        if(chesses[round(x)][round(y)]==0){
          chesses[round(x)][round(y)]=currColor;
          currColor=currColor==1?2:1;  //�л����ӵ���ɫ
          repaint();  //ˢ��ͼ��
        }
    }
  };

  public int round(float a){  //��ýӽ�a������ڵ�����
    float f=a/space;
    return Math.round(f);
  }
  public ChessPanel(int space,int grids){
    this.space=space;
    this.grids=grids;
    this.radius=space/2;

    setBackground(Color.YELLOW);
    setSize(space*grids,space*grids);
    startMenuItem.addActionListener(startHandler);
    exitMenuItem.addActionListener(exitHandler);
    addMouseListener(playChessHandler);

    chessMenuBar.add(optMenu);
    optMenu.add(startMenuItem);
    optMenu.add(exitMenuItem);
   }

  public JMenuBar getMenuBar(){
    return chessMenuBar;
  }
  /** ��һ������ */
  private void drawChess(Graphics g,int x,int y,int color){
    g.setColor(color==1?Color.WHITE:Color.BLACK);
    g.fillOval(x*space-radius,y*space-radius,radius*2,radius*2);
  }
  /**��������*/
  private void drawGrids(Graphics g){
    g.setColor(Color.DARK_GRAY);
    for(int i=0;i<=grids;i++){
      g.drawLine(0,i*space,grids*space,i*space);
      g.drawLine(i*space,0,i*space,grids*space);
    }
  }

  /** ������� */
  private void clearGrids(){
     for(int i=0;i<=grids;i++)
      for(int j=0;j<=grids;j++)
        chesses[i][j]=0;
  }

  public void paintComponent(Graphics g){  //����paintComponent()����
    super.paintComponent(g); //�����ȵ��ø���ķ���

    drawGrids(g);  //������
    for(int i=0;i<=grids;i++)
      for(int j=0;j<=grids;j++)
        if(chesses[i][j]!=0)
          drawChess(g,i,j,chesses[i][j]);  //������
  }
}

public class ChessPlayer extends JFrame {
  private ChessPanel chessPanel=new ChessPanel(20,30);

  public ChessPlayer(String title) {
    super(title);

    Container contentPane = getContentPane();
    contentPane.add(chessPanel);
    setJMenuBar(chessPanel.getMenuBar());

    setSize(600,600);
    setVisible( true );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public static void main( String args[] ){
      new ChessPlayer("������/Χ��");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
