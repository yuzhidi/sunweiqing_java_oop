import java.util.HashSet;
public class IntHashSet extends HashSet implements IntSet{
  public boolean add(int a){
     return add(new Integer(a));  //����HashSet���add(Object o)����
  }
  public boolean remove(int a){
    return remove(new Integer(a));  //����HashSet���remove(Object o)����
  }
  public boolean add(Object o){
    throw new UnsupportedOperationException();  
  }
  public boolean remove(Object o){
    throw new UnsupportedOperationException();
  }

}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
