import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Voter{
  private static final int MAX_COUNT=100;  //��̬���������ͶƱ�������������ֹͣͶƱ
  private static int count;  //��̬������ͶƱ��
  private static Set<Voter> voters=new HashSet<Voter>();  //��̬��������������Ѿ�ͶƱ��ѡ��
  private String name;  //ʵ��������ͶƱ������

  public Voter(String name){this.name=name;}

  /** ͶƱ */
  public void voteFor(){
    if(count==MAX_COUNT){
      System.out.println("ͶƱ��Ѿ�����");
      return;
    }
    if(voters.contains(this))
      System.out.println(name+":�㲻�����ظ�ͶƱ��");
    else{
      count++;
      voters.add(this); 
      System.out.println(name+":��л��ͶƱ��");
    }
  }

  /** ��ӡͶƱ���  */
  public static void printVoteResult(){
    System.out.println("��ǰͶƱ��Ϊ��"+count);

    System.out.println("����ͶƱ��ѡ����������");
    
    for(Voter voter : voters){  //����voters����
      System.out.println(voter.name);
    }
  }

  public static void main(String args[]){
    Voter tom=new Voter("Tom");
    Voter mike=new Voter("Mike");
    Voter jack=new Voter("Jack");

    tom.voteFor();
    tom.voteFor();
    mike.voteFor();
    jack.voteFor();

    Voter.printVoteResult();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
