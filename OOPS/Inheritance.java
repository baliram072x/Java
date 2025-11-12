public class Inheritance {
   public static void main(String[] args) {
dog shiru = new dog();
shiru.eat();
shiru.legs = 4;
       System.out.println(shiru.legs);

    }
}


// inheritance is when properties & methods of base clas are passed on to a derived class
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

//derived class
 class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water ");
    }
}


class mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class dog extends mammals{
    String breed;
}


class birds extends Animal{

    void fly(){
        System.out.println("flies ");
    }
}