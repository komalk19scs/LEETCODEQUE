class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        StringBuffer [] a = new StringBuffer[numRows]; 
        for(int i=0; i<numRows; i++) 
        a[i] = new StringBuffer();

        int i=0;
        while(i<n){
            
            for(int ind=0; ind<numRows && i<n; ind++){
                a[ind].append(s.charAt(i++));
            }
            
            for(int ind=numRows-2; ind>0 && i<n; ind--){
                a[ind].append(s.charAt(i++));
            }
        }
        StringBuffer result = new StringBuffer();
        for(StringBuffer el : a){
            result.append(el);
        }
        return result.toString();
    }
}