package day8.task3;

public class task3 {
    // Sample Question: Alice and Bob Game (Stone Game)
    // Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row,
    // and each pile has a positive integer number of stones piles[i].
    // The objective of the game is to end with the most stones. The total number of stones is odd, so there are no ties.
    // Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones
    // from either the beginning or the end of the row. This continues until there are no more piles left,
    // at which point the person with the most stones wins.
    // Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.
    //
    // Example 1:
    // Input: piles = [5,3,4,5]
    // Output: true
    // Explanation: Alice starts first, and can only take the first 5 or the last 5.
    // Say she takes the first 5, so that the row becomes [3, 4, 5].
    // If Bob takes 3, then the row becomes [4, 5], and Alice takes 5 to win with 10 points to 3.
    // If Bob takes the last 5, then the row becomes [3, 4], and Alice takes 4 to win with 9 points to 8.
    // This demonstrated that Alice always wins.
    
    public static boolean stoneGame(int[] piles) {
        // Alice always wins when the number of piles is even
        return true;
    }
    
    public static void main(String[] args) {
        int[] piles = {5, 3, 4, 5};
        System.out.println("Alice wins: " + stoneGame(piles));
    }
}
