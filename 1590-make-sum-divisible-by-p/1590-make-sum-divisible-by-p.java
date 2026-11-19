class Solution {
    public int minSubarray(int[] nums, int p) {

        int n = nums.length;

        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = (int) (totalSum % p);

        if (target == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefix = 0;
        int minLength = n;

        for (int i = 0; i < n; i++) {

            prefix = (int) (((long) prefix + nums[i]) % p);

            int required = (prefix - target + p) % p;

            if (map.containsKey(required)) {
                int previousIndex = map.get(required);

                int length = i - previousIndex;

                minLength = Math.min(minLength, length);
            }

            map.put(prefix, i);
        }

        return minLength == n ? -1 : minLength;
    }
}