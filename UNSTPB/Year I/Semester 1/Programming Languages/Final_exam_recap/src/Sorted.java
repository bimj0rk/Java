public class Sorted{

    public static boolean isSorted(int[] a){
        boolean isSorted = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] < a[i+1]) isSorted = false;
        }
        return isSorted;
    }

    public static void main(String[] args){
        int a[] = {5, 4, 3, 2, 1};
        if(isSorted(a)) System.out.println("true");
        else System.out.println("false");
    }
    
}
