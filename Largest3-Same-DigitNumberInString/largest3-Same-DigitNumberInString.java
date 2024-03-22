class Solution {
    public String largestGoodInteger(String num) {
        int maximum = -1;
        boolean isZero = false;

        for (int i = 0; i < num.length() - 2; i++) {
            int partialNumber = 0;
            if (num.charAt(i) == num.charAt(i+1)) {
                if(num.charAt(i) == num.charAt(i+2)) {
                    if(num.charAt(i) != '0'){
                        partialNumber = Character.getNumericValue(num.charAt(i)) * 100 + Character.getNumericValue(num.charAt(i+1)) * 10 + Character.getNumericValue(num.charAt(i+2));
                        if(partialNumber > maximum) {
                            maximum = partialNumber;
                        }
                    }
                    else {
                        isZero = true;
                    }
                }
            }
        }

        if(maximum != -1) {
            return String.valueOf(maximum);
        }
        else {
            if(isZero == true) {
                return "000";
            }
            return "";
        }
    }
}