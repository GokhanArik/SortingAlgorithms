import static java.util.concurrent.TimeUnit.NANOSECONDS;
import java.util.Scanner;
import java.util.Arrays;

public class MainMenu{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";    

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int algo = 0;

        Sort mSort;

        do{
            int mArray[] = new int[]{5,2,4,12,4,3,7,8,9,5};
            System.out.println("\nRandom test array: " + Arrays.toString(mArray) );
            printSortingAlgorithms();
            System.out.print("\nPlease make your selection: ");
            algo = in.nextInt(); 
            System.out.println();

            long startTime = System.nanoTime();

            switch( algo ){

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    mSort = new BubbleSort();
                    mSort.sort(mArray);
                    break;
                case 2:
                    mSort = new BucketSort();
                    mSort.sort(mArray);
                    break;
                case 3:
                    mSort = new InsertionSort();
                    mSort.sort(mArray);
                    break;
                case 4:
                    mSort = new MergeSort();
                    mSort.sort(mArray);
                    break;
                case 5:
                    mSort = new QuickSort();
                    mSort.sort(mArray);
                    break;
                case 6:
                    mSort = new SelectionSort();
                    mSort.sort(mArray);
                    break;
            }

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println(ANSI_RED + "> Execution time in micro seconds: " + (double) NANOSECONDS.toMicros(elapsedTime) + ANSI_RESET);
        }
        while( algo > 0);


    }  

    public static void printSortingAlgorithms(){

        System.out.println("\nSorting Algorithms");
        System.out.println("\t1. Bubble Sort");
        System.out.println("\t2. Bucket Sort");
        System.out.println("\t3. Insertion Sort");
        System.out.println("\t4. Merge Sort");
        System.out.println("\t5. Quick Sort");
        System.out.println("\t6. Selection Sort");
        System.out.println("\t0. Quit");
    }
}

