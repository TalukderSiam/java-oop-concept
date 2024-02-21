public class Opp1 {
    String name;
    int age;

    public void printdata(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args){
        Opp1 obj=new Opp1();
        obj.name="siam";
        obj.age=22;
        obj.printdata();
    
}
}
