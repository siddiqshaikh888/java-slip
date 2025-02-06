import java.util.*;
class Slip6Q1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num  = sc.nextInt();
int fact = 1;
for(int i=2;i<=num;i++){
fact=fact*i;
}
System.out.println(fact);
}
}