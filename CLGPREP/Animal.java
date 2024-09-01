package CLGPREP;

public abstract class Animal  {
     abstract void pig();
}

class jungle extends Animal
{
    @Override
    void pig() {
        System.out.println("oink oink oink oink");
    }
    public static void main(String[] args) {
        Animal sound =new jungle();
        sound.pig();
    }

}


