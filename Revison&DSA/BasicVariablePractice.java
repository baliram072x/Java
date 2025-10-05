/*
Q1...Declare variables to store your name, age, weight, and isStudent (true/false).
Print them in a single sentence.

Q2.. Swap values of two integer variables without using a third variable.

 */

public class BasicVariablePractice {
    public static void main(String[] args){
        String name = "baliram";
        int age =  18;
        int weight = 65;
        boolean isStudent =  true;

//        System.out.println("my name is " + name +" age is :" + age + " weight is " + weight +" "+isStudent);

        System.out.println("My name is " + name +
                "\nAge: " + age +
                "\nWeight: " + weight + "kg" +
                "\nStudent: " + isStudent);
        System.out.println("  ");

        //swaping
        int a = 5;
        int b = 4;
        a  = a+b; // now 5+4 = 9
        b  = a-b; // now a = 9 then 9-4 = 5 so B becomes 5
        a  = a-b; // now a =9 and b= 5 then a becomes 4

        System.out.println("a is : " + a + " b is :" + b ) ;



    }
}

/*
\n uses for new line

 */

