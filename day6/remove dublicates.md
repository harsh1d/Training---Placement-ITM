Remove Duplicates 

To remove duplicates from a string efficiently while preserving the original order of characters, you can use a LinkedHashSet or a boolean tracking array.

Both approaches run in O(n) time. 

Approach 1: 

Boolean Tracking Array (Most Efficient for ASCII)
This is the fastest method for standard text. 

It uses a primitive boolean array to track seen characters, resulting in O(n) time and O(1) space.

1.   Initialize a boolean array of size 256.

2.   Iterate through the string character by character.

3.  Append the character to a StringBuilder only if its array value is false, then flip it to true.  

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        boolean[] seen =  new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeDuplicates(input)); 
        // Output: progamin
    }
}


Approach 2: 

Use LinkedHashSet (Best for Unicode/Universal text)
If your input contains emojis, special symbols, or non-ASCII characters, use a LinkedHashSet. 

It maintains the insertion order while enforcing uniqueness. 

 Insert characters into the set.
 The set automatically rejects duplicates.

 Rebuild the string using a StringBuilder. 

import java.util.LinkedHashSet;import java.util.Set;
public class RemoveDuplicatesUnicode {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        return sb.toString();
    }
}



Approach 3: 
Use Java 8 Streams (Modern & Concise)
You can achieve this in a single line using Java Streams by utilizing the .distinct() method intermediate operation. 

import java.util.stream.Collectors;
public class StreamRemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null) return null;
        
        return str.chars()
                  .distinct()
                  .mapToObj(c -> String.valueOf((char) c))
                  .collect(Collectors.joining());
    }
}