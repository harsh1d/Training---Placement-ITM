package day9.task3;

public class task32 {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append operation
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert operation
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);
        
        // Replace operation
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb);
        
        // Delete operation
        sb.delete(5, 13);
        System.out.println("After delete: " + sb);
        
        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Capacity and length
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        
        // charAt operation
        System.out.println("Character at index 0: " + sb.charAt(0));
        
        // substring operation
        sb.reverse(); // reverse back to original
        System.out.println("Substring: " + sb.substring(0, 5));
    }
}
