import java.lang.ref.*;
import java.util.*;

class Grocery{
  private static final int SIZE = 10000;
  //����dʹ��ÿ��Grocery����ռ�ý϶��ڴ棬��80K����
  private double[] d = new double[SIZE];  
  private String id;
  public Grocery(String id) { this.id = id; }
  public String toString() { return id; }
  public void finalize() {
    System.out.println("Finalizing " + id);
  }
}

public class References {
  private static ReferenceQueue<Grocery> rq = new ReferenceQueue<Grocery>();
  public static void checkQueue() {
    Reference<? extends Grocery> inq = rq.poll();  //�Ӷ�����ȡ��һ������
    if(inq != null)
      System.out.println("In queue: "+inq+" : "+inq.get());
  }

  public static void main(String[] args) {
    final int size=10;
 
    //����10��Grocery�����Լ�10��������
    Set<SoftReference<Grocery>> sa = new HashSet<SoftReference<Grocery>>();
    for(int i = 0; i < size; i++) {
      SoftReference<Grocery> ref=
               new SoftReference<Grocery>(new Grocery("Soft " + i), rq);
      System.out.println("Just created: " +ref.get());
      sa.add(ref);
    }
    System.gc();
    checkQueue();

    //����10��Grocery�����Լ�10��������
    Set<WeakReference<Grocery>> wa = new HashSet<WeakReference<Grocery>>();
    for(int i = 0; i < size; i++) {
       WeakReference<Grocery> ref=
          new WeakReference<Grocery>(new Grocery("Weak " + i), rq);
      System.out.println("Just created: " +ref.get());
      wa.add(ref); 
    }
    System.gc();
    checkQueue();

    //����10��Grocery�����Լ�10��������
    Set<PhantomReference<Grocery>> pa = new HashSet<PhantomReference<Grocery>>();
    for(int i = 0; i < size; i++) {
      PhantomReference<Grocery>ref = 
             new PhantomReference<Grocery>(new Grocery("Phantom " + i), rq);
      System.out.println("Just created: " +ref.get());
      pa.add(ref);
    }
    System.gc();
    checkQueue();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
