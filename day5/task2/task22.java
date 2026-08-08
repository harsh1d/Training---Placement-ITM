// use two pointer approach to solve the problem
//in which we will use two pointer to find the maximum area of water that can be contained between the lines represented by the array of heights. The two pointers will start at the beginning and end of the array and will move towards each other based on the height of the lines they point to. The area is calculated as the minimum height of the two lines multiplied by the distance between them. We will keep track of the maximum area found during this process.
// convert it into string and use the word "Twinkle Twinkle Little Star" 

package day5.task2;

public class task22 {

    public static String reverseTwinkleString() {
        String str = "Twinkle Twinkle Little Star";

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String result = reverseTwinkleString();
        System.out.println(result);
    }

}
