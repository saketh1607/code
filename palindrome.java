import java.util.Scanner;
class Palindrome{
  public static void main(String[] args){
     int n,temp;
     Scanner sc= new Scanner(System.in);
     int d;
     System.out.println("enter a number of digits");
     d=sc.nextInt();

     System.out.println("enter a number");

     n=sc.nextInt();
     int[] arr = new int[10]; 
     int count=0,dc=0,k=n;
     while(n>0){
              temp=n%10;
              arr[temp]++;
            n=n/10; 
     }

     for(int i=0;i<10;i++){
            if(arr[i]==0){
                 continue;
           }
           else if(arr[i]>1){
                count+=arr[i];
          }
         
        
 }
             


   if(d%2==0){
         if((count==d)&&count>0){
              System.out.println("possible");
          }
          else{
                System.out.println("Not possible");
          }
  }
  else{
      if(((count==d-1)||(count==d))&&count>0){
              System.out.println("possible");
          }
          else{
                System.out.println("Not possible");
          }
}
}
}

