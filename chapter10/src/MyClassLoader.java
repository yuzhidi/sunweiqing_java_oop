import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader{
    //���������ָ��һ�����֣��ڱ�������Ϊ�˱������ֲ�ͬ�ļ���������
    private String name;  
    private String path = "d:\\";
    private final String fileType = ".class";

    public MyClassLoader(String name){
        super();
        this.name=name;
    }

    public MyClassLoader(ClassLoader parent,String name){
        super(parent);
        this.name=name;
    }
   
    public String toString(){return name;}

    public void setPath(String path){this.path=path;}
    public String getPath(){return path;}

    protected Class findClass(String name)throws ClassNotFoundException{
        byte[] data = loadClassData(name);
        return defineClass(name, data, 0, data.length);
    }

        /** ����Ķ��������ݶ��뵽�ڴ��� */
    private byte[] loadClassData(String name)throws ClassNotFoundException{
        FileInputStream fis = null;
        byte[] data = null;
        ByteArrayOutputStream baos=null;
        try{
            //��name�ַ����еġ�.���滻Ϊ��\�����Ӷ������еİ���ת��Ϊ·����
            //���磬���nameԭ��Ϊ��com.abc.Sample������ô����ת��Ϊ��com\abc\Sample��
            name=name.replaceAll("\\.","\\\\");
            fis = new FileInputStream(new File(path + name + fileType));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while ((ch = fis.read()) != -1){
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (IOException e){
            //�쳣ת��
            throw new ClassNotFoundException("Class is not found:"+name,e);
        }finally{
          try{
            fis.close();
            baos.close();
          }catch(IOException e){ e.printStackTrace();}
        }
        return data;
    }

    public static void main(String[] args) throws Exception{
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("D:\\myapp\\serverlib\\");
        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("D:\\myapp\\clientlib\\");
        MyClassLoader loader3 = new MyClassLoader(null, "loader3");
        loader3.setPath("D:\\myapp\\otherlib\\");

        test(loader2);
        test(loader3);
     }

     public static void test(ClassLoader loader)throws Exception{
        Class objClass = loader.loadClass("Sample");
        Object obj=objClass.newInstance(); //����һ��Sample���ʵ��
   }

}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
