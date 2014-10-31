import java.util.EmptyStackException;
public class Stack {
  private Object[] elements;  //��Ŷ���
  private int size=0;
  private int capacityIncrement=10;  //��ջ�����������Ĳ���
	
  public Stack(int initialCapacity,int capacityIncrement) {
    this(initialCapacity);
    this.capacityIncrement=capacityIncrement;
  }
  public Stack(int initialCapacity) {
    elements=new Object[initialCapacity];
  }

  public void push(Object object){
   ensureCapacity();
   elements[size++]=object;
  }

  public Object pop(){
   if(size==0)
     throw new EmptyStackException();
   elements[size]=null;  //������ڵĶ�������
   return elements[--size];
  }
  
  private void ensureCapacity(){  //���Ӷ�ջ������
    if(elements.length==size){
      Object[] oldElements=elements;
      elements=new Object[elements.length+capacityIncrement];
      System.arraycopy(oldElements,0,elements,0,size);
    }
  }

  public static void main(String args[]){
    Stack stack=new Stack(1000);
    for(int a=0;a<1000;a++)
      stack.push(new Integer(a));
    for(int a=0;a<1000;a++)
      System.out.println(stack.pop());
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
