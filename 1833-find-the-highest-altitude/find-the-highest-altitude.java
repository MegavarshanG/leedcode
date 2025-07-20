
import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
       int c=0;
       int m=0;
       for(int i=0;i<gain.length;i++){
        c+=gain[i];
        m=Math.max(m,c);
       } 
       return m;
    }
}