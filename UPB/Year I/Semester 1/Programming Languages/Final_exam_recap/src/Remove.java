public class Remove {
    public static int[] remove(int[] a, int b){
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                a[i] = a[a.length - 1];
                i--;
                index++;
            }
        }

        int[] c = new int[a.length - index];

        for(int i = 0; i < c.length; i++){
            c[i] = a[i];
        }

        return c;
    }
    
    public static void main(String[] args){
        int[] a = {2, 3, 4, 5, 5, 6};
        int b = 5;
        int[] c = remove(a, b);
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}
