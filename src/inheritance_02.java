class vehicals{
    int miles;
    int price;
    String color;

    void display(){
        System.out.println("miles: "+miles);
        System.out.println("price :"+price);
        System.out.println("color :"+color);
    }
}


class car extends vehicals{
     
    String band;
}





public class inheritance_02 {
    public static void main(String[] args){
    car car1=new car();
    car1.miles=1222;
    car1.color="red";
    car1.price=384579;
    car1.display();
    }
}
