class Node{  //�ڵ�
  private Object value;
  private Node next;

  public Node(Object value){this.value=value;}
  public Object getValue(){return value;}
  public Node getNext(){return next;}
  public void setNext(Node next){this.next=next;}
}

public class MyHashSet {
  private Node[] array;
  private int size=0; //��ʾ�����д�ŵĶ������Ŀ
  public MyHashSet(int length){
    array=new Node[length];
  }

  public int size(){return size;}

  /** ���һ������ĸ��ƵĹ�ϣ�룬�ο���java.util.HashMap���hash()���� */
  private static int hash(Object o){
     int h = o.hashCode();
     h += ~(h << 9);
     h ^=  (h >>> 14);
     h +=  (h << 4);
     h ^=  (h >>> 10);
     return h;
  }

  /** ���ݶ���Ĺ�ϣ������������λ�ã��ο���java.util.HashMap���indexFor()����*/
  private int indexFor(int hashCode) {
        return hashCode & (array.length-1);
  }

  /** �Ѷ�����뵽�����У�����������ظ�Ԫ�� */
  public void add(Object value){
     int index=indexFor(hash(value));
     System.out.println("index:"+index+" value:"+value);

     Node newNode=new Node(value);

     Node node=array[index];
     if(node==null){
       array[index]=newNode;
       size++;
     }else{  //�����ϣ��ͻ
       Node nextNode;
       while(!node.getValue().equals(value)
            && (nextNode=node.getNext())!=null){
          node=nextNode;
       }
       //����������ظ�Ԫ��
       if(!node.getValue().equals(value)){
          node.setNext(newNode);
          size++;
       }
    }
  }

  /** ���Լ������Ƿ���ڲ���ָ���Ķ��� */
  public boolean contains(Object value){
    int index=indexFor(hash(value));
    Node node=array[index];
    while(node!=null && !node.getValue().equals(value)){
      node=node.getNext();
    }
    if(node!=null && node.getValue().equals(value))
      return true;
    else
      return false;
  }

   /** ɾ�������е�һ������ */
  public boolean remove(Object value){
    int index=indexFor(hash(value));
    Node node=array[index];
    if(node!=null && node.getValue().equals(value)){
      array[index]=node.getNext();
      size--;
      return true;
    }

    Node lastNode=null;
    while(node!=null && !node.getValue().equals(value)){
      lastNode=node;
      node=node.getNext();
    }
    if(node!=null && node.getValue().equals(value)){
      lastNode.setNext(node.getNext());
      size--;
      return true;
    }else
      return false;
  }

  /** ���ؼ����е����ж���  */
  public Object[] getAll(){
    Object[] values=new Object[size];
    int index=0;
    for(int i=0;i<array.length;i++){
      Node node=array[i];
      while(node!=null){
        values[index++]=node.getValue();
        node=node.getNext();
      }
    }
    return values;
  }

  public static void main(String[] args) {
    MyHashSet set = new MyHashSet(6);
    Object[] values={"Tom","Mike","Mike","Jack","Mary","Linda","Rose","Jone"};

    for(int i=0;i<values.length;i++)
      set.add(values[i]);  //�򼯺��м������

    set.remove("Mary");  //�Ӽ�����ɾ��һ������
    System.out.println("size="+set.size());

    values=set.getAll();  //��ü����е����ж���
    for(int i=0;i<values.length; i++)
      System.out.println(values[i]);

    System.out.println(set.contains("Jack"));  //��ӡtrue
    System.out.println(set.contains("Linda")); //��ӡtrue
    System.out.println(set.contains("Jane"));  //��ӡfalse
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
