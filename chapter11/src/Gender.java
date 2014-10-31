import java.io.Serializable;
import java.util.*;
public class Gender implements Serializable {
    private final Character sex;
    private final transient String description;

    public Character getSex() {
        return sex;
    }
    public String getDescription() {
        return description;
    }

    private static final Map<Character,Gender> instancesBySex = 
new HashMap<Character,Gender>();

    /**
     * �ѹ��췽������Ϊprivate���ͣ��Ա��ֹ�ⲿ���򴴽�Gender���ʵ��
     */
    private Gender(Character sex, String description) {
        this.sex = sex;
        this.description = description;
        instancesBySex.put(sex, this);
    }

    public static final Gender FEMALE =
        new Gender(new Character('F'), "Female");

    public static final Gender MALE =
        new Gender(new Character('M'), "Male");

    public static Collection getAllValues() {
        return Collections.unmodifiableCollection(instancesBySex.values());
    }

    /**
     * ���ղ���ָ�����Ա���д����Genderʵ��
     */
    public static Gender getInstance(Character sex) {
        Gender result = (Gender)instancesBySex.get(sex);
        if (result == null) {
            throw new NoSuchElementException(sex.toString());
        }
        return result;
    }

    public String toString() {
        return description;
    }

    /**
     * ��֤�����л�ʱֱ�ӷ���Gender������ľ�̬ʵ��
     */
    private Object readResolve() {
        return getInstance(sex);
    }

    public static void main(String args[]){
      Gender female=Gender.getInstance(new Character('F'));
      Gender male=Gender.getInstance(new Character('M'));
    }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
