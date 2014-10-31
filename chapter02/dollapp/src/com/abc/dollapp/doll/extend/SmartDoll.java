/* 
 * ��Ȩ 2005-2008 www.javathinker.org
 * ���������GPLЭ�飬����Դ�������ַ��ø�Э�������:
 * http://www.gnu.org/copyleft/gpl.html 
 */
package com.abc.dollapp.doll.extend;

import com.abc.dollapp.doll.Doll;

/**
 * <p><strong>SmartDoll</strong> �������ܸ��ޣ����ܹ������û�ָ����������</p>
 * @author ������
 * @version 3.0
 * @since 1.0
 * @see com.abc.dollapp.doll.Doll
 */
public class SmartDoll extends Doll{
  
  /**
   * �������ܸ���Ĭ���������˵�Ļ���
   */
  protected String word;
  
  /**
   * ����һ�����ܸ��ޣ�δ�趨Ĭ���������˵�Ļ���
   */  
  public SmartDoll(String name){
    super(name);
  };

  /**
   * ���츻�޵�ͬʱ��ָ��Ĭ���������˵�Ļ���
   * @param word Ĭ���������˵�Ļ���
   */  
  public SmartDoll(String name,String word){
    super(name); 
    this.word=word;
  };
  
  /**
   * ���Ĭ���������˵�Ļ���
   * @return ����Ĭ���������˵�Ļ���
   * @see #setWord
   * @deprecated �÷����Ѿ���������
   */ 
  public String getWord(){
    return this.word;
  }  

  /**
   * ����Ĭ���������˵�Ļ���
   * @param word Ĭ���������˵�Ļ���
   * @see #getWord
   * @since 2.0
   */ 
  public void setWord(String word){
    this.word=word;
  }  

  /**
   * <ul>
   * <li>���{@link #word word��Ա����}��Ϊnull���͵���{@link #speak(String) speak(String)����}</li>
   * <li>���{@link #word word��Ա����}Ϊnull���͵���{@link com.abc.dollapp.doll.Doll#speak() super.speak()����}</li>
   * </ul>
   */ 
  public void speak(){
     if(this.word!=null){
       try{
         speak(word);
       }catch(Exception e){}  
     }
     else
       super.speak();
  }
  
   /**
   * @param word ָ�����ܸ��޸�˵�Ļ���
   * @return ���ܸ�����˵�Ļ�
   * @exception Exception ���word����Ϊnull�����׳����쳣��
   */ 
  public String speak(String word) throws Exception{
    if(word==null)
       throw new Exception("��֪����˵ɶ");
    System.out.println(word);
    return word;
  }


}