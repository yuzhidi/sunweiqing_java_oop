import javax.swing.*;
import java.awt.*;
public class BoxLayoutDemo extends JFrame {
   public BoxLayoutDemo(String title){
      super( title);

      //����ʹ��BoxLayout��Box
      Box horizontal1 = Box.createHorizontalBox();
      Box vertical1 = Box.createVerticalBox();
      Box horizontal2 = Box.createHorizontalBox();
      Box vertical2 = Box.createVerticalBox();

      final int SIZE = 3; // ÿ��Box�е�Button��Ŀ

      // ���һ��ˮƽBox�м���Button
      for ( int count = 0; count < SIZE; count++ )
         horizontal1.add( new JButton( "Button " + count ) );

      //���һ����ֱBox�м���Button��Strut
      for ( int count = 0; count < SIZE; count++ ) {
         vertical1.add( Box.createVerticalStrut( 25 ) );
         vertical1.add( new JButton( "Button " + count ) );
      }

      //��ڶ���ˮƽBox�м���Button��Glue
      for ( int count = 0; count < SIZE; count++ ) {
         horizontal2.add( Box.createHorizontalGlue() );
         horizontal2.add( new JButton( "Button " + count ) );
      }

      //���һ����ֱBox�м���Button��Rigid Area
      for ( int count = 0; count < SIZE; count++ ) {
         vertical2.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
         vertical2.add( new JButton( "Button " + count ) );
      }

      //��һ��Panel���ش�ֱ�������Button��Glue
      JPanel panel = new JPanel();
      panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );

      for ( int count = 0; count < SIZE; count++ ) {
         panel.add( Box.createGlue() );
         panel.add( new JButton( "Button " + count ) );
      }

      //ʹ��ǩһ�����й�����ǩ�� 
      JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, 
JTabbedPane.SCROLL_TAB_LAYOUT );

      tabs.addTab( "Horizontal Box1", horizontal1 );
      tabs.addTab( "Vertical Box1 with Struts", vertical1 );
      tabs.addTab( "Horizontal Box2 with Glue", horizontal2 );
      tabs.addTab( "Vertical Box2 with Rigid Areas", vertical2 );
      tabs.addTab( "Vertical Box with Glue", panel );

      getContentPane().add( tabs );

      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setSize( 400, 300 );
      setVisible( true );

   }
   public static void main( String args[] ){
     new BoxLayoutDemo("BoxLayoutDemo");
   }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
