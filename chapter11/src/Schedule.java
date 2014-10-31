import java.util.*;
public final class Schedule {
  private final Date start;
  private final Date end;
  public Schedule(Date start,Date end){
    //������ż������ڿ�ѧ���ڵ�ǰ��
    if(start.compareTo(end)>0)throw new IllegalArgumentException(start +" after " +end);
     this.start=new Date(start.getTime());  //���ñ����Կ���
     this.end=new Date(end.getTime());   //���ñ����Կ���
  }
  public Date getStart(){return (Date)start.clone();}  //���ñ����Կ���
  public Date getEnd(){return (Date)end.clone();}  //���ñ����Կ���

  public static void main(String args[]){
    Calendar c= Calendar.getInstance();
    c.set(2006,9,1);
    Date start=c.getTime();
    c.set(2007,1,25);
    Date end=c.getTime();
    Schedule s=new Schedule(start,end);

    end.setTime(System.currentTimeMillis());  //�޸ķż�ʱ��
    start=s.getStart();
    start.setTime(System.currentTimeMillis());  //�޸Ŀ�ѧʱ��
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
