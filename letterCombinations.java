class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> li = new ArrayList<>();
        List<String> res = new ArrayList<>();
        String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if(digits.equals(""))
        return li;
        for(int i=0;i<digits.length();i++)
        {
            int n = digits.charAt(i) - '0';
            li.add(arr[n-2]);
        }
        List<String> out = new ArrayList<>();
        out.add("");
        for(int i=0;i<li.size();i++)
        {
            List<String> temp = new ArrayList<>();
            for(int j=0;j<out.size();j++)
            {
                for(int k=0;k<li.get(i).length();k++)
                {
                    temp.add(out.get(j)+li.get(i).charAt(k));
                }
            }
            out = temp;
        }
        return out;
    }

}
