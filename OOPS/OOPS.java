import java.awt.geom.Arc2D;

public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created new object named pen
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "red";
        System.out.println(p1.color);
    }
}
// new class
class Pen {
    String color;
    int tip;
//function
    void setcolor(String newcolor) {
        color = newcolor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

//new class
class  student{
    String name;
    int age;
    float percentage;
//function
    void calcpercentage(int phy, int chem,  int math){
        percentage = (phy+chem+math)/3;
    }
}


class Bankaccount{
 
}