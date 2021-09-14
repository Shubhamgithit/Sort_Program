/* Pesudo Code 
Take an element from the unsorted array, place it in its corresponding
position in the sorted part, and shift the elements accordingly.

for(int i=1;i<n;i++){ // itrate in array
int current=arr[i];  //assign the current varibale to the element of array
int j=i-1; // make a pointer j
while(arr[j]>current && j>=0) { //run a lop iterate and check j with the current element check if it //greater or not
arr[j+1]=arr[j];
j--;  // decrement j
}
arr[j+1]=current; //after end of while loop insert value of current in j+1
}
  */

// Program 
class sort_Program {
    //Function to sort array using insertion sort
    void algorithm(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            // Move elements of arr[0..i-1], that are
              // greater than key, to one position ahead
              // of their current position 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        int arr[] = {83,1,45,95,45,52,11,47,0,45,67,82};
 
        sort_Program ob = new sort_Program();
        ob.algorithm(arr);
 
        printArray(arr);
    }
}