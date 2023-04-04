class Solution {
    public boolean detectCapitalUse(String word) {
        String lo = word.toLowerCase();
        if(lo.equals(word))
        return true;
        String up = word.toUpperCase();
        if(up.equals(word))
        return true;
        String temp = word.substring(1, word.length());
        if(temp.toLowerCase().equals(word.substring(1, word.length())))
        return true;
        String fi = Character.toTitleCase(word.charAt(0)) + temp;
        return false;
    }
}
