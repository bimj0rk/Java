public class Sorted {

    public static boolean isSorted(int[] a){
        boolean isSorted = false;
        for(int i = 1; i < a.length; i++){
            if(a[i-1] > a[i]) isSorted = true;
            else isSorted = false;
        }
        return isSorted;
    }

    public static void main(String[] args){
        int a[] = {5, 4, 3, 2, 1};
        if(isSorted(a)) System.out.println("true");
        else System.out.println("false");
    }
    
}
