import java.net.URLClassLoader;
import java.net.URL;

public class Tester {
  public static void main(String[] args)throws Exception {
    URL url=new URL("http://www.javathinker.org/java/book/classes/");
    URLClassLoader loader=new URLClassLoader(new URL[]{url}); //��������Ϊϵͳ�������
    Class objClass = loader.loadClass("Sample");
    Object obj=objClass.newInstance();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
