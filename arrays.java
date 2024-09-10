
/* package Lecture02;
import java.util.Scanner;
public class arrays {

    static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

   // public static void main(String[] args) {
        // int a=10;
        // int[] arr= new int[5];
        // arr[0]=5;
        // arr[1]=10;
        // arr[2]=15;
        // boolean[] nums= new boolean[10];
        // char[] s= new char[3];
        // s[0]='a';
        // s[1]='b';
        // // System.out.println(arr);
        // //display
        // // for(int i=0;i<nums.length;i++){
        // //     System.out.print(nums[i]+" ");
        // // }
        // //1. Create a table for n.
        // int n=5;
        // int[] table= new int[10];
        // for(int i=0; i<table.length;i++){
        //     table[i]= n*(i+1);  
        // }
        // display(table);
        // //2. Search m in this table.
        // int m= 40;
        // for(int i=0;i<table.length;i++){
        //     if(table[i]==m)
        //     System.out.println(i);
        // }
        //3. if found print it's index.

        Scanner scan= new Scanner(System.in);
        String n;
        n= scan.nextLine();
        System.out.println(n);
    }*/
    
    

   /* public class arrays {
        public static void main(String[] args) {
            
            int[] arr ={8,5,4,3,4,3,2};
            

           // static void display(int[] arr,int x , int y){
          //  for(int i=0;i<arr.length;i++)
             for(int x=i;x<arr.length && x<=j;x++)
          // System.out.println(arr[i]+" ");
           //System.out.println();
           
            static int findsum(int[] arr) {

                int sum=0;
                for(int i: arr){

                
                sum+=i;
                }
                return sum;
            
            
            
        }
    } */
 /*  public class arrays {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,6};
    static void display(int[] arr,int x,int y);

    for(int i : arr){
        System.out.println(i+" ");
        System.out.println();
        display(arr);
        */

    /*public class arrays {
        static void display(int[] arr,int x,int y) 
                static void reverse(int[] arr){
                    //shallow copy
                  int[] temp=new int[arr.length];
                  //for(int x=i;x<arr.length && x<=j;x++)
                  for(int i=0;i<arr.length;i++){
                    temp[arr.length-1-i]=arr[i];
                  }
                  for(int i=0;i<arr.length;i++){

                  
                  arr[i]=temp[i];
                  
                  }
                
                }
                public static void main(String[] args) {
                    int[] nums = {4,5,6,7,8};  
            System.out.println();
                 
                reverse(nums);
                display(nums);
                
            }
        
        }*/
       /*  public class arrays{
            
                static void swap(int[] arr, int i , int j,int x,int y){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                  //  for(int x=i;x<arr.length && x<=j;x++)
                    for(i=0;i<arr.length;i++){
                        for(j=0;j<arr.length;j++){
                            System.out.println(arr);
                        } 

                        }
                    }
                    public static void main(string[] args){
                        int[] arr={1,2,3,4,5};
                    
                    swap(arr);
                    display(arr);
                    }

        }*/
            public class arrays{
            static void display(int[] arr,int i,int j){

                for(int x=i;x<arr.length && x<=j;x++)
                System.out.println(arr[x] + " ");
                System.out.println();

            }


        }
            static void main(string[] args){
                int[] arr={1,2,3,4,5,6};

              display(arr);
            }
        
        
    
    
    



        
        
           
          
           
        
        

    


