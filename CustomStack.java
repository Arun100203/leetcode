import java.util.*;
class CustomStack {

    Vector<Integer> vec;
    int len;
    public CustomStack(int maxSize) {
        vec = new Vector<>(maxSize);
        len = maxSize;
    }
    
    public void push(int x) {
        if(vec.size() < len)
             vec.add(x);
       
    }
    
    public int pop() {
        if(vec.size() != 0)
        {
            int temp = vec.get(vec.size()-1);
            vec.remove(vec.size()-1);
            return temp;
        }
        else
        {
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k && i<vec.size();i++)
        {
            vec.set(i, vec.get(i) + val);
        }
        System.out.println(vec);
    }
}
