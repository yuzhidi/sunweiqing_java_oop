/* 
 * ��Ȩ 2005-2008 www.javathinker.org
 * ���������GPLЭ�飬����Դ�������ַ��ø�Э�������:
 * http://www.gnu.org/copyleft/gpl.html 
 */

package com.abc.dollapp.doll;

/**
 * <p><strong>Doll</strong>�����ޣ����ܹ������ض���������</p>
 * @author ������
 * @version 3.0
 * @since 1.0
 */
public class Doll{
  /**
   * ���޵�����
   */
  private String name;

  public Doll(String name){
    this.name=name;
  }
  
  /**
   * ����˵��
   */
  public void speak(){
    System.out.println(name);
  }  
}

