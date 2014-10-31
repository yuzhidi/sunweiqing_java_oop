import java.util.*;
public class ListInserter {
  /**  ��List�б��а�˳�����һ���� */
  public static void insert(List<Integer> list,int data){
    ListIterator<Integer> it=list.listIterator();
    while(it.hasNext()){
      Integer in=it.next();
      if(data<=in.intValue()){
        it.previous();
        it.add(new Integer(data));  //����Ԫ��
        break;
      }
    }
  }
  public static void main(String args[]){
    List<Integer> list=new LinkedList<Integer>();  //����һ�������б�
    list.add(new Integer(3));
    list.add(new Integer(2));
    list.add(new Integer(5));
    list.add(new Integer(9));

    Collections.sort(list);
    insert(list,6);
    System.out.println(Arrays.toString(list.toArray()));
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
