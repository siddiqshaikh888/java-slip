class ObjectCounter{
static int ObjectCount = 0;
public ObjectCounter(){
ObjectCount++;
}
public static void getObjectCount(){
System.out.println("the number of object is : "+ObjectCount);
}
}
class Slip14Q1{
public static void main(String args[]){
ObjectCounter obj1 = new ObjectCounter();
ObjectCounter obj2 = new ObjectCounter();
ObjectCounter.getObjectCount();
}
}