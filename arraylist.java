import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    // String name;
    // public arraylist(String name) {
    //     this.name = name;
    // }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        // Example input array
        int[] nums = {2, 7, 11, 15};
        
        // Target sum
        int target = 9;
        
        // Call the twoSum method
        int[] result = twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
    }

}


/**
 * Innerarraylist
 */

// class Innerarraylist {
//     public static void main(String[] args) {
//         ArrayList<arraylist> cars = new ArrayList<arraylist>();
//         arraylist d1=new arraylist("BMW");
//         arraylist d2=new arraylist("Ford");
//         cars.add(d1);
//         cars.add(d2);
//         Collections.swap(cars, 0, 1);
//         for (arraylist x : cars) {
//             System.out.println(x.name);
//         }
//     }
// }