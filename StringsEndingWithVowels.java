public class StringsEndingWithVowels {
    public static void main(String[] args) {
        // Sample array of strings
        String[] strings = {"hello", "world", "java", "code", "example", "apple", "try"};

        System.out.println("Strings ending with vowels:");
        for (String str : strings) {
            if (str.toLowerCase().matches(".*[aeiou]$")) {
                System.out.println(str);
            }
        }
    }
}
