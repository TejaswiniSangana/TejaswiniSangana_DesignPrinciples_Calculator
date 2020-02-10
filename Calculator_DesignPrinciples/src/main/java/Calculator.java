import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int number1,number2;
        int operand=0;
        String op="";
        System.out.println("number1");
        number1=scanner.nextInt();
        System.out.println("Operand\n1.+\n2.-\n3.*\n4./");
        operand=scanner.nextInt();
        System.out.println("number2");
        number2=scanner.nextInt();
        if(operand==1){
            Addition addition=new Addition();
            addition.operate(number1,number2);
        }
        else if(operand==2){
            Subtraction subtraction=new Subtraction();
            subtraction.operate(number1,number2);
        }
        else if(operand==3){
            Multiplication multiplication=new Multiplication();
            multiplication.operate(number1,number2);
        }
        else if(operand==4){
            Division division=new Division();
            division.operate(number1,number2);
        }
    }
}
