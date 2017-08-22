package TrainingTasks;
import java.util.*;

public class TrainingTasks {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 8, 7, 999, 6, -3, 7};
        int[] arr2 = new int[]{8, 5, 3, 9, 6, 2, 7, 8, 8};
        int[] arr3 = new int[]{15, 8, 8, 8, 5, 3, 2, 2, 2, 1, -6, -8};
        int[] arr4 = new int[]{-9, -6, 8, 15, 32, 42, 52, 62, 100, 6666};
        int[] arr5 = new int[]{7, 7, 8, 8, 8, 8, 9, 9, 8};
        int[] arr6 = new int[]{1, 2, 3, 4, 5};
        int[] arr7 = new int[]{18, 1, 8, 9, 6, 4, 2, 1, 10, 12};
        int[] arr8 = new int[]{-5, 8, -9, -8, 8, 6, 3, 4};

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
        System.out.println(Arrays.toString(cycleShift(arr6, 3)));
        System.out.println(Arrays.toString(swapPositiveElements(arr8)));
        System.out.println(uniqueElements(arr7));
        System.out.println(nonUniqueElements(arr7));


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
        for (int i = 0; i < arr.length; i++) {
            changedArray[i] = (arr[i] % 2 == 0) ? 0 : arr[i];
        }
        return changedArray;
    }

    // замінити нулями всі непарні елементи в масиві

    public static int[] replaceOddNumbers(int[] arr) {
        int[] changedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            changedArray[i] = (arr[i] % 2 != 0) ? 0 : arr[i];
        }
        return changedArray;
    }

    // знайти індекс мінімального значення в масиві

    public static int findMinValueInArray(int[] arr) {
        int indexOfMinValue = 0;
        int temp1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp1) {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp1) {
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

        for (int i = 0; i < arr.length; i++) {
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

    public static int[] bubbleSortDesc(int[] arr) {
        int[] sortedArray = new int[arr.length];
        System.arraycopy(arr, 0, sortedArray, 0, arr.length);
        int swap;

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    swap = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = swap;
                }
            }
        }
        return sortedArray;
    }

    // сортування масиву за зростанням бульбашкою

    public static int[] bubbleSortAsc(int[] arr) {
        int swap;
        int[] sortedArray = new int[arr.length];
        System.arraycopy(arr, 0, sortedArray, 0, arr.length);
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    swap = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = swap;
                }
            }
        }
        return sortedArray;
    }

    // знайти перший додатній елемент TODO нема перевірки на всі від'ємні. мені за це соромно

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

    // знайти останній від'ємний елемент TODO перевірка

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

    public static int[] getIndexesOfElementInArray(int[] arr, int element) {
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

    enum SortType {
        Ascending,
        Descending
    }

    public static boolean isArraySorted(int[] arr, SortType sortType) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (!((arr[i] <= arr[i + 1] && sortType == SortType.Ascending) || (arr[i] >= arr[i + 1] && sortType == SortType.Descending)))
                return false;
        }

        return true;
    }

    // циклічний зсув елементів на к позицій вправо
    public static int[] cycleShift(int[] arr, int n) {
        int[] newArray = new int[arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        for (int i = 0; i < n; i++) {
            int temp = newArray[newArray.length - 1];
            for (int j = newArray.length - 1; j > 0; j--) {
                newArray[j] = newArray[j - 1];
            }
            newArray[0] = temp;
        }
        return newArray;
    }

    // вивести елементи, значення яких дорівнюють іншим елементам в масиві

    public static List nonUniqueElements(int[] arr) {
        int temp;
        List<Integer> nonUniqueElements = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            temp = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    if (i != j) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == true && !(nonUniqueElements.contains(temp))) {
                    nonUniqueElements.add(temp);
            }
        }
        return nonUniqueElements;
    }

    // знайти кількість елементів, більших за середнє значення

    public static int findAmountOfElementsOverAverage(int[] arr) {
        double averageOfArray = getAverageOfElements(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > averageOfArray) {
                count++;
            }
        }
        return count;
    }

    // вивести елементи, значення яких не дорівнюють значенням інших елементів в масиві

    public static List uniqueElements(int[] arr) {
        int temp;
        List<Integer> uniqueElements = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            temp = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    if (i != j) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                uniqueElements.add(temp);
            }
        }
        return uniqueElements;
    }


    // TODO вивести елементи одного масиву, які не дорівнюють елементам другого масиву

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

    // поміняти місцями перший додатній елемент з останнім, другий з передостаннім...

    public static int[] swapPositiveElements(int[] arr) {
        int count = 0;
        int[] newArray = new int[arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);

        for (int i = 0; i < newArray.length - 1 - count; i++) {
            if (newArray[i] > 0) {
                int temp = newArray[i];
                for (int j = newArray.length - 1 - count; j > i; j--) {
                    if (newArray[j] > 0) {
                        newArray[i] = newArray[j];
                        newArray[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return newArray;
    }
}