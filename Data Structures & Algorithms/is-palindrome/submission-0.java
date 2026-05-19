class Solution {
    public boolean isPalindrome(String s) {
        String str1=s.toLowerCase();
        int size=s.length();
        int i=0;
        int j=size-1;
        while(i<=j){
            if (!Character.isLetterOrDigit(str1.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(str1.charAt(j))) {
                j--;
            } else if(str1.charAt(i)==str1.charAt(j)){
                i++;
                j--;
            } else 
               return false;
        }
        return true;
    }
}