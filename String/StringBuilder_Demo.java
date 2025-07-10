// package Lecture 12Combo;

public class StringBuilder_Demo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String s= "Udipta ";
        System.out.println("String wala loop started: ");
        for (int i = 0; i < 100000; i++) {
            s=s+" h";
        }System.out.println(s);
        System.out.println("String wala loop ended: " ); 



        // Checking how fast is string builder compared to string concatenation
         
        sb.append(s);
        System.out.println("StringBuilder wala loop started: ");
        for (int i = 0; i < 100000; i++) {
            sb.append(" h");
        }
        System.out.println("String wala loop ended: " );
    }
}