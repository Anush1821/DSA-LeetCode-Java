import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);

        int next = list.get(0);
        int count = 1;
        int high = 1;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) == next + 1) {
                next++;
                count++;
            } else {
                high = Math.max(high, count);
                next = list.get(i);
                count = 1;
            }
        }

        return Math.max(high, count);
    }
}