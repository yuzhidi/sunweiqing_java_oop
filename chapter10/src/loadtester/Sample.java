package loadtester;

public class Sample {
    public static void main(String[] args) {
      Class c;
      ClassLoader cl,cl1;
      cl = ClassLoader.getSystemClassLoader();  //���ϵͳ������
      System.out.println(cl);  //��ӡϵͳ������
      while (cl != null) {     //��ӡ��������
        cl1=cl;
        cl = cl.getParent();
        System.out.println(cl1+"'s parent is "+cl);
      }

      try {
        c = Class.forName("java.lang.Object");  //��ô���Object���Classʵ��
        cl = c.getClassLoader();  //��ü���Object��ļ�����
        System.out.println("java.lang.Object's loader is " + cl);

        c = Class.forName("loadtester.Sample");  //��ô���Sample���Classʵ��
        cl = c.getClassLoader();   //��ü���Sample��ļ�����
        System.out.println("Sample's loader is " + cl);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}





/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
