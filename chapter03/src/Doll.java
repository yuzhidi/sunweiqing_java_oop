public class Doll{
  private static int number=0; //��̬����
  private int id=0;  //ʵ������
  private String name;  //ʵ������

  public Doll(String name){ //���췽��
    this.name=name;
    number++;
    id=number;
  }
  public void speak(String word){ //word�Ƿ�������
    //showNumber��showId�Ǿֲ�����
    String showNumber="Ŀǰ����"+number+"������!";
    String showId="�ҵ�ID��"+id;

    System.out.println(name+":"+showNumber);
    System.out.println(name+":"+showId);
    System.out.println(name+":"+word);
  }

  public static void main(String args[]){
    Doll doll1=new Doll("����");
    Doll doll2=new Doll("����");

    doll1.speak("��Һ�!");
    doll2.speak("��Һ�!");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
