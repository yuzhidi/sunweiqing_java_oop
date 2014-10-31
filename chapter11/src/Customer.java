public class Customer implements Cloneable{  
  private String name;
  private int age;
  
  public Customer(){
    this("unknown",0);
    System.out.println("call default constructor");
  }
 
  public Customer(String name,int age){
    this.name=name;
    this.age=age;
    System.out.println("call second constructor"); 
  }
  
  public Object clone()throws CloneNotSupportedException{return super.clone();}
  
  public boolean equals(Object o){
	if(this==o)return true;
  	if(! (o instanceof Customer)) return false;
  	final Customer other=(Customer)o;

	if(this.name.equals(other.name) && this.age==other.age)
     	return true;
  	else
     	return false;
  }

  public String toString(){return "name="+name+",age="+age;}

  public static void main(String args[])throws Exception{
    //���÷����ֶδ���Customer����
    Class objClass=Class.forName("Customer");
    Customer c1=(Customer)objClass.newInstance();  //�����Customer���Ĭ�Ϲ��췽��
    System.out.println("c1: "+c1);  //��ӡname=unknown,age=0

    //��new��䴴��Customer����
    Customer c2=new Customer("Tom",20); 
    System.out.println("c2: "+c2);  //��ӡname=tom,age=20 
 
    //���ÿ�¡�ֶδ���Customer����
    Customer c3=(Customer)c2.clone();  //�������Customer��Ĺ��췽��
    System.out.println("c2==c3 : "+(c2==c3));  //��ӡfalse
    System.out.println("c2.equals(c3) : "+c2.equals(c3));  //��ӡtrue
    System.out.println("c3: "+c3);  //��ӡname=tom,age=20 
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
