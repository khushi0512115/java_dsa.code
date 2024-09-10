public class reversearray {
static void display(int arr[]) {
   
    
     for(int i=0;i<arr.length;i++){
     //for (int i : arr)
 //  System.out.println(i+" ");
     System.out.println(arr[i]+" ");
     System.out.println();
}
}
    static int findsum(int[] arr) {
        int sum=0;
//for(int i : arr) {
    for(int i=0;i<=arr.length;i++){
   
    sum+=i;
    System.out.println(sum + " ");
    System.out.println();
    

   
    }
    return sum; 
    }

 static void reverse(int arr[] ) {
    for(int i= arr.length-1;i>=0;i--){
        System.out.println(arr[i]+" ");
        System.out.println();
    }
 }

static void arrayreverse(int arr[]) {
    int[] temp=new int[arr.length];

    for(int i=0;i<arr.length;i++) {
        temp[arr.length-1-i]=arr[i];
    
       
            arr[i]=temp[i];
        System.out.println(arr[i]+ " ");
        System.out.println();
        }  
    }  

    

        

        
    

    



public static void main(String[] args) {
    int[] nums= {1,2,3,4,5};
    
    display(nums);
    findsum(nums);
   reverse(nums);
    arrayreverse(nums);
   
}

}