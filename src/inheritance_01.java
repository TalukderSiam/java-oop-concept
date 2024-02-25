class parent{
    void display(){
        System.out.println("I am from parent");
    }
}

class child extends parent{
    void show(){
        System.out.println("i am from child");
    }
}





public class inheritance_01 {
   
    public static void main(String[] args){
        child obj=new child();
        obj.display();
        obj.show();
    }
}
