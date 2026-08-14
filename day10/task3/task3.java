public class task3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // String[] words = input.split("\\s+");
        
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                sum += (ch - 'a' + 1);
            }
        }
        
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
