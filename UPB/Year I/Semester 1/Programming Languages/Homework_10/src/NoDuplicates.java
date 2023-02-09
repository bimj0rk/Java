//1
public class NoDuplicates {
    public static int[] noDuplicates(int[] a){
        int end = a.length;
        for(int i = 0; i < end; i++){
            for(int j = i + 1; j < end; j++){
                if(a[i] == a[j]){
                    int remove = j;
                    for(int k = j + 1; k < end; k++, remove++){
                        a[remove] = a[k];
                     }
                    end--;
                    j--;
                }
            }
        }

        int newArray[] = new int[end];
        for(int i = 0; i < end; i++){
            newArray[i] = a[i];
        }

        return newArray;
    }

    public static void main(String[] args){
        int a[] = {4, 7, 8, 7, 5, 8, 7, 4, 8, 5};
        int b[] = noDuplicates(a);
        for(int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
