import java.util.Scanner;

public class MainMenu{
    

    public static void main (String[] args){
   
        Scanner in = new Scanner(System.in);
        int mArray[] = new int[]{5,2,4,12,4,3,7,8,9,5};
        int algo = 0;
        
        Sort sort;
        
        printSortingAlgorithms();
        System.out.println("Please make your selection:");
        algo = in.nextInt();
              
        switch( algo ){
            
            case 1:
                sort = new InsertionSort( mArray );
                            
        }
       
    }  

    public static void printSortingAlgorithms(){
        
        System.out.println("Sorting Algorithms");
        System.out.println("\t1. Insertion Sort");    
    }
}

