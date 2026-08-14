public class task32 {
    public static void main(String[] args) {
        String[] words = {"discipline", "success", "hi"};
        
        // Calculate and display the sum of corresponding character values for every string in the array
        // Each character's value is determined by its position in the alphabet (a=1, b=2, ..., z=26)
        java.util.Arrays.stream(words).forEach(word -> {
            int sum = word.toLowerCase().chars()
                .filter(Character::isLetter)
                .map(ch -> ch - 'a' + 1)
                .sum();
            System.out.println(word + " - Sum: " + sum);
        });
    }
}
