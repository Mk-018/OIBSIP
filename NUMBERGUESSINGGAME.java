//**InfoByte Internship Task-2(Number Guessing Game),done by Manikanth**//
import java.util.Random;
import java.util.Scanner;
class NUMBERGUESSINGGAME{
public static void main(String[] args){
System.out.println("NUMBER GUESSING GAME! START THE GAME");
Scanner sc = new Scanner(System.in);
Random randint = new Random();
int R = randint.nextInt(100)+1;
int N;
int score =100;
do {
System.out.println("Guess the Number(1-100):");
N = sc.nextInt();
if (N > R) {
System.out.println("HIGHER THAN GUESSED NUMBER");
score-=6;
} else if (N < R) {
System.out.println("LOWER THAN GUESSED NUMBER");
score-=6;
} else {
System.out.println("*******GOT IT*******");
}}
while (N!= R);
System.out.println("SCORED POINTS" + score);
}}
