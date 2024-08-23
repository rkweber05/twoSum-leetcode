import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            var complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}