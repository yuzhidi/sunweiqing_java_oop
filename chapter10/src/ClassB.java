class ClassA{
  static{  System.out.println("now init ClassA");}
}
public class ClassB {
 public static void main(String args[])throws Exception{
   ClassLoader loader=ClassLoader.getSystemClassLoader();  //���ϵͳ�������
   Class objClass=loader.loadClass("ClassA");  //����ClassA
   System.out.println("after load ClassA");
   System.out.println("before init ClassA");
   objClass=Class.forName("ClassA");  //��ʼ��ClassA
 }
}




/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
