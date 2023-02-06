//!!InfoByte Internship Task-3(ATM Interface), done by Manikanth!!//
import java.util.Scanner;
class ATM {
int balance = 2000;
int realpass = 307863;
int count = 0;
String transaction_history ="";
public void pin() {
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE USERID: ");
String name=sc.nextLine();
System.out.println("ENTER THE PIN: ");
int pass=sc.nextInt();
if (pass==realpass) {
System.out.println("***LOGGED IN SUCCESSFULLY***");
menu();
} else {
System.out.println("INCORRECT PASSWORD,TRY AGAIN");
}}
public void menu() {
System.out.println("1.TRANSACTION HISTORY");
System.out.println("2.WITHDRAW CASH");
System.out.println("3.DEPOSIT CASH");
System.out.println("4.TRANSFER CASH");
System.out.println("5.QUIT");
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE CHOICE:");
int num=sc.nextInt();
switch(num) {
case 1:
transaction_history();
break;
case 2:
withdraw();
break;
case 3:
deposit();
break;
case 4:
Transfer();
break;
case 5:
System.out.println("!!!!!!!!!!LOGGED OUT SUCCESSFULLY!!!!!!!!!!");
break;
default:
System.out.println("ENTER A VALID CHOICE!");
menu();
}}
public void transaction_history() {
if (count == 0) {
System.out.println("NO TRANSACTIONS PERFORMED!");
menu();
} else {
System.out.println("TRANSACTION HISTORY:");
System.out.println("\n" + transaction_history + "\n");
menu();
}}
public void withdraw() {
System.out.println("ENTER CASH TO WITHDRAW:");
Scanner sc = new Scanner(System.in);
int money = sc.nextInt();
if (money > balance) {
System.out.println("INSUFFICIENT BALANCE FOUND");
menu();
} else {
balance -= money;
System.out.println("WITHDRAW SUCCESSFUL, your balance is: " + balance);
count += 1;
String transact = count + ". " + money + " " + "/- has been withdrawn, balance is " + balance;
transaction_history = transaction_history.concat(transact + "\n");
menu();
}}
public void deposit() {
System.out.println("ENTER CASH TO DEPOSIT: ");
Scanner sc = new Scanner(System.in);
int money = sc.nextInt();
balance += money;
System.out.println("DEPOSIT SUCCESSFUL, your balance is: " + balance);
count += 1;
String transact = count + ". " + money + " " + "/- has been deposited, balance is " + balance;
transaction_history = transaction_history.concat(transact + "\n");
menu();
}
public void Transfer() {
System.out.println("ENTER CASH TO TRANSFER: ");
Scanner sc = new Scanner(System.in);
int money = sc.nextInt();
if (money > balance) {
System.out.println("INSUFFICIENT BALANCE FOUND");
menu();
} else {
balance -= money;
System.out.println("TRANSFER SUCCESSFUL, your balance is: " + balance);
count += 1;
String transact = count + ". " + money + " " + "/- has been transfered, balance is " + balance;
transaction_history = transaction_history.concat(transact + "\n");
menu();
}}}
public class ATM_interface {
public static void main(String[] args) {
ATM object = new ATM();
object.pin();
}}
//!!InfoByte Internship Task-3(ATM Interface), done by Manikanth!!//
