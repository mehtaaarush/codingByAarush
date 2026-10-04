class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);
        if(reverse2 == num){
            return true;
        }else{
            return false;
        }
    }

    public static int reverse(int num){
        int rev = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num / 10;
        }
        return rev;

    }
}