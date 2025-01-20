import java.util.Scanner;
class Greatest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int num1 = sc.nextInt();
System.out.println("Enter second number:");
int num2 = sc.nextInt();
System.out.println("Enter third number:");
int num3 = sc.nextInt();

int greater;
if(num1 >= num2 && num1 >= num3){
greater = num1;
}
else if (num2 >= num3 && num2 >= num1){
greater = num2;
}
else{
greater = num3;
}
System.out.println("The greatest among three numbers is:" + greater);

}
}