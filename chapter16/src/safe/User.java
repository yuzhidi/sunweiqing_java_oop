package safe;
import java.io.*;
public class User implements Serializable {
  private String name;
  private transient String password;
  public User(String name, String password) {
    this.name=name;
    this.password=password;
  }
  public String toString() {
    return name + " " + password;
  }
  
  /** �������飬��buff�����е�ÿ���ֽڵ�ÿһλȡ�� 
   *  ����13�Ķ�����Ϊ00001101��ȡ����Ϊ11110010
   */
  private byte[] change(byte[] buff){
    for(int i=0;i<buff.length;i++){
      int b=0;
      for(int j=0;j<8;j++){
        int bit=(buff[i]>>j & 1)==0 ? 1:0;
        b+=(1<<j)*bit;
      }
      buff[i]=(byte)b;
    }
    return buff;
  }

  private void writeObject(ObjectOutputStream stream)throws IOException {
    stream.defaultWriteObject();  //�Ȱ�Ĭ�Ϸ�ʽ���л� 
    stream.writeObject(change(password.getBytes()));
  }
  private void readObject(ObjectInputStream stream)
          throws IOException, ClassNotFoundException {
    stream.defaultReadObject();  //�Ȱ�Ĭ�Ϸ�ʽ�����л�
    byte[] buff=(byte[])stream.readObject();
    password = new String(change(buff));
  }
  public static void main(String[] args) throws Exception{
    User user = new User("Tom", "123456");
    System.out.println("Before Serialization:" + user);
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
   
    //��User�������л���һ���ֽڻ�����
    ObjectOutputStream o =new ObjectOutputStream(buf);
    o.writeObject(user);
      
    //���ֽڻ����з����л�User����
    ObjectInputStream in =new ObjectInputStream(
          new ByteArrayInputStream(buf.toByteArray()));
    user= (User)in.readObject();
    System.out.println("After Serialization:" + user);
   }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
