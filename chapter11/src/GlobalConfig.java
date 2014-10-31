import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {
  private static final GlobalConfig INSTANCE=new GlobalConfig();
  private Properties properties = new Properties();
  private GlobalConfig(){
    try{
      //����������Ϣ
      InputStream in=getClass().getResourceAsStream("myapp.properties");
      properties.load(in);
      in.close();
    }catch(IOException e){throw new RuntimeException("����������Ϣʧ��");}
  }
  public static GlobalConfig getInstance(){  //��̬��������
    return INSTANCE;
  }
  public Properties getProperties() {
    return properties;
  }
  
  public static void main(String args[]){
     GlobalConfig config=getInstance();
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
