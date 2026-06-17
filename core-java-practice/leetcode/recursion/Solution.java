// 231. Power of Two
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;

        return isPowerOfTwo(n / 2);
    }
}






// 326. Power of Three
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 3 != 0) return false;

        return isPowerOfThree(n / 3);
    }
}





// 342. Power of Four
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;

        return isPowerOfFour(n / 4);
    }
}






// 258. Add Digits
class Solution {

    private int digitSum(int n) {
        if (n == 0)
            return 0;

        return n % 10 + digitSum(n / 10);
    }

    public int addDigits(int num) {
        if (num < 10)
            return num;

        return addDigits(digitSum(num));
    }
}




