import java.util.*;
import java.lang.ref.*;
	
class Key {
  String id;
  public Key(String id) { this.id = id; }
  public String toString() { return id; }
  public int hashCode() { 
    return id.hashCode();
  }
  public boolean equals(Object r) {
    return (r instanceof Key)
      && id.equals(((Key)r).id);
  }
  public void finalize() {
    System.out.println("Finalizing Key "+ id);
  }
}

class Value {
  String id;
  public Value(String id) { this.id = id; }
  public String toString() { return id; }
  public void finalize() {
    System.out.println("Finalizing Value "+id);
  }
}

public class MapCache {
  public static void main(String[] args) throws Exception{
    int size = 1000;
    // ���ߴ������л��size�Ĵ�С
    if(args.length > 0)size = Integer.parseInt(args[0]);    

    Key[] keys = new Key[size];  //��ż������ǿ����
    WeakHashMap<Key,Value> whm = new WeakHashMap<Key,Value>();
    for(int i = 0; i < size; i++) {
      Key k = new Key(Integer.toString(i));
      Value v = new Value(Integer.toString(i));
      if(i % 3 == 0) keys[i] = k; //ʹKey�������ǿ���� 
      whm.put(k, v);  //ʹKey�������������
    }
    //�ߴ���������������
    System.gc();
    
//��CPU�ø������������߳�
    Thread.sleep(8000);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
