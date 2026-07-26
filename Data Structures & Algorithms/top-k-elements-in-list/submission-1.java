class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();

        
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        // List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        // list.sort((a,b)-> b.getValue() - a.getValue());

        // int [] ans = new int[k];
        // for(int i=0; i<k; i++){
        //     ans[i] = list.get(i).getKey();
        // }

        // return ans;
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> mp.get(a) - mp.get(b));

        
        for(int x : mp.keySet()){
            heap.add(x);

            if(heap.size() > k)
            heap.remove();
        }

        int [] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = heap.peek();
            heap.remove();
        }

        return ans;
    }
}
