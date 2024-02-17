

public class sortAlgo{

    public void printArr(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("");
    }

    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort(int[]arr){
        System.out.println("Bubble Sort: It means push the maximum element to the end of the array using adjacent element comparison/swaps");
        
        int n = arr.length;
        int didSwaped = 0;
        for(int i=n-1;i>=0;i--){// from last element to first element
            for(int j=0;j<=i-1;j++){ // from first element to current ith element-1
                if(arr[j]>arr[j+1]){ // swap the left element with right element if left is greater than right
                    swap(arr,j,j+1);
                }
                didSwaped=1;
            }
            // as result of this loop the maximum element will be pushed to the end of the array
            if(didSwaped==0){
                break;
            }
            // best time complexity is O(n) and worst time complexity is O(n^2)
        }

    
    }
    public void insertionSort(int[] arr) {
        System.out.println("Insertion Sort: take an element and place it into it's correct position in the left side of the array using comparison and swaps.");
        System.out.println("6 2 5 1 3 4 ");
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) {
            int j = i; // save the current index
            while (j > 0 && arr[j-1] > arr[j]) { // traverse the array from current index to 0 and swap the left element with right while left is greater than right
                // printArr(arr);
                swap(arr, j-1, j); // swap
                j--;              // treverse the array to left
                printArr(arr);
            }
            
        }
    }  
    
    public void selectionSort(int[] arr){
        System.out.println("selectionSort"+"  in slection we select minimum element in the right and swap it with the first element");
        int n = arr.length;
        for(int i=0;i<=n-2;i++) {
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    
                    min = j;
                }
            }
            System.out.println(" i:"+arr[i]+" swap with min:"+arr[min]);
            swap(arr,i,min);
        }
    
    }
    public static void main(String args[]) {
        int[] arr = new int[]{6,2,5,1,3,4};
        sortAlgo sort = new sortAlgo();
        System.out.println("Before Sorting");
        sort.printArr(arr);
        sort.insertionSort(arr);
        System.out.println("After Sorting ");
        sort.printArr(arr);


    }


}