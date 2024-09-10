public class Swaping{
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

static  void swap(int arr[],int i,int j){
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    System.err.println(arr[i]+ " ");

}
//static void reverseusingswap(int arr[]){
 //   int i=0,j=arr.length-1;
   // while(i<j)
  //  swap(arr,i++,j--);

public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    //int i=2;
 //   int j=3;
    display(nums);
   // swap(nums,i,j);
   //reverseusingswap(nums);
 swap(nums);
}

}