import java.util.ArrayList;
import java.util.List;

public class ArraySubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // This will hold our final answer (a list of all subsets)
        List<List<Integer>> result = new ArrayList<>();
        
        // Start recursion with an empty "current" list and index 0
        generateSubsets(0, nums, new ArrayList<>(), result);
        
        // Print the result
        System.out.println("All Subsets: " + result);
    }

    public static void generateSubsets(int i, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // BASE CASE: If we have made a decision for every number
        if (i == nums.length) {
            // We must create a NEW copy of 'current' because it is modified later
            result.add(new ArrayList<>(current));
            return;
        }

        // --- LEFT BRANCH: INCLUDE nums[i] ---
        current.add(nums[i]);            // Pick the number
        generateSubsets(i + 1, nums, current, result); // Move to next index

        // --- BACKTRACKING STEP ---
        // We must remove the number we just added so the "Exclude" branch
        // can start with a clean slate.
        current.remove(current.size() - 1);

        // --- RIGHT BRANCH: EXCLUDE nums[i] ---
        generateSubsets(i + 1, nums, current, result); // Move to next index
    }
}