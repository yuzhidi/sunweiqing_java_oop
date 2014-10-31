import java.util.*;
public class ConcurrentTester{
  public static void main(String args[]){
     final int size=1000;
     final Set<Integer> set=new HashSet<Integer>();
     for(int i=0;i<size;i++)
       set.add(new Integer(i));

     Thread reader=new Thread(){  //��������
       public void run(){
         Iterator<Integer> it=set.iterator();
         while(it.hasNext()){
           System.out.println(it.next());  //�׳�ConcurrentModificationException
           yield();
         }
       }
     };

     Thread remover=new Thread(){  
       public void run(){
          for(int i=0;i<size;i++){
            set.remove(new Integer(i));  //ɾ�������е�Ԫ��
            yield();
          }
       }
     };

     reader.start();
     remover.start();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
