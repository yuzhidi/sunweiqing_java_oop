class Owner{
  private Dog dog;
  public Dog getDog(){return dog;}

  public void setDog(Dog dog){
    this.dog=dog;
  }
}

public class Dog{
  private Owner owner;
  public Owner getOwner(){return owner;}

  public void setOwner(Owner owner){
    if(this.owner!=null)  //���ԭ�Ⱦ�������
      this.owner.setDog(null); //��ôȡ����ԭ�����˵Ĺ�����ϵ
    this.owner=owner; //���������µ����˵Ĺ�����ϵ
    owner.setDog(this); //�����µ����˺͹��Ĺ�����ϵ
  }

  public static void main(String args[]){
    Owner owner1=new Owner();
    Owner owner2=new Owner();
    Dog dog1=new Dog();

    dog1.setOwner(owner1);  //����dog1��owner1�Ĺ�����ϵ
    dog1.setOwner(owner2);  //������dog1��owner2�Ĺ�����ϵ
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
