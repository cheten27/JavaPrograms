import java.util.function.Function;

public class Lab4_a1{
    public static void main(String[] args) {
        String inputString = "AnudipFoundation;
      
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        Function<String, String> reverseString = str -> {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        };
        
        
        String upperCaseString = manipulateString(inputString, toUpperCase);
        String lowerCaseString = manipulateString(inputString, toLowerCase);
        String reversedString = manipulateString(inputString, reverseString);
        
       
        System.out.println("Original String: " + inputString);
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);
        System.out.println("Reversed: " + reversedString);
    }
    
    
    public static String manipulateString(String str, Function<String, String> func) {
        return func.apply(str);
    }
}
