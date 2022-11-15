class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] cnt = new int[26];
        int ransomNoteLen = ransomNote.length();
        int magazineLen = magazine.length();
        
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (cnt[c - 'a'] == 0) return false;
            cnt[c - 'a']--;
        }
        return true;
    }
}