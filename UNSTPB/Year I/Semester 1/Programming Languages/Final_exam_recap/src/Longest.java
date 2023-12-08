public class Longest {
    public static int[] longestSubsequence(int[] a){
        int[] b = new int[100];
        int j = 0, max = 0, maxCurrent = 0;

        for(int i = 0; i < a.length - 1; i++){
            if(a[i] < a[i+1]) {
                maxCurrent++;
                if(maxCurrent > max) max = maxCurrent;
            }else{
                maxCurrent = 0;
            }
        }
        return b;
    }
}
