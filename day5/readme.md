import java.util.Stack;

public class CityStackSearch {
    public static void main(String[] args) {
        Stack<String> cityStack = new Stack<>();

        // Push city names onto the stack
        cityStack.push("Ahmedabad");
        cityStack.push("Mumbai");
        cityStack.push("Delhi");
        cityStack.push("Bengaluru");

        // Search for a city
        String targetCity = "Delhi";
        int position = searchCity(cityStack, targetCity);

        if (position != -1) {
            System.out.println("Found " + targetCity + " at 1-based position from top: " + position);
        } else {
            System.out.println(targetCity + " not found in the stack.");
        }
    }

    // Method to search for a city name in the stack
    public static int searchCity(Stack<String> stack, String city) {
        // Built-in search returns 1-based distance from top, or -1 if not found
        return stack.search(city); 
    }
}