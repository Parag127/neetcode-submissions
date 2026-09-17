class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int r = 0; r < s.length(); r++) {

            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
                map.put(s.charAt(r), r);
            }
            maxLen = Math.max(maxLen, r - l + 1);
            map.put(s.charAt(r), r);
        }
        return maxLen;
    }
}
