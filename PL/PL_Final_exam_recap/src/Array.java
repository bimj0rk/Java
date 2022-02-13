public class Array{
    public static int[] arrayReturn(int[] a, int[] b){
        int[] c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) c[i] = a[i];
        for(int i = a.length; i < c.length; i++)
            for(int j = 0; j < b.length; j++)
                c[i] = b[j];

        int end = c.length;
        for(int i = 0; i < end; i++){
            for(int j = i + 1; j < end; j++){
                if(c[i] == c[j]){
                    int remove = j;
                    for(int k = j + 1; k < end; k++, remove++) c[remove] = c[k];
                    end--;
                    j--;
                }
            }
        }
        
        int[] d = new int[end];
        for(int i = 0; i < end; i++){
            d[i] = c[i];
        }
        return d;
    }

    public static void main(String[] args){
        int[] a = {2, 3, 4};
        int[] b = {4, 5, 6};
        int[] c = arrayReturn(a, b);
        for(int i = 0; i < c.length; i++) System.out.println(c[i]);
    }
}
