import java.util.*;
public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res = new boolean[n];
        for(int i = 0;i < p.length;i++)
        {
            if(s.contains(p[i]))
            {
                res[i] = true;
            }
            else{
                res[i] = false;
            } 
        }
        return res;
    }
}
