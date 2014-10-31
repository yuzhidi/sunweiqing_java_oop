import java.io.*;
public class UseFilenameFilter{
  public static void main(String args[])throws Exception{
    File dir1=new File("D:\\");
    
    FilenameFilter filter=new FilenameFilter(){  //������
       public boolean accept(File dir,String name){
         System.out.println("��·����"+dir.getPath()+" ��·����"+name); 
         File currFile=new File(dir,name); 
         if(currFile.isFile() && name.indexOf(".txt")!=-1)            
           return true;
         else
           return false;  
       }
    };
    
    //��������D:\Ŀ¼����չ��Ϊ��.txt�����ļ��嵥
    String[] lists=new File("D:\\").list(filter);
    for(int i=0;i<lists.length;i++)
       System.out.println(lists[i]);
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
