class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();

        for(String str : strs){
            char [] chars = str.toCharArray();
            Arrays.sort(chars);
            String tmp = new String(chars);
            mp.computeIfAbsent(tmp, k -> new ArrayList<>()).add(str);
        }
        
        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
