public class SuperKeyword {
    public static void main(String[] args){
Horses h = new Horses();
System.out.println(h.color);

    }
}

class Animals3{
String color ;
    Animals3(){
        System.out.println("animal constructor is called ");
    }
}

class Horses extends Animals3{
    Horses(){
        super.color = "brown";
        System.out.println("horse constructor is called ");
    }
}


// ========================================================================================

/*
super keyword is used to refer immediate parent class object

-to access parent properties
-to access parents functions
- to acess parents constructors

 */