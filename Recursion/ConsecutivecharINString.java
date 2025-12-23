public class ConsecutivecharINString {

    static int countFromStart(String s, int start, int end) {
        // base case
        if (end == s.length()) {
            return 0;
        }

        int count = 0;
        if (s.charAt(start) == s.charAt(end)) {
            count = 1;
        }

        return count + countFromStart(s, start, end + 1);
    }

    static int countAll(String s, int start) {
        // base case
        if (start == s.length()) {
            return 0;
        }

        return countFromStart(s, start, start)
                + countAll(s, start + 1);
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countAll(s, 0)); // 4
    }
}


/*
Q. count all contiguous substrings in given String 
means first char === last char 




*/