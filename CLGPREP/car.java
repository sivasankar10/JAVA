package CLGPREP;

public class car {
    String color;
    String weight;
    String speed;
    String Model;

    public void carinfo(){
        System.out.println("Color ; "+color);
        System.out.println("Weight:"+weight);
        System.out.println("speed :"+speed);
        System.out.println("Model :"+Model);
    }
    public static void main(String args[]){
        car a = new car();
        a.color= "RED";
        a.weight="2000kg";
        a.speed="170kmph";
        a.Model="Mustang";
        a.carinfo();

    }

}
