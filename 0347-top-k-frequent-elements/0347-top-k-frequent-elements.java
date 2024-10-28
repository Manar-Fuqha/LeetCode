class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x :nums){
            map.put(x , map.getOrDefault(x , 0)+1);
        }
        List<Integer> elements = new ArrayList<>(map.keySet());
        elements.sort(Comparator.comparing(map::get).reversed());

           return elements.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
    }
}