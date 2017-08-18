package TrainingTasks;
import java.util.*;

public class TrainingTasks {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 8, 7, 999, 6, -3, 7};
        int[] arr2 = new int[]{8, 5, 3, 9, 6, 2, 7, 8, 8};
        int[] arr3 = new int[]{15, 8, 8, 8, 5, 3, 2, 2, 2, 1, -6, -8};
        int[] arr4 = new int[]{-9, -6, 8, 15, 32, 42, 52, 62, 100, 6666};
        int[] arr5 = new int[] {7, 7, 8, 8, 8, 8, 9, 9, 8};
        int[] arr6 = new int[] {1, 8, 9};

        System.out.println(findMaxElementInArray(arr1));
        System.out.println(findMinElementInArray(arr1));
        System.out.println(Arrays.toString(replaceEvenNumbers(arr2)));
        System.out.println(Arrays.toString(replaceOddNumbers(arr2)));
        System.out.println(findMinValueInArray(arr2));
        System.out.println(findMaxValueInArray(arr2));
        System.out.println(findSumOfElements(arr1));
        System.out.println(getAverageOfElements(arr1));
        System.out.println(getCountOfElements(arr1, 7));
        System.out.println(getCountOfElementsEqualZero(arr1));
        System.out.println(getCountOfElementsOverZero(arr2));
        System.out.println(Arrays.toString(multiplyElements(arr2, 2)));
        System.out.println(Arrays.toString(sumOfElementsAndIndexes(arr2)));
        System.out.println(Arrays.toString(bubbleSortDesc(arr2)));
        System.out.println(Arrays.toString(bubbleSortAsc(arr2)));
        System.out.println(takeFirstPositiveElement(arr2));
        System.out.println(takeLastNegativeElement(arr2));
        System.out.println(isArraySorted(arr3, SortType.Ascending));
        System.out.println(isArraySorted(arr3, SortType.Descending));
        System.out.println(isArraySorted(arr4, SortType.Ascending));
        System.out.println(isArraySorted(arr4, SortType.Descending));
        System.out.println(findAmountOfElementsOverAverage(arr2));
        System.out.println(getNumberOfElementsEqualFirst(arr3));
        System.out.println(Arrays.toString(getIndexesOfElementInArray(arr5, 8)));
        System.out.println(swapPositiveElements(arr5));



    }
////////////////////////////////////////////////////////////////////////////////////

    // максимальне значення елемента в масиві
    public static int findMaxElementInArray(int[] arr) {
        int temp11 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp11) {
                temp11 = arr[i];
            }
        }
        return temp11;
    }

    // мінімальне значення елемента в масиві

    public static int findMinElementInArray(int[] arr) {
        int temp22 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp22) {
                temp22 = arr[i];
            }
        }
        return temp22;
    }

    // замінити нулями всі парні елементи в масиві

    public static int[] replaceEvenNumbers(int[] arr) {
        int[] changedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            changedArray[i] = (arr[i] % 2 == 0) ? 0 : arr[i];
        }
        return changedArray;
    }

    // замінити нулями всі непарні елементи в масиві

    public static int[] replaceOddNumbers(int[] arr) {
        int[] changedArray1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            changedArray1[i] = (arr[i] % 2 != 0) ? 0 : arr[i];
        }
        return changedArray1;
    }

    // знайти індекс мінімального значення в масиві

    public static int findMinValueInArray(int[] arr) {
        int indexOfMinValue = 0;
        int temp1 = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < temp1) {
                indexOfMinValue = i;
                temp1 = arr[i];
            }
        }
        return indexOfMinValue;
    }

    // знайти індекс максимального значення в масиві

    public static int findMaxValueInArray(int[] arr) {
        int indexOfMaxValue = 0;
        int temp1 = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > temp1) {
                indexOfMaxValue = i;
                temp1 = arr[i];
            }
        }
        return indexOfMaxValue;
    }

    // знайти суму елементів масиву

    public static int findSumOfElements(int[] arr) {
        int sumOfElements = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
        }
        return sumOfElements;
    }

    // знайти середнє значення елементів в масиві

    public static double getAverageOfElements(int[] arr) {
        double sumOfElements = 0;
        double averageOfElements = 0;

        for(int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
        }
        averageOfElements = sumOfElements / arr.length;
        return averageOfElements;
    }

    // порахувати кількість елементів, що рівні заданому

    public static int getCountOfElements(int[] arr, int number) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

    // порахувати кількість елементів, рівних нулю

    public static int getCountOfElementsEqualZero(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    // порахувати кількість елементів, більших нуля

    public static int getCountOfElementsOverZero(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    // помножити елементи масиву на число

    public static int[] multiplyElements(int[] arr, int number) {
        int[] multipliedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            multipliedArray[i] = arr[i] * number;
        }
        return multipliedArray;
    }

    // додати до елементів масиву їх індекси

    public static int[] sumOfElementsAndIndexes(int[] arr) {
        int[] sumOfElementsAndIndexes = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sumOfElementsAndIndexes[i] = arr[i] + i;
        }
        return sumOfElementsAndIndexes;
    }

    // сортування масиву за спаданням бульбашкою

    public static int[] bubbleSortDesc(int[] arr){
        int lenghtOfArray = arr.length;
        int swap;

        for(int i = 0; i < lenghtOfArray; i++) {
            for(int j = 0; j < lenghtOfArray - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    // сортування масиву за зростанням бульбашкою

    public static int[] bubbleSortAsc(int[] arr) {
        int swap;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    // знайти перший додатній елемент

    //TODO нема перевірки на всі від'ємні

    public static int takeFirstPositiveElement(int[] arr) {
        int firstPositiveElement = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                firstPositiveElement = arr[i];
                break;
            }
        }
        return firstPositiveElement;
    }

    // знайти останній від'ємний елемент

    // TODO зробити іншим способом
    // TODO перевірка

    public static int takeLastNegativeElement(int[] arr) {
        int lastNegativeElement = 0;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < 0) {
                lastNegativeElement = arr[i];
                break;
            }
        }
        return lastNegativeElement;
    }

    // знайти індекси входження елемента в масив
    // TODO рагульня якась, а не рішення

    public static int[] getIndexesOfElementInArray (int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                newArray[j++] = i;
            }
        }
        return newArray;
    }
    // перевірити масив на впорядкованість за зростанням / спаданням

    enum SortType
    {
        Ascending,
        Descending
    }

    public static boolean isArraySorted(int[] arr, SortType sortType)
    {
        for (int i = 0; i < arr.length - 2; i++)
        {
            if (!((arr[i] <= arr[i + 1] && sortType == SortType.Ascending) || (arr[i] >= arr[i + 1] && sortType == SortType.Descending)))
                return false;
        }

        return true;
    }

    // TODO циклічний зсув елементів на к позицій вправо

    // TODO вивести елементи, значення яких дорівнюють іншим елементам в масиві

//    public static List findNotUniqueElements (int[] arr) {
//        List<Integer> notUniqueElements = new ArrayList();
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] !=)
//        }
//    }

    // знайти кількість елементів, більших за середнє значення

    public static int findAmountOfElementsOverAverage(int[] arr) {
        double averageOfArray = getAverageOfElements(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > averageOfArray) {
                count++;
            }
        }
        return count;
    }

    // вивести елементи, значення яких не дорівнюють значенням інших елементів в масиві



    // TODO вивести елементи одного масиву, які не дорівнюють елементам другого масиву

    // TODO не працює алгоритм

//    public static List uniqueElements (int[] arr, int[] arr1) {
//        List<Integer> uniqueElements = new ArrayList();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr[i] != arr1[j]) {
//                    uniqueElements.add(arr[i]);
//                }
//            }
//        }
//        return uniqueElements;
//    }

    // порахувати скільки в масиві елементів з таким же значенням, як і перший

    public static int getNumberOfElementsEqualFirst(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                count++;
            }
        }
        return count;
    }

    // TODO з двох відсортованих масивів зробити третій відсортований, не сортуючи його

    // TODO поміняти місцями перший додатній елемент з останнім, другий з передостаннім...

    public static List swapPositiveElements(int[] arr) {
        int temp;
        List<Integer> swappedArray = new ArrayList();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                for (int k = arr.length - 1; k >= 0; k--) {
                    if (arr[k] > 0) {
                        swappedArray.set(k, arr[i]);
                    }
                }
            }
        }
        return swappedArray;
    }

////////////////////////////////////////////////////////////////////////////////////////////
// знайти індекс входження елемента в масив



    /*// знайти максимальне значення елемента в масиві

    int[] newArray2 = new int[] {-10, 8, 9, 5, 6, 3, 2, 7};
    int temp2 = newArray2[0];
    for(int i = 0; i < newArray2.length; i++) {
        if (newArray2[i] > temp2) {
            temp2 = newArray2[i];
        }
    }

    // знайти мінімальне значення елемента в масиві

    int[] newArray3 = new int[] {-10, 8, 9, 5, 6, 3, 2, -17};
    int temp3 = newArray3[0];
    for(int i = 0; i < newArray3.length; i++) {
        if (newArray3[i] < temp3) {
            temp3 = newArray3[i];
        }
    }

    // замінити нулями всі парні елементи в масиві

    int[] newArray4 = new int[] {-10, 8, 9, 5, 6, 3, 2, 7};
    int[] changedArray1 = new int[newArray4.length];

    for(int i = 0; i < newArray4.length; i++) {
        changedArray1[i] = (newArray4[i] % 2 == 0) ? 0 : newArray4[i];
    }

    // замінити нулями всі непарні елементи в масиві

    int[] newArray5 = new int[] {-10, 8, 9, 5, 6, 3, 2, 7};
    int[] changedArray2 = new int[newArray5.length];

    for(int i = 0; i < newArray5.length; i++) {
        changedArray2[i] = (newArray5[i] % 2 != 0) ? 0 : newArray5[i];
    }

    // знайти індекс мінімального значення елемента в масиві

    int[] newArray6 = new int[] {-10, 8, -39, 5, 6, 3, 2, -7};
    int indexOfMinValue = 0;
    int temp4 = newArray6[0];
    for(int i = 0; i < newArray6.length; i++) {
        if(newArray6[i] < temp4) {
            indexOfMinValue = i;
            temp4 = newArray6[i];
        }
    }

    // знайти індекс максимального значення елемента в масиві

    int[] newArray7 = new int[] {-10, 8, -39, 5, 6, 3, 2, 777};
    int indexOfMaxValue = 0;
    int temp5 = newArray7[0];
    for(int i = 0; i < newArray7.length; i++) {
        if(newArray7[i] > temp5) {
            indexOfMaxValue = i;
            temp5 = newArray7[i];
        }
    }

    // сортування масиву за спаданням бульбашкою

    int[] newArray8 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15};
    int lenghtOfArray = newArray8.length;
    int swap;

    for(int i = 0; i < lenghtOfArray; i++) {
        for(int j = 0; j < lenghtOfArray - i - 1; j++) {
            if(newArray8[j] > newArray8[j + 1]) {
                swap = newArray8[j];
                newArray8[j] = newArray8[j + 1];
                newArray8[j + 1] = swap;
            }
        }
    }

    // сортування масиву за зростанням бульбашкою

    int[] newArray9 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15};
    int swap2;

    for(int i = 0; i < newArray9.length; i++) {
        for(int j = 0; j < newArray9.length - i - 1; j++) {
            if(newArray9[j] < newArray9[j + 1]) {
                swap2 = newArray9[j];
                newArray9[j] = newArray9[j + 1];
                newArray9[j + 1] = swap2;
            }
        }
    }

    // знайти суму елементів масиву

    int[] newArray10 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15};
    int sumOfElements = 0;

    for(int i = 0; i < newArray10.length; i++) {
        sumOfElements += newArray10[i];
    }

    // знайти середнє значення елементів в масиві

    int[] newArray11 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15, 5};
    int count = 0;
    double sumOfElements1 = 0;
    double averageOfElements1 = 0;

    for(int i = 0; i < newArray11.length; i++) {
        sumOfElements1 += newArray11[i];
        count++;
    }
    averageOfElements1 = sumOfElements1 / count;

    // порахувати кількість елементів, що рівні заданому

    int[] newArray12 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15, 5, 5};
    int count1 = 0;
    int n1 = 5;

    for(int i = 0; i < newArray12.length; i++) {
        if (newArray12[i] == n1) {
            count1++;
        }
    }

    // порахувати кількість елементів, рівних нулю

    int[] newArray13 = new int[] {-5, -10, 8, 0, 5, 0, 0, 2, 777, 15, 0, 0};
    int count2 = 0;

    for (int i = 0; i < newArray13.length; i++) {
        if (newArray13[i] == 0) {
            count2++;
        }
    }

    // порахувати кількість елементів, більших нуля

    int[] newArray14 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15, 5, 5};
    int count3 = 0;

    for (int i = 0; i < newArray14.length; i++) {
        if (newArray14[i] > 0) {
            count3++;
        }
    }

    // помножити елементи масиву на число

    int[] newArray15 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15, 5, 5};
    int[] multipliedArray = new int[newArray15.length];
    int n3 = 2;

    for (int i = 0; i < newArray15.length; i++) {
        multipliedArray[i] = newArray15[i] * n3;
    }

    // додати до елементів масиву їх індекси

    int[] newArray16 = new int[] {-5, -10, 8, -39, 5, 6, 3, 2, 777, 15, 5, 5};
    int[] sumOfElementsAndIndexes = new int[newArray16.length];

    for (int i = 0; i < newArray16.length; i++) {
        sumOfElementsAndIndexes[i] = newArray16[i] + i;
    }

    // знайти перший додатній елемент

    //TODO нема перевірки на всі від'ємні

    int[] newArray17 = new int[] {-5, -10, 8, -39, 5, -6, -3, -2, -777, 15, -5, 5};
    int firstPositiveElement = 0;

    for (int i = 0; i < newArray17.length; i++) {
        if (newArray17[i] > 0) {
            firstPositiveElement = newArray17[i];
            break;
        }
    }

    // знайти останній від'ємний елемент

    // TODO зробити іншим способом

    int[] newArray18 = new int[] {-5, -10, 8, -39, 5, 6, -3, 2, -777, 15, -5, 5};
    int lastNegativeElement = 0;

    for (int i = newArray18.length - 1; i > 0; i--) {
        if (newArray18[i] < 0) {
            lastNegativeElement = newArray18[i];
            break;
        }
    }
    */
    }