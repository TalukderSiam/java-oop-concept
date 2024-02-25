

/**
 *  A
 */
 interface  A {

   public void run(); 
}

/**
 * B
 
 public void run();*/
 interface B {
    public void run();

    
}


class c implements A,B{
    public void run(){
        System.out.println("i am running from c");
    }
}










public class multiple {
    public static void main(String[] args) {
        c obj=new c();
        c.run();
    }
}
