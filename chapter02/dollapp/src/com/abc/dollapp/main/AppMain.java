/* 
 * ��Ȩ 2005-2008 www.javathinker.org
 * ���������GPLЭ�飬����Դ�������ַ��ø�Э�������:
 * http://www.gnu.org/copyleft/gpl.html 
 */

package com.abc.dollapp.main;
import com.abc.dollapp.doll.Doll;

/**
 * DollAppӦ�õ�������
 * @author ������
 * @version 3.0
 * @since 1.0
 */
public class AppMain{
  
  /**
   * Ӧ�ó������ڷ���
   */
  public static void main(String args[]){
    Doll beibei=new Doll("����");  //�������ޱ���
    Doll jingjing=new Doll("����");  //�������޾���
    Doll huanhuan=new Doll("����");  //�������޻���
    Doll yingying=new Doll("ӭӭ");  //��������ӭӭ
    Doll nini=new Doll("����");  //������������

    beibei.speak();  //���ޱ���˵��
    jingjing.speak();  //���޾���˵��
    huanhuan.speak();  //���޻���˵��
    yingying.speak();  //����ӭӭ˵��
    nini.speak();  //��������˵��
  }
}