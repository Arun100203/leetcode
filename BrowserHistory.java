class BrowserHistory {
    List<String> li;
    int l = 0, curr = 0;
    public BrowserHistory(String homepage) {
        li = new ArrayList<>();
        li.add(homepage);
        l++;
        curr++;
    }
    
    public void visit(String url) {
       if (li.size() > curr) {
            li.set(curr, url);
        } else {
            li.add(url);
        }
        curr++;
        l = curr;
    }
    
    public String back(int steps) {
        curr = Math.max(1, curr - steps);
        return li.get(curr - 1);
        
    }
    
    public String forward(int steps) {
        curr = Math.min(l, curr + steps);
        return li.get(curr - 1);

    }
}
