class Solution {
    public boolean isAnagram(String s, String t) {

if (s.length() != t.length()) return false;
int[] letterFreq = new int[26];
for (int i=0; i< s.length(); i++) {
letterFreq[ s.charAt(i)- 'a']++;
letterFreq[ t.charAt(i) - 'a']--;
}
for ( int freq: letterFreq) {
if (freq != 0) return false;
}
return true;

    }
}
