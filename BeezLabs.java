import java.util.*;
public static void main(String[] args){
Scanner sca = new Scanner(System.in);
System.out.println("Enter x and y");
int x=sca.nextInt();
int y=sca.nextInt();
System.out.println("Before Swapping");
System.out.println("x="+x);
System.out.println("y="+y);
x=x+y;
y=x-y;
System.out.println("After Swapping");
System.out.println("x="+x);
System.out.println("y="+y);
