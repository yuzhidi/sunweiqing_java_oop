import java.util.*;
public class ElementTypeTesterNew{
   public Set<String> createSet(){
     Set<String> set = new HashSet<String>();
     set.add("Mike");
     return set;
   }
   public void printSet(Set<String> set){
     Iterator<String> it=set.iterator();
     while(it.hasNext()){
       String str=it.next();  //��������ת��
       System.out.println(str);
     }
   }
  public static void main(String args[]){
    ElementTypeTesterNew s=new ElementTypeTesterNew();
    Set<String> set=s.createSet();
    s.printSet(set);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
