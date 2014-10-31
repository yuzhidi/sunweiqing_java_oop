import java.util.Map;
import java.util.HashMap;
public class Ghost {
  private static final Map<String,Ghost> ghosts=new HashMap<String,Ghost>();
  private final String name;
  public Ghost(String name) {
    this.name=name;
  }
  public String getName(){return name;}

  public static Ghost getInstance(String name){
    Ghost ghost =ghosts.get(name);
        if (ghost == null) {
            ghost=new Ghost(name);
            ghosts.put(name,ghost);
        }
        return ghost;

  }
  public static void removeInstance(String name){
    ghosts.remove(name);
   }
  protected void finalize()throws Throwable{
    ghosts.put(name,this);
    System.out.println("execute finalize");
    throw new Exception("Just Test");
  }

  public static void main(String args[])throws Exception{
    Ghost ghost=Ghost.getInstance("IAmBack"); //��
    System.out.println(ghost); //��
    String name=ghost.getName(); //��
    ghost=null; //��
    Ghost.removeInstance(name); //��
    System.gc();  //��
    //��CPU�ø����������߳�
    Thread.sleep(3000);  //��
    ghost=Ghost.getInstance("IAmBack");  //��
    System.out.println(ghost);  //��

  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
