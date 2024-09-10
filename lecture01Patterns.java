public class lecture01Patterns {
    public static void main(String args[]) {
//  ans 1
      /*   int n=5,i,j;
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}*/
    

      //ans 2
      /* int n=5;
     for(int i=0;i<n;i++) {
      for(int j=0;j<=i;j++){
       System.out.print("*");
      }
       System.out.println();
    }
}
}*/
    


       //ans3
       /*int n=5;
        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.println();
            
        }
    }
}*/
//ans 4
    
      /*  int n =9;
       
        for(int i=1;i<=n;i++) {
            
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {

            
            System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// ans5
           /* int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}*/
//ans7
/*int n =5;
for(int i=0;i<=n;i++) {
    for(int j=0;j<=n;j++){
        if( i==0||j==0|| i==n||j==n){
            
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }*/
    //ans 8
        /*int n=5;
         for(int i = 1; i <= n; i++) { 
            for(int j = 1; j <= n; j++) { 
                if(i == j || j == (n - i + 1)) { 
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
}
}*/
//ans 9
/*int n=5;
for(int i = 0; i < n; i++) { 
    for(int j = n - i; j > 1; j--) { 
        System.out.print(" "); 
    }
    for(int k = 0; k <= i; k++) { 
        System.out.print("* "); 
    }
    System.out.println(); 
}
}
}*/
//ans 10
/*int n =5;
for(int i = n ; i >= 1; i--) { 
    for(int j = n; j > i; j--) { 
        System.out.print(" ");
    }
    for(int k = 1; k <= (2 * i - 1); k++) { 
        System.out.print("*"); 
    }
    System.out.println();
}

    }
}*/
//ans 11
/*int n=5;
for (int i = 1; i <= n; i++) { 
  
 
    for (int j = n; j >= i; j--) { 
        System.out.print(" "); 
    } 

    
    for (int j = 1; j <= i; j++) { 
        System.out.print("* "); 
    } 

    
    System.out.println(); 
} 
} 
} */

//ans12
//ans13
/*int n=5;
for (int i= 0; i<= n-1; i++)  {
 
for (int j=0; j<=i; j++)  {
  
System.out.print("*"+ " ");  }
  
System.out.println("");   }

for (int i=n-1; i>=0; i--)  {

for(int j=0; j <= i-1;j++)  {

System.out.print("*"+ " ");  
}  
System.out.println("");  
}  
}  
}  */
//ans 14
/*int n=5;
for (int i= 1; i<= n ; i++)  {

for (int j=i; j <n ;j++)   {         
 
System.out.print(" ");  }


for (int k=1; k<=i;k++) { 

System.out.print("*");   
}   
System.out.println("");   
}   
for (int i=n; i>=1; i--)  {

for(int j=i; j<=n;j++)  {

System.out.print(" ");  
}  
for(int k=1; k<i ;k++)   
{  
System.out.print("*");  
}  
System.out.println("");  
}  

}  
} */ 
//ans 15
//ans 16
//ans 17
//ans 18
/*int n=7;
int space = n - 1;  
for (int j = 1; j<= n; j++)  
{  
for (int i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (int i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space = 1;  
for (int j = 1; j<= n - 1; j++)  
{  
for (int i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (int i = 1; i<= 2 * (n- j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}  */
//ans 19
//ans 20
/*int n=7;
for (int i=1; i<= n ; i++)   
{  
for (int j = n ; j > i ; j--)   
{  
System.out.print(" ");  
}  
System.out.print("*");  
for (int k = 1; k < 2*(i -1) ;k++)   
{   
System.out.print(" ");   
}  
if( i==1)   
{   
System.out.println("");  
}  
else  
{  
System.out.println("*");   
}  
}   
for (int i=n-1; i>= 1 ; i--)  
{  
for (int j =n; j > i ; j--)   
{  
System.out.print(" ");  
}  
System.out.print("*");  
for (int k = 1; k < 2*(i -1) ;k++)   
{  
System.out.print(" ");  
}  
if(i==1)  
System.out.println("");  
else  
System.out.println("*");  
}  
}  
}  */
//ans 21
//ans 22
//ans 23
//ans24
/*int n=5;
for (int i = 1; i <= n; i++) {
    
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    
    System.out.println();
}
}
}*/
//ans 25
//ans 26


    

