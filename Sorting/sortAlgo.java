

public class sortAlgo{
    public void printArr(int[] arr){
        for(int num:arr){
            System.out.print(num);
        }
        System.out.println("");
    }
    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++) {
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    
    }
    public static void main(String args[]) {
        int[] arr = new int[]{2,32,21,3,1,44,2,86,46,95,7,8,4};
        sortAlgo sort = new sortAlgo();
        System.out.println("Before Sorting");
        sort.printArr(arr);
        sort.selectionSort(arr);
        System.out.println("After Sorting ");
        sort.printArr(arr);


    }


}