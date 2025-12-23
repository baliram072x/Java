
public class StringLength {

    public static int StringLength(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + StringLength(str.substring(1));

    }

    public static void main(String[] args) {
        String name = "baliram";
        System.out.println(StringLength(name));

    }
}

/*
Substring means ==>it cuts out  character of selected index   

  String test = "java";
    System.out.println(test.substring(1));


str.equals()

String test = "java";
System.out.println(test.equals("java"));

it returns boolen value if it condition not equal 

 */
