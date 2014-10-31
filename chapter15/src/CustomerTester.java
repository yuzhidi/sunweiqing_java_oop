import java.util.*;
public class CustomerTester{
  public static void main(String args[]){
    Set<Customer> set=new TreeSet<Customer>();
    set.add(new Customer("Tom",15));
    set.add(new Customer("Tom",20));
    set.add(new Customer("Tom",15));
    set.add(new Customer("Mike",15));
    Iterator<Customer> it=set.iterator();
    while(it.hasNext()){
      Customer customer=it.next();
      System.out.println(customer.getName()+" "+customer.getAge());
    }
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
