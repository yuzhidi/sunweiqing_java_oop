public class RegularExTester {
  public static void main(String[] args) {
    //���ַ����еġ�aaa��ȫ���滻Ϊ��z��
    //��ӡzbzcz
    System.out.println("aaabaaacaaa".replaceAll("a{3}","z"));
    
    //���ַ����еġ�aaa������aa�����ߡ�a��ȫ���滻Ϊ��*��
    //��ӡ*b*c*
    System.out.println("aaabaaca".replaceAll("a{1,3}","\\*"));
    
    //���ַ����е�����ȫ���滻Ϊ��z��
    //��ӡzzzazzbzzcc
    System.out.println("123a44b35cc".replaceAll("\\d","z"));
    
    //���ַ����еķ�����ȫ���滻Ϊ��z��
    //��ӡ1234000435000
    System.out.println("1234abc435def".replaceAll("\\D","0"));
    
    //���ַ����еġ�.��ȫ���滻Ϊ��\��
    //��ӡcom\abc\dollapp\Doll
    System.out.println("com.abc.dollapp.Doll".replaceAll("\\.","\\\\"));
    
    //���ַ����еġ�a.b��ȫ���滻Ϊ��-����
    //��a.b����ʾ����Ϊ3���ַ������ԡ�a����ͷ���ԡ�b����β  
    //��ӡ-hello-all
    System.out.println("azbhelloahball".replaceAll("a.b","-"));
    
    //���ַ����е����д��ַ��滻Ϊ��#��
    //������ʽ��[a-zA-Z_0-9]���ȼ����ǡ�\w��
    //��ӡ#.#.#.#.#.#.#
    System.out.println("a.b.c.1.2.3.4".replaceAll("[a-zA-Z_0-9]","#"));

  }
} 


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
