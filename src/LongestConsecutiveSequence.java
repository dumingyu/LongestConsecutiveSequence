import java.util.*;

/**
 * Created by dumingyu on 2017-03-29.
 *
 “Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

 Your algorithm should run in O(n) complexity.
 */

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums){
        final HashSet<Integer> mySet = new HashSet<Integer>();
        for(int i : nums) mySet.add(i);
        int longest = 0;
        for(int i : nums){
            int length = 1;
            for(int j = i-1; mySet.contains(j); j--){
                mySet.remove(j);
                length++;
            }
            for(int j = i+1; mySet.contains(j); j++){
                mySet.remove(j);
                length++;
            }
            longest = Math.max(longest,length);
        }
        return longest;

    }

    public static void main(String[] args){
        int[] test = {100, 4, 200, 1, 3, 2};
        System.out.println("The longest consecutive length is :"+" "+longestConsecutive(test));
    }
}
