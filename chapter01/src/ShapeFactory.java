import java.util.*;
import java.io.*;

public class ShapeFactory {

  private static Properties shapes=new Properties();

  static{
    try{
      InputStream in=ShapeFactory.class.getResourceAsStream("panel.properties");
      shapes.load(in); //��������Ϣ���ص�shapes������
    }catch(IOException e){throw new RuntimeException(e);}
  }

  public static Shape getShape(int type){
    try{
      //�������״����ƥ�����״����
      String className=(String)shapes.get(String.valueOf(type));
      //����Java������ƹ�����״����
      return (Shape)Class.forName(className).newInstance();
    }catch(Exception e){return null;}
  }

}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
