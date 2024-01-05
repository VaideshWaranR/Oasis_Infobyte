import java.util.*;
class Bank{ 
    String userid,userpin;
    long accno;
    float balance=100000f;
    ArrayList<String> hist=new ArrayList<>();
    void register(){
        Scanner in=new Scanner(System.in);
        System.out.print("\nName : ");
        this.userid=in.nextLine();
         System.out.print("\nPIN: ");
        this.userpin=in.nextLine();
        this.accno=(long)(Math.random()*100000000);
        System.out.println("Registration Completed\n");
    }

    void login(){
        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter user name : ");
        String id=in.nextLine();
        System.out.print("Enter your PIN: ");
        String pin=in.nextLine();
        System.out.println();
        if(id.equals(this.userid) && (pin.equals(this.userpin))){
        System.out.println("User : "+this.userid+" "+"Account No : "+this.accno);
        System.out.println("\nLogin Successful\n");
        }
        else{
            System.out.println("Invalid Login");
        }
    }

    void Withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn");
        float amnt=sc.nextFloat();
        this.transactions(amnt);
    }

    void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be Deposited");
        float amnt=sc.nextFloat();
        if(amnt+this.balance>100000){
            System.out.println(amnt+this.balance);
            System.out.println("Limit Exceeded");}
        else{
            this.balance+=amnt;
            this.hist.add(Float.toString(amnt)+" deposited");
        System.out.println("\nDeposited\n");}
    }

    void transfer(){
        System.out.println("\nTransfered\n");
    }

    void transactions(float amount){
        if(amount>balance) System.out.println("Insufficient Balance");
        else{
        System.out.println("\nWithdrawl successful\n");
        this.balance-=amount;
        this.hist.add(Float.toString(amount)+" withdrawed");
    }
}
    void history()
    {
        if(hist.size()!=0){
        for(String s:hist){
            System.out.println(s);
        }
        System.out.println("\nHistory retrieved\n");
    }
        else{
        System.out.println("\nNo Transactions made\n");
            } 
             }
    void balance(){
        System.out.println("Balance : "+this.balance+"\n");
    }
}
public class Oasis_Infobyte_task_3 {
public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("Welcome");
    int ch,n=6;
    for (int i=0;i<n;i++){
        if(n/2==i){
            System.out.println("* 1.Register  *");
            System.out.println("*  2.Exit     *");
        }
        for (int j=0;j<15;j++){
            if (i==0 || j==0 ||  i==n- 1|| j==15-1){
                System.out.print("*");
            }
            else {
        System.out.print(" ");
            }
        }
        System.out.println();
    }
        int choice;
        choice=inp.nextInt();
    if(choice==1){
        Bank b=new Bank();
        System.out.println();
        b.register();
        for (int i=0;i<n;i++){
        if(n/2==i){
            System.out.println("*  1.Login    *");
            System.out.println("*  2.Exit     *");
        }
        for (int j=0;j<15;j++){
            if (i==0 || j==0 ||  i==n- 1|| j==15-1){
                System.out.print("*");
            }
            else {
        System.out.print(" ");
            }
        }
        System.out.println();
    }

        choice=inp.nextInt();
        if(choice==1){
            b.login();
             n-=2;
    do{
        for (int i=0;i<n;i++){
        if(n/2==i){
            System.out.println("*   1.Withdraw             *");
            System.out.println("*   2.Deposit              *");
            System.out.println("*   3.Transfer             *");
            System.out.println("*   4.Transaction History  *");
            System.out.println("*   5.Balance              *");
            System.out.println("*   6.Exit                 *");
 
        }
        for (int j=0;j<28;j++){
            if (i==0 || j==0 ||  i==n- 1|| j==28-1){
                System.out.print("*");
            }
            else {
        System.out.print(" ");
            }
        }
        System.out.println();
    }  
       ch=inp.nextInt();
       switch(ch){
        case 1:
        b.Withdraw();
        break;
        case 2:
        b.deposit();
        break;
        case 3:
        b.transfer();
        break;
        case 4:
        b.history();
        break;
        case 5:
        b.balance();
        break;
        case 6:break;
       }
    }while(ch!=6);
}
}
 System.out.println("\nThanks for using this ATM service");
inp.close();
}
    
}