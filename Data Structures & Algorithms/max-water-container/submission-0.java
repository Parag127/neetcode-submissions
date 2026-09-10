class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int maxArea = 0;

        while (l < r) {
            int width = r - l;
            int h = Math.min(arr[l], arr[r]);
            maxArea = Math.max(maxArea, width * h);

            if (arr[l] < arr[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
