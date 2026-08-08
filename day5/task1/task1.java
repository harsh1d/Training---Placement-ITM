// stack object is created using the Stack class in Java. The Stack class is a part of the java.util package and provides methods to perform stack operations such as push, pop, peek, and search. In this code snippet, a stack object named cityStack is created to store city names. The push method is used to add city names to the stack, and the search method is used to find the position of a specific city in the stack. The position returned by the search method is 1-based, meaning that the top element of the stack has a position of 1. If the city is not found in the stack, the search method returns -1.

package day5.task1;

import java.util.Stack;

public class task1 {
    
}

class CityStackSearch {
    public static void main(String[] args) {
        Stack<String> cityStack = new Stack<>();

        // Adding cities to the stack
        cityStack.push("New York");
        cityStack.push("Los Angeles");
        cityStack.push("Chicago");
        cityStack.push("Houston");
        cityStack.push("Phoenix");

        // Searching for a specific city
        String searchCity = "Chicago";
        int position = cityStack.search(searchCity);
        
        if (position != -1) {
            System.out.println("City '" + searchCity + "' found at position: " + position);
        } else {
            System.out.println("City '" + searchCity + "' not found in the stack.");
        }
    }
}
