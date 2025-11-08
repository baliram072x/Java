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

        Bankaccount myacc = new Bankaccount();
        myacc.username = "nbam";
        myacc.setPassword("fdfdffdf");
        System.out.println(myacc.username);

    }
}
// new class
class Pen {
    String color;
    int tip;
//function
    //getters
    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //setters
    void setcolor(String newcolor) {
        this.color = newcolor;
    }
    void setTip(int newTip) {
        this.tip = newTip;
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
public String username;
private String password;
public void setPassword(String pwd){
    password =pwd;
}
}