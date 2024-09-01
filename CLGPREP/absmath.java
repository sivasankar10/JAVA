package CLGPREP;

abstract class absmath {
    abstract void  Math(int a , int b);
}

class add extends absmath{
    @Override
    void Math(int a , int b)
    {
        System.out.println(a+b);
    }
  }
class subb extends absmath{
    @Override
    void Math(int a , int b)
    {
        System.out.println(a-b);
    }
}

class Mathfuncs {
    public static void main(String[] args) {
        int a= 10;
        int b = 7;
        absmath add = new add();
        absmath sub = new subb();
        add.Math(a,b);
        sub.Math(a,b);
    }
}


