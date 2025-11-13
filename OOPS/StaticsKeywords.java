public class StaticsKeywords {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.Schoolname =  "STMV";

        Students s2 = new Students();
        System.out.println(s2.Schoolname);

        Students s3 = new Students();
        s3.Schoolname = "PDEA";
    }
}

class Students {

    static int returnpercentage(int math, int phy , int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
     static String Schoolname;

     void getname(String name){
         this.name = name;
     }

     String getName() {
         return this.name;
     }
}



// =======================================================================================================================================

/*
static keywords in java is used to share the same variable or methods of a gievn class

-properties
-functions
-Blocks
- nested class

 */