package usecooper;
import java.util.Set;
public class IntSet {
  private Set<Integer> set;

  public IntSet(Set<Integer> set){
    this.set=set;
  }
  public boolean add(int a){
     return set.add(Integer.valueOf(a));  //����Set��add(Object o)����
  }
  public boolean remove(int a){
    return set.remove(Integer.valueOf(a));  //����Set��remove(Object o)����
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
