import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyNotePad extends JFrame {
  private JTextField
    filenameTf = new JTextField(),
    dirTf = new JTextField();
  private JButton
    openBt = new JButton("��"),
    saveBt = new JButton("���Ϊ");
  private JPanel optPane=new JPanel();
  private JPanel navigatePane=new JPanel();
  private JTextArea contentTa=new JTextArea(5,20);

  public MyNotePad(String title) {
    super(title);

    openBt.addActionListener(new OpenHandler());
    saveBt.addActionListener(new SaveHandler());
    optPane.add(openBt);
    optPane.add(saveBt);

    dirTf.setEditable(false);
    filenameTf.setEditable(false);
    navigatePane.setLayout(new GridLayout(2,1));
    navigatePane.add(filenameTf);
    navigatePane.add(dirTf);

    Container contentPane = getContentPane();
    contentPane.add(optPane, BorderLayout.SOUTH);
    contentPane.add(navigatePane, BorderLayout.NORTH);
    contentPane.add(new JScrollPane(contentTa),BorderLayout.CENTER);

    setSize(500,300);
    setVisible( true );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   class OpenHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser jc = new JFileChooser();
      int rVal = jc.showOpenDialog(MyNotePad.this);  //��ʾ���ļ��ĶԻ���
      if(rVal == JFileChooser.APPROVE_OPTION) {
        File dir=jc.getCurrentDirectory();
        File file=jc.getSelectedFile();

        filenameTf.setText(file.getName());
        dirTf.setText(dir.toString());

        //���ı���������ʾ�ı��ļ�������
        contentTa.setText(read(new File(dir,file.getName())));
      }
      if(rVal == JFileChooser.CANCEL_OPTION) {
        filenameTf.setText("You pressed cancel");
        dirTf.setText("");
      }
    }
  }
  class SaveHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser jc = new JFileChooser();
      int rVal = jc.showSaveDialog(MyNotePad.this);  ////��ʾ�����ļ��ĶԻ���
      if(rVal == JFileChooser.APPROVE_OPTION) {
        File dir=jc.getCurrentDirectory();
        File file=jc.getSelectedFile();

        filenameTf.setText(file.getName());
        dirTf.setText(dir.toString());
        write(new File(dir,file.getName()),contentTa.getText());
      }
      if(rVal == JFileChooser.CANCEL_OPTION) {
        filenameTf.setText("You pressed cancel");
        dirTf.setText("");
      }
    }
  }

  private String read(File file){  //���ı��ļ�
    try{
      BufferedReader reader=new BufferedReader(
                    new InputStreamReader(new FileInputStream(file),"GBK"));
      String data=null;
      StringBuffer buffer=new StringBuffer();
      while((data=reader.readLine())!=null)
         buffer.append(data+"\n");
      reader.close();
      return buffer.toString();
    }catch(IOException e){ throw new RuntimeException(e);}
  }

  private void write(File file,String str){  //д�ı��ļ�
    try{
      PrintWriter writer=new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(file),"GBK"));
      writer.println(str);
      writer.close();
    }catch(IOException e){throw new RuntimeException(e);}
  }

   public static void main( String args[] ){
      new MyNotePad("���±�");
   }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
