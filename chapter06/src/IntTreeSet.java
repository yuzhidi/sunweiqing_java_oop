import java.util.TreeSet;
public class IntTreeSet extends TreeSet implements IntSet{
  public boolean add(int a){
     return add(new Integer(a));  //调用TreeSet类的add(Object o)方法
  }
  public boolean remove(int a){
    return remove(new Integer(a));  //调用TreeSet类的remove(Object o)方法
  }
  public boolean add(Object o){
    throw new UnsupportedOperationException();  
  }
  public boolean remove(Object o){
    throw new UnsupportedOperationException();
  }

}



/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
