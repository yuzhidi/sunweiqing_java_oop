public class Employee {
private String name;
private int age;	

/** ����Ա�����������䶼��֪���͵��ô˹��췽�� */
public Employee(String name, int age) {
  this.name = name;
  this.age=age;
}

/** ����Ա��������֪������δ֪���͵��ô˹��췽�� */
public Employee(String name) {
  this(name, -1);
}

/** ����Ա�����������䶼δ֪���͵��ô˹��췽�� */
public Employee() {
  this( "������" );
}
public void setName(String name){this.name=name; }
public String getName(){return name; }
public void setAge(int age){this.age=age;}
public int getAge(){return age;}

public static void main(String args[]){
  Employee zhangsan=new Employee("����",25);
  Employee lisi=new Employee("����");
  Employee someone=new Employee();

}

}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
