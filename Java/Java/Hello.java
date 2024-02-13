class Bank{
public:
string accholder;
int accno;
double balance;
void set(String holder,int no,double bal){
accholder = holder;
accno = no;
balance = bal;
}
void get(){
System.out.println("Account holder name :"+accholder);
System.out.println("Account Number :"+accno);
System.out.println("Balance :"+balance);
}
}
public class Hello{
public static void main(String args[]){
Bank bank = new Bank();
bank.set("Prem",23,1000);
bank.get();
}
}