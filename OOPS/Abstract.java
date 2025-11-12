import java.sql.SQLOutput;

public class Abstract {
    public static void main(String[] args){
//Horse h =  new Horse();
//h.eat();
//h.walk();
//chicken c = new chicken();
//c.eat();
//c.walk();

        mustang myhorse =  new mustang();
        // Animal -->  Horse --> Mustang



    }
}

abstract  class Animal3{
    String color;
    Animal3(){
        System.out.println("animal consc called ");
    }

void eat(){
    System.out.println("animal eats ");
}

abstract void walk();
}

class Horse extends Animal3{
    void walk(){
        System.out.println("walks on 4 legs ");
    }
    void changecolor(){
        color = "dark black ";
    }

    Horse(){
        System.out.println("horse conc called ");
    }
}

class chicken extends Animal3{
    void walk(){
        System.out.println("walks on 2 legs ");
    }

    void changecolor(){
        color =  "yellow";
    }
}


class mustang extends Horse{
    mustang (){
        System.out.println("mustang conc  is called ");
    }
}


// notes
/*
- cannot create an instance of abstract class
- can have abstract/non-abstract methods
- can have constructors
 */