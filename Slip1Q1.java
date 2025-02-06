class Slip1Q1{
public static void main(String[] args){
int max = Integer.MIN_VALUE;
for(String i : args){
int num = Integer.parseInt(i);
if(num>max){
max=num;
}
}
System.out.println("The largest element of array is "+max);
}
}