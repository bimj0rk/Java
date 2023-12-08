//4

public class Ex4 {

    public static void main(String[] args) {

        int array[] = {1, 2, -3, 2, 3, 4, -6, 8, 2, 3, 5, 1, -8, 6};

        int startIndex = 0, endIndex = 0, length = 0, index = 0, arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > 0 && startIndex == 0) {
                endIndex++;
            }

            if (array[i] < 0 || arrayLength - 1 == i) {
                if (startIndex != endIndex) {
                    endIndex = i;
                    int difference = endIndex - startIndex;
                    if (difference >= length && difference != 0) {
                        length = difference;
                        if (arrayLength - 1 == i) {
                            length = length + 1;
                        }
                        index = startIndex;
                    }
                }

                if (endIndex != arrayLength - 1 && array[i] < 0) {
                    startIndex = endIndex + 1;
                }
            }
        }

        System.out.println("Length is " + length);

        if(length > 0) System.out.println("Index is " + index);
        else System.out.println("No positive sequence found");
    }
}


