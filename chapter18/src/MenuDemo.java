import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MenuDemo extends JFrame {
 private final Color colorValues[] ={ Color.BLACK, Color.BLUE,Color.RED, Color.GREEN };
   private JRadioButtonMenuItem colorItems[], fonts[];
   private JCheckBoxMenuItem styleItems[];
   private JLabel displayLabel;
   private ButtonGroup fontGroup, colorGroup;
   private int style;

  public MenuDemo(String title) {
    super(title);
      JMenu fileMenu = new JMenu( "File" );
      fileMenu.setMnemonic( 'F' );  //���ÿ�ݼ�

      JMenuItem aboutItem = new JMenuItem( "About..." );
      aboutItem.setMnemonic( 'A' );  //���ÿ�ݼ�
      fileMenu.add( aboutItem );
      aboutItem.addActionListener(
         new ActionListener() {
            // ��ʾһ����Ϣ�Ի���
            public void actionPerformed( ActionEvent event ){
               JOptionPane.showMessageDialog( MenuDemo.this,
                  "������������ʾ�˵����÷�",
                  "About", JOptionPane.PLAIN_MESSAGE );
            }
      });

      JMenuItem exitItem = new JMenuItem( "Exit" );
      exitItem.setMnemonic( 'x' );
      fileMenu.add( exitItem );
      exitItem.addActionListener(
         new ActionListener() {
           public void actionPerformed( ActionEvent event ){
               System.exit( 0 );
           }
       });

      JMenuBar bar = new JMenuBar();
      setJMenuBar( bar );  //��Frame�����ò˵���
      bar.add( fileMenu );

      JMenu formatMenu = new JMenu( "Format" );
      formatMenu.setMnemonic( 'r' );

      String colors[] = { "Black", "Blue", "Red", "Green" };
      JMenu colorMenu = new JMenu( "Color" );
      colorMenu.setMnemonic( 'C' );

      colorItems = new JRadioButtonMenuItem[ colors.length ];
      colorGroup = new ButtonGroup();
      ItemHandler itemHandler = new ItemHandler();

      for ( int count = 0; count < colors.length; count++ ) {
         colorItems[ count ] =
            new JRadioButtonMenuItem( colors[ count ] );
         colorMenu.add( colorItems[ count ] );
         colorGroup.add( colorItems[ count ] );
         colorItems[ count ].addActionListener( itemHandler );
      }

      colorItems[ 0 ].setSelected( true );
      formatMenu.add( colorMenu );
      formatMenu.addSeparator();

      String fontNames[] = { "Serif", "Monospaced", "SansSerif" };
      JMenu fontMenu = new JMenu( "Font" );
      fontMenu.setMnemonic( 'n' );
      fonts = new JRadioButtonMenuItem[ fontNames.length ];
      fontGroup = new ButtonGroup();

      for ( int count = 0; count < fonts.length; count++ ) {
         fonts[ count ] = new JRadioButtonMenuItem( fontNames[ count ] );
         fontMenu.add( fonts[ count ] );
         fontGroup.add( fonts[ count ] );
         fonts[ count ].addActionListener( itemHandler );
      }

      fonts[ 0 ].setSelected( true );
      fontMenu.addSeparator(); //���÷ָ���

      String styleNames[] = { "Bold", "Italic" };
      styleItems = new JCheckBoxMenuItem[ styleNames.length ];
      StyleHandler styleHandler = new StyleHandler();

      for ( int count = 0; count < styleNames.length; count++ ) {
         styleItems[ count ] =new JCheckBoxMenuItem( styleNames[ count ] );
         fontMenu.add( styleItems[ count ] );
         styleItems[ count ].addItemListener( styleHandler );
      }

      formatMenu.add( fontMenu );
      bar.add( formatMenu );

      displayLabel = new JLabel( "Hello World", SwingConstants.CENTER );
      displayLabel.setForeground( colorValues[ 0 ] );
      displayLabel.setFont( new Font( "Serif", Font.PLAIN, 72 ) );

      getContentPane().setBackground(Color.WHITE);
      getContentPane().add( displayLabel, BorderLayout.CENTER );

      setSize( 500, 200 );
      setVisible( true );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   public static void main( String args[] ){
      new MenuDemo("Hello");
   }

   // ����MenuItem���¼�
   private class ItemHandler implements ActionListener {
      public void actionPerformed( ActionEvent event ){
         // ������ɫ
         for ( int count = 0; count < colorItems.length; count++ )
            if ( colorItems[ count ].isSelected() ) {
               displayLabel.setForeground( colorValues[ count ] );
               break;
            }

         // ��������
         for ( int count = 0; count < fonts.length; count++ )
            if ( event.getSource() == fonts[ count ] ) {
               displayLabel.setFont( new Font( fonts[ count ].getText(), style, 72 ) );
               break;
            }
         repaint();
      }
   }

   // ����ѡ�˵�����¼�
   private class StyleHandler implements ItemListener {
      public void itemStateChanged( ItemEvent e ){
         style = 0;

         if ( styleItems[ 0 ].isSelected() )style += Font.BOLD;
         if ( styleItems[ 1 ].isSelected() ) style += Font.ITALIC;
         displayLabel.setFont(new Font( displayLabel.getFont().getName(), style, 72 ) );

         repaint();
      }
   }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
