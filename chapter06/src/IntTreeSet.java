import java.util.TreeSet;
public class IntTreeSet extends TreeSet implements IntSet{
  public boolean add(int a){
     return add(new Integer(a));  //����TreeSet���add(Object o)����
  }
  public boolean remove(int a){
    return remove(new Integer(a));  //����TreeSet���remove(Object o)����
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
