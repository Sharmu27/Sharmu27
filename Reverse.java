import java.lang.String;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        String str1 = "malayalam";
        String str2;
        StringBuilder sb= new StringBuilder(str1);
        str2= sb.reverse().toString();
        System.out.println("str1="+str1);
        System.out.println("str2(reversed)="+str2);
    }
}