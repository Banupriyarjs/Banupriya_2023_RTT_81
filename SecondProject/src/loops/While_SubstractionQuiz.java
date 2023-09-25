package loops;

import java.util.Scanner;

public class While_SubstractionQuiz {
	
	
	public static void main(String[] args) {
	
		int noofquestions=5; 
		int correctCount=0; 	//count the number of correct answers
		 int count=0;		//count the number of questions
		 long startTime=System.currentTimeMillis();
		 
		 String output=""; //output string is initially empty.
		 Scanner input= new Scanner(System.in);
		 
		 while(count<noofquestions)
		 {
			 
			 //1.Generate two random single digit number
			 int number1=(int)(Math.random()*10);
			 int number2=(int)(Math.random()*10);
			 
			 //2.If number1<number2 ,swap number1 with number2
			 if(number1<number2)
			 {
				 int temp=number1;
				 number1=number2;
				 number2=temp;
			 }
			 //3.Prompt the student to answer "what is number1-number2?"
			 
			 System.out.println("What is "+number1+" - "+number2);
			 int answer=input.nextInt();
			 
			 //4.Grade the answer to display the result
			 if(number1-number2==answer)
			 {
				 System.out.println("You are Correct!");
				 correctCount++;
			 }
			 else
			 {
				 System.out.println("Your answerr is wrong.\n"+number1+"-"+number2+" should be"+(number1-number2));
			 }
			 count++;
			 output+="\n"+number1+"-"+number2+"="+answer+((number1-number2==answer?"Correct":"Wrong"));
			 
		 }
		 

	}

}
