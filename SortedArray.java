import java.util.*;

public class SortedArray {
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program Sorted Array");
        System.out.println("Masukan panjang array yang akan dibuat:");
        int arrayLength = key.nextInt();
        Integer[] unsortedArray = getIntegers(arrayLength);
        Integer[] sortedArray = sortIntegers(unsortedArray);
        printArray(sortedArray);
    }

    public static Integer[] getIntegers(int number){
        Integer[] arrayInt = new Integer[number];
        for (int counter = 0; counter < arrayInt.length; counter++){
            System.out.println("Masukan nilai array ke-" + (counter+1));
            arrayInt[counter] = key.nextInt();
        }
        return arrayInt;
    }

    public static void printArray(Integer[] array){
        System.out.println("Hasil array setelah diurutkan:");
        for (int index = 0; index < array.length; index++){
            System.out.println("Element "+ index +" contents "+ array[index]);
        }
    }

    public static Integer[] sortIntegers(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }
}