import java.util.*;
import java.text.*;
public class DateCounter{
  public static void main(String[] args)throws Exception {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Date d1=dateFormat.parse("2006-03-11");
    Date d2=dateFormat.parse("2006-04-21");
    System.out.println("��������Ϊ��" +getPeriod(d2,d1));  //��ӡ����������Ϊ��41��
  }

  //������������֮����������
  public static long getPeriod(Date d1,Date d2){
    long p=d1.getTime()-d2.getTime();
    return p/(1000*60*60*24);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
