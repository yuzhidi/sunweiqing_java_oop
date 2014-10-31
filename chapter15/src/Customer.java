public class Customer implements Comparable{
    private String name;
    private int age;
    
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object o){
      Customer other=(Customer)o;

      //�Ȱ���name��������
      if(this.name.compareTo(other.getName())>0)return 1;
      if(this.name.compareTo(other.getName())<0)return -1;

      //�ٰ���age��������
      if(this.age>other.getAge())return 1;
      if(this.age<other.getAge())return -1;
      return 0;
   }
 
   public boolean equals(Object o){
	if(this==o)return true;
  	if(! (o instanceof Customer)) return false;
  	final Customer other=(Customer)o;

	if(this.name.equals(other.getName()) && this.age==other.getAge())
     	return true;
  	else
     	return false;
    }

    public int hashCode(){
      int result;
      result= (name==null?0:name.hashCode());
      result = 29 * result + age;
      return result;
    }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
