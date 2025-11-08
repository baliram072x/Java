public class Constructor {
    public static void main(String args[]){
Student s1 = new Student();
s1.name = "bali";
s1.roll = 456;
s1.pass = "abcd";
s1.marks[0] = 100;
s1.marks[1] = 90;
s1.marks[2] = 80;

Student s2 =new Student(s1);
s2.pass = "xyz";
for (int i=0; i<3; i++){
    System.out.println(s2.marks[i]);
}

}
    }


class Student{
    String name;
    int roll;
    String pass;
    int marks[];
//constructor
    //non parameterized construction
    Student(){
        marks = new int[3];

    }

    //parameterized construciton
    Student (String name){
        marks = new int[3];
        this.name = name;
    }
    Student (int roll){
        marks = new int[3];
        this.roll = roll;
    }

    //copy constructor
Student (Student s1){
        this.roll = s1.roll;
        this.name = s1.name;
        this.marks = s1.marks;


}

}