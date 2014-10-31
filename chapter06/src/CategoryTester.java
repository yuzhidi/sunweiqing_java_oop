import java.util.Set;
public class CategoryTester{
  public Book create(){
    Category categoryScience=new Category();  //����Science���͵�Category����
    categoryScience.setName("Science");
    
    Category categoryMath=new Category();  //����Math���͵�Category����
    categoryMath.setName("Math");
    
    Category categoryComputer=new Category();  //����Computer���͵�Category����
    categoryComputer.setName("Computer");
    
    //����Science������Math���͵Ĺ���
    categoryScience.addChildCategory(categoryMath);  
    categoryMath.setParentCategory(categoryScience);
    
    //����Science������Computer���͵Ĺ���
    categoryScience.addChildCategory(categoryComputer);  
    categoryComputer.setParentCategory(categoryScience);
    
    //����Math���͵�Book����
    Book mathBook=new Book();
    mathBook.setCategory(categoryMath);
    
    return mathBook;
  }
  
  public static void main(String args[]){
    Book mathBook=new CategoryTester().create();
    System.out.println(mathBook.getCategory().getName());  //��ӡ������
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
