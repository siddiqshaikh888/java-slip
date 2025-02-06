import java.util.*;
class Slip11Q1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many elements in array");
int n =sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Element of array :");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
int FirstMin = Integer.MAX_VALUE;
int SecondMin = Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
if(arr[i]<FirstMin){
SecondMin = FirstMin;
FirstMin = arr[i];
}
else if(arr[i]<SecondMin && arr[i]!=FirstMin) {
SecondMin = arr[i];
}
}
System.out.println("Second largest element is :"+SecondMin);
}
}