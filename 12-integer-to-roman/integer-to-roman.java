class Solution {
    public String intToRoman(int n) {
     
        int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder s = new StringBuilder();

        int i = 0;
    
        while (n > 0) {
            if (n >= number[i]) {
                
                s.append(romanNumerals[i]);
                n -= number[i];
            } else {
                i++;
            }
        }

        return s.toString();
    }
}
