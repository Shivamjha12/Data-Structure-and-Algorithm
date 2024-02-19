

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
    // RECURSIVE SORTING ALGORITHMS
    public void merge(int[]arr, int low, int mid, int high){
         int left = low;
         int right = mid+1;
         int[] temp = new int[high-low+1];
         int k = 0; 
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
            temp[k++]=arr[left++];

            } else {
            temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
        temp[k++]=arr[left++];
        }
        while(right<=high){
        temp[k++]=arr[right++];
        }
        
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }

        
    }
    public void mergeSort(int[] arr,int low,int high){ // mergesort means divide and merge
        System.out.println("MergeSoirt: "+low+" "+high);
        if(low>=high){ return; }
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    int partition(int[] arr,int low,int high){ // partition function is used in quicksort to place the pivot to its correct position
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
        while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j){
            swap(arr,i,j);
        }
        swap(arr,low,j);
        }
        return j;
    }

    public void quickSort(int[] arr,int low,int high){ // In quicksoert we select a pivot and place it to its correct place aacording to sequence using partition function.
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }



    // ITERATIVE SORTING ALGORITHMS
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
        sort.quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting ");
        sort.printArr(arr);


    }


}