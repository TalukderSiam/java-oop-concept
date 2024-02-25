package super_Keyword;

/**
 *  animal
 */
 class  animal {
     String color ="white";
    
}

class Dog extends animal{
    String color="black";
    public void PrintColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}




public class SuperForVariable {
    public static void main(String[] args){
        Dog obj =new Dog();
        obj.PrintColor();
    }
}
