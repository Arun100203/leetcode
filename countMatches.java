class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = 0;
        if(ruleKey.equals("color"))
        n=2;
        else if(ruleKey.equals("type"))
        n=1;
        else
        n=3;
        int ans = 0;
        for(int i=0;i<items.size();i++)
        if(items.get(i).get(n-1).equals(ruleValue))
        ans++;
        return ans;
    }
}
