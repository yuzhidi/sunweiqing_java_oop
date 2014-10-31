import java.util.*;
import java.text.*;
public class NextFriday{
  public static void main(String[] args) {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEE");
    GregorianCalendar cal=new GregorianCalendar();
    cal.setTime(new Date());  //cal��ʾ��ǰ����
    System.out.println("��ǰʱ��: " +dateFormat.format(cal.getTime()));

    //��Ϊ������
    cal.set(GregorianCalendar.DAY_OF_WEEK,GregorianCalendar.FRIDAY);
    System.out.println("��Ϊ��������ʱ��: " +dateFormat.format(cal.getTime()));

    int friday13Counter = 0;
    while (friday13Counter <4){
      // �����һ��������
      cal.add(GregorianCalendar.DAY_OF_MONTH, 7);

      // ���������պ���ĳ���µ�13��
      if (cal.get(GregorianCalendar.DAY_OF_MONTH) == 13){
        friday13Counter++;
        System.out.println(dateFormat.format(cal.getTime()));
      }
    }
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
