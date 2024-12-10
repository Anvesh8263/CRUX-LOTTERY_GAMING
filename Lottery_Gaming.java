import java.util.Scanner;
public class Lottery_Gaming{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    // lottery game price are Macbook Pro , Apple Watch , Audi Car, Rolls Royce
        if(n>=5000 && n<=10000){
            System.out.println("Congratulation you Won a Macbook Pro");
        }
        else if(n>=11000 && n<=20000){
            System.out.println("Congratulation you won a Apple Watch ");
        }
        else if(n>=21000 && n<=50000){
            System.out.println("Congratulation You Won a Audi Car");
        }
        else if(n>=70000 && n<=100000){
            System.out.println("Congratulation you won a Rolls Royce");
        }
        else{
            System.out.print("Happy Birthday");
        }
    }
}
