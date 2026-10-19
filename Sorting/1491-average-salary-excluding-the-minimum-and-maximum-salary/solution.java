class Solution {
    public double average(int[] salary) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = salary.length;

        for(int sal : salary){
            total += sal;
            max = Math.max(max, sal);
            min = Math.min(min, sal);
        }

        return (double)(total - max - min) / (n - 2);
    }
}