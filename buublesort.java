import java.util.Scanner;
class buble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int temp ;


    for(int i=0;i<(n-1);i++){

        for (int j=0;j<(n-i-1);j++){

            if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
                     }
                 }
             }
             System.out.println("sorted array is");
                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
                }                 
    }
}




