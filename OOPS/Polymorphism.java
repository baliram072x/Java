public class Polymorphism {
    public static void main(String args []){
Calculators calc  =  new Calculators();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,3,4));

        Deer d =  new Deer();
        d.eat();

    }
}

// function overloading example

class Calculators{
    int sum (int a , int b ){
        return a+b;
    }

    float sum(float a , float b ){
        return a+b;
    }

    int sum(int a , int b, int c ){
        return a+b+c;
    }
}


// function overriding example
class Animals{
    void eat(){
        System.out.println("eats anything  ");
    }
}

class Deer extends Animals {
    void eat(){
        System.out.println("eats grass ");
    }
}

// notes ====================>>>>>>>>>

// many forms --> meaning

/*
- complile time polymorphism ==> method overloading

- run time polymorphism ==> method overriding
 */

/*
Method overloading ==> multiple functions with the same name but diffrent parameters
`
 */
