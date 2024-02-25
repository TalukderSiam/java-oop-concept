package super_Keyword;
/**
 * Animal
 */
 class Animal {
 void eat(){
    System.out.println("i am from animal eating");
 }
    
}


 class Dog extends Animal{
    void eat(){
        System.out.println("i am from dog eating");
     }

     void work(){
        super.eat();
     }
 }



public class SuperMethod {
   
    
    public static void main(String[] args) {
        Dog obj =new Dog();
        obj.work();
    }
}
