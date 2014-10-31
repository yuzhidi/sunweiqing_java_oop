import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LookAndFeelDemo extends JFrame {
   private UIManager.LookAndFeelInfo looks[]; 
   private String[] lookNames;  //������۵�����
   private String[] items={"Apple","Orange","Banana"};
   private JRadioButton radio[];
   private ButtonGroup group;
   private JButton button;
   private JLabel label;
   private JComboBox comboBox;

   public LookAndFeelDemo(String title){
      super(title);

      // ���UIManager��֧�ֵ����������Ϣ
      looks = UIManager.getInstalledLookAndFeels();
      lookNames=new String[looks.length];
      for(int i=0;i<looks.length;i++){
        System.out.println(looks[i].getName()+" :"+looks[i].getClassName());
        lookNames[i]=looks[i].getName();
      }

      Container contentPane = getContentPane();

      JPanel northPanel = new JPanel();
      northPanel.setLayout( new GridLayout( 3, 1, 0, 5 ) );

      label = new JLabel( "This is a Metal look-and-feel",SwingConstants.CENTER );
      northPanel.add( label );

      button = new JButton( "JButton" );
      northPanel.add( button );

      comboBox = new JComboBox(items );
      northPanel.add( comboBox );

      radio = new JRadioButton[ lookNames.length ];
      JPanel southPanel = new JPanel();
      southPanel.setLayout( new GridLayout( 1, radio.length ) );

      group = new ButtonGroup();
      ItemHandler handler = new ItemHandler();

      for ( int count = 0; count < radio.length; count++ ) {
         radio[ count ] = new JRadioButton( lookNames[ count ] );
         radio[ count ].addItemListener( handler );
         group.add( radio[ count ] );
         southPanel.add( radio[ count ] );
      }

      contentPane.add( northPanel, BorderLayout.NORTH );
      contentPane.add( southPanel, BorderLayout.SOUTH );

      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 300, 200 );
      setVisible( true );

      radio[ 0 ].setSelected( true );
   }

   private void changeTheLookAndFeel( int index ){
      try {  //�ı�������
         UIManager.setLookAndFeel( looks[ index ].getClassName() );
         SwingUtilities.updateComponentTreeUI( this );
      }catch ( Exception e) {
         e.printStackTrace();
      }
   }

   public static void main( String args[] ){
      new LookAndFeelDemo("LookAndFeelSample");
   }

   //���û�ѡ����RadioButton�������������������
   private class ItemHandler implements ItemListener {
      // �����û�ѡ������
      public void itemStateChanged( ItemEvent event ){
         for ( int count = 0; count < radio.length; count++ )
            if ( radio[ count ].isSelected() ) {
               label.setText( "This is a " +lookNames[ count ] + " look-and-feel" );
               changeTheLookAndFeel( count );
            }
      }
   }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
