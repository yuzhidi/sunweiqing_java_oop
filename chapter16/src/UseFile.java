import java.io.*;
import java.util.Date;
public class UseFile {
  public static void main(String args[])throws Exception{
    File dir1=new File("D:\\dir1");
    if(!dir1.exists())dir1.mkdir();     
    
    File dir2=new File(dir1,"dir2");
    if(!dir2.exists())dir2.mkdirs(); 

    File dir4=new File(dir1,"dir3\\dir4");
    if(!dir4.exists())dir4.mkdirs(); 
    
    File file=new File(dir2,"test.txt");
    if(!file.exists())file.createNewFile();

    listDir(dir1);

    deleteDir(dir1); 
  }
  
  /** �쿴Ŀ¼��Ϣ */
  public static void listDir(File dir){
    File[] lists=dir.listFiles();
    
    //��ӡ��ǰĿ¼�°�����������Ŀ¼���ļ������� 
    String info="Ŀ¼:"+dir.getName()+"(";
    for(int i=0;i<lists.length;i++)
      info+=lists[i].getName()+" ";
    info+=")";
    System.out.println(info); 
    
    //��ӡ��ǰĿ¼�°�����������Ŀ¼���ļ�����ϸ��Ϣ 
    for(int i=0;i<lists.length;i++){
      File f=lists[i];
      if(f.isFile())
        System.out.println("�ļ�:"+f.getName()
                   +" canRead:"+f.canRead()
                   +" lastModified:"+new Date(f.lastModified()));
      else  //���ΪĿ¼���͵ݹ����listDir()����
        listDir(f);  
    }
  }
  
  /** ɾ��Ŀ¼���ļ����������file����Ŀ¼����ɾ����ǰĿ¼�Լ�Ŀ¼�µ���������*/
  public static void deleteDir(File file){
    //���file�����ļ�����ɾ�����ļ�
    if(file.isFile()){
      file.delete();
      return;
    }
    
    //���file����Ŀ¼����ɾ��Ŀ¼�µ�������Ŀ¼���ļ�
    File[] lists=file.listFiles();
    for(int i=0;i<lists.length;i++)
       deleteDir(lists[i]);  //�ݹ�ɾ����ǰĿ¼�µ�������Ŀ¼���ļ�
    
    //���ɾ����ǰĿ¼    
    file.delete();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
