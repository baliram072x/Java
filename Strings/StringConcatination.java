public class StringConcatination {
    public static void printletter(String fullname){
        for (int i = 0; i<=fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
    public static void main(String[] args){
        String Firstname = "Baliram";
        String Lastname = "Rathod";
        String fullname = Firstname + " " + Lastname;
////        System.out.println(fullname + " is this");
//        System.out.println(fullname.charAt(2));
        printletter(fullname);
}
}


// . charAt
