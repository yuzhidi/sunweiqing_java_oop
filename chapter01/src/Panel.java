import java.io.*;
public class Panel {

  public void selectShape()throws Exception{
    System.out.println("��������״���ͣ�");

    //�ӿ���̨��ȡ�û�������״����
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int shapeType=Integer.parseInt(input.readLine());

    //�����״ʵ��
    Shape shape=ShapeFactory.getShape(shapeType);

    if(shape==null)
        System.out.println("�������״���Ͳ�����");
    else
        shape.draw(); //����״

  }
  public static void main(String[] args)throws Exception {
    new Panel().selectShape();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
