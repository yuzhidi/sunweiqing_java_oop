public class Scope{
  int x; //xΪʵ������
  int y; //yΪʵ������
  static int z; //zΪ��̬����

  void method(int x){ //xΪ��������
    int y=1;  //yΪ�ֲ�����
    int z=1;  //zΪ�ֲ�����
    this.x=x+1;  //this.x����ʵ������x��������x����ֲ�����x
    this.y=y+1;  //this.y����ʵ������y��������y����ֲ�����y
    Scope.z=z+1;  //Scope.z����̬����z��������z����ֲ�����z

    System.out.println("x="+x);  //��ӡ�ֲ�����x
    System.out.println("y="+y);  //��ӡ�ֲ�����y
    System.out.println("z="+z);  //��ӡ�ֲ�����z
    System.out.println("this.x="+this.x);  //��ӡʵ������x
    System.out.println("this.y="+this.y);  //��ӡʵ������y
    System.out.println("Scope.z="+Scope.z);  //��ӡ��̬����z
  }

  public static void main(String args[]){
    Scope obj=new Scope();
    obj.method(1);
  }
}

/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
