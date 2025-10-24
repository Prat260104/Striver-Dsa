public class PalindromeString {
    public int isPalindrome(String A) {
        int left = 0, right = A.length() - 1;
        
        while (left < right) {
            char cLeft = A.charAt(left);
            char cRight = A.charAt(right);
            
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(cRight)) {
                right--;
                continue;
            }
            
            // Compare characters ignoring case
            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                return 0;
            }
            
            left++;
            right--;
        }
        
        return 1;
    }
}


