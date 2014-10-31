import java.util.*;
public class Visitor{
  public static void print(Collection<? extends Object> c){
    Iterator<? extends Object> it=c.iterator();
    //���������е�����Ԫ��
    while(it.hasNext()){
      Object element=it.next();  //ȡ�������е�һ��Ԫ��
      System.out.println(element);  
    }
  }
  public static void main(String args[]){
    Set<String> set=new HashSet<String>();
    set.add("Tom");
    set.add("Mary");
    set.add("Jack");
    print(set);
 
    List<String> list=new ArrayList<String>();
    list.add("Linda");
    list.add("Mary");
    list.add("Rose");
    print(list);
    
    Map<String,String> map=new HashMap<String,String>();
    map.put("M","��"); 
    map.put("F","Ů");
    print(map.entrySet());  

  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
