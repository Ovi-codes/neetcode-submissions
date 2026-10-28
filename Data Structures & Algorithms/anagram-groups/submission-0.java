class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        
        // map that holds the signature and anagrams associated
        Map<String,List<String>> processedStrings = new HashMap<>();	
        for (String s : strs) {
	        int[] count= new int[26];
	        for (char c : s.toCharArray()){
		        count[c - 'a']++;
	        }
            
            String key = Arrays.toString(count);
            processedStrings.computeIfAbsent(key, k->new ArrayList<>()).add(s); 
        }

    return new ArrayList<>(processedStrings.values());
    }
}