class Solution {
    public int findDuplicate(int[] arr) {
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                ans = arr[i];
                break;
            }
            map.put(arr[i], 1);
        }

        return ans;
    }
}
