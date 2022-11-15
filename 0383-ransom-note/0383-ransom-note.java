class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        int ransomNoteLen = ransomNote.length();
        int magazineLen = magazine.length();
        
        for (int i=0; i<magazineLen; i++) {
            cnt[magazine.charAt(i) - 'a']++;
        }
        for (int i=0; i<ransomNoteLen; i++) {
            int index = ransomNote.charAt(i) - 'a';
            cnt[index]--;
            if (cnt[index] < 0) {
                return false;
            }
        }
        return true;
    }
}