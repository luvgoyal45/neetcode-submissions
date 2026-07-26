class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());

        int [] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = list.get(i).getKey();
        }

        return ans;
        // PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> (m))
    }
}
