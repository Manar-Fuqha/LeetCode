class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String , ArrayList<String>> hash = new HashMap<>();

      for(String s : strs){
        hash.computeIfAbsent(sortString(s), k -> new ArrayList<>()).add(s);
      }

     return new ArrayList<>(hash.values());

    }
    private String sortString( String s ){
       if(s==null)return "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
         
        return new String(arr);
    }
}