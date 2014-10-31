import java.util.*;
public class CollectionsTester{
  public static void main(String args[]){
    List<String> list=Arrays.asList(new String[]{"Tom","Jack","Linda","Rose"});
    Collections.sort(list); //��List�е�Ԫ����Ȼ����
    System.out.println(Collections.max(list));  //��ӡTom
    System.out.println(Collections.min(list));  //��ӡJack

    System.out.println(Collections.binarySearch(list,"Tom"));  //��ӡ3
    System.out.println(Arrays.toString(list.toArray()));  //��ӡ[Jack,Linda,Rose,Tom]
    Collections.shuffle(list);  //�����������List��Ԫ�ص�λ��
    System.out.println(Arrays.toString(list.toArray()));  //��ӡ[Linda,Tom,Jack,Rose]
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
