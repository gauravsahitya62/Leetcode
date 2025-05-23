// Main.java
public class Main {
    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();

        System.out.println("III = " + converter.romanToInt("III"));         // Output: 3
        System.out.println("IV = " + converter.romanToInt("IV"));           // Output: 4
        System.out.println("IX = " + converter.romanToInt("IX"));           // Output: 9
        System.out.println("LVIII = " + converter.romanToInt("LVIII"));     // Output: 58
        System.out.println("MCMXCIV = " + converter.romanToInt("MCMXCIV")); // Output: 1994
    }
}
