import java.util.*;
class Slip9Q1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter how many family members: ");
int num = sc.nextInt();
int[] age = new int[num];
for(int i=0;i<num;i++){
System.out.print("Enter the age of member "+(i+1)+" :");
age[i] = sc.nextInt();
}
int eldestAge = age[0];
for(int i=1;i<num;i++){
if(age[i]>eldestAge){
eldestAge=age[i];
}
}
System.out.println("The eldest person in family is "+eldestAge);
}
}