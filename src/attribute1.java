public class attribute1 {
    // if we use final kewword if front of string name attribute this value can't be change
    String name;
    int age;

    public static void main (String[] arg){
        attribute1 obj1= new attribute1();
        obj1.name="siam";
        System.out.println(obj1.name);


        obj1.name="sabin";
        System.out.println(obj1.name);
    }

}
