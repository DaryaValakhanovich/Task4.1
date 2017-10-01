public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Шалаш";
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s1.equalsIgnoreCase(s2.reverse().toString()));
    }
}
