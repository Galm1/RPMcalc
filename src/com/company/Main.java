package com.company;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        Stack<Float> myStack = new Stack<Float>();
        System.out.println("Enter a Number or Operator than press Enter. Enter in S to stop");
        boolean finished = false;

        while (!finished) {
            String inputLn = input.nextLine();

            if (inputLn.equals("+")) {

                myStack.push(myStack.pop() + myStack.pop());

            }else if (inputLn.equals("-")){

                Float num2 = myStack.pop();
                myStack.push(myStack.pop() - num2);

            }else if (inputLn.equals("*") || inputLn.equals("x")) {

                myStack.push(myStack.pop() * myStack.pop());

            } else if (inputLn.equals("/")) {

                Float num2 = myStack.pop();
                myStack.push(myStack.pop() / num2);

            } else if (inputLn.equals("s") || inputLn.equals("S")) {

                finished = true;

            } else {
                myStack.push(Float.parseFloat(inputLn));
            }

            System.out.println(myStack);

        }

    }
}
