
    import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the entire sentence
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();

        // Split the string into an array of words using space as a separator
        // "\\s+" is a regex that handles multiple spaces between words
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder for efficient string concatenation
        StringBuilder result = new StringBuilder();

        // Iterate through the array from the last index to the first
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            
            // Add a space between words, but not after the last word
            if (i > 0) {
                result.append(" ");
            }
        }

        // Print the reversed sentence
        System.out.println(result.toString());
        
        sc.close();
    }

}
