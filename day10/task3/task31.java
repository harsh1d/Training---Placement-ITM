
public class task31 {
    public static void main(String[] args) {
        String[] words = {"discipline", "success"};
        int totalSum = 0;

        for (String word : words) {
            int sum = calculateWordSum(word);
            totalSum += sum;
            
            System.out.println(word + " - Sum: " + sum);
        }

        System.out.println("Total Sum: " + totalSum);
    }

    public static int calculateWordSum(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                sum += (ch - 'a' + 1);
            }
        }
        return sum;
    }
}
