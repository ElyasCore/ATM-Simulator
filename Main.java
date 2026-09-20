
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 1000;
        System.out.println();
        System.out.println("اختر اللغة/Select a Language: ");
        System.out.println();
        System.out.println("للعربية اضغط 1");
        System.out.println("For English press 2: ");
        int select = in.nextInt();
        if(select != 1 && select != 2) {
            while(true) {
                System.out.println("رقم غير صحيح, اختر 1 او 2");
                System.out.print("Invalid number, select 1 or 2: ");
                select = in.nextInt();
                if(select == 1 || select == 2) {
                    break;
                }
            }
        }
        switch (select) {
            case 1:
                while(true) {
                    System.out.println("===== الصراف الالي =====");
                    System.out.println("1. التحقق من رصيد الحساب");
                    System.out.println("2. ايداع");
                    System.out.println("3. سحب");
                    System.out.println("4. خروج");
                    int number = in.nextInt();
                    if (number != 1 && number != 2 && number != 3 && number != 4) {
                        while (true) {
                            System.out.print("اختر رقم من 1-4: ");
                            number = in.nextInt();
                            if (number == 1 || number == 2 || number == 3 || number == 4) {
                                break;
                            }
                        }
                    }
                    switch (number) {
                        case 1:
                            System.out.println("الرصيد الحالي: " + balance);
                            break;
                        case 2:
                            System.out.print("حدد مبلغ الايداع: ");
                            int deposit = in.nextInt();
                            if (deposit <= 0) {
                                while (true) {
                                    System.out.print("خطأ, اختر رقم اكبر من 0: ");
                                    deposit = in.nextInt();
                                    if (deposit > 0) {
                                        break;
                                    }
                                }
                            }
                            System.out.println("تمت عملية الايداع بنجاح!");
                            balance += deposit;
                            System.out.println("رصيدك الان: " + balance);
                            break;
                        case 3:
                            if(balance == 0) {
                                System.out.println("لا يمكنك اجراء عملية سحب, رصيدك الحالي 0");
                                break;
                            }
                            System.out.println("رصيدك الحالي هو: " + balance);
                            System.out.print("حدد مبلغ السحب: ");
                            int withdrawal = in.nextInt();
                            while (true) {
                                if (withdrawal <= 0) {
                                    System.out.print("رقم خاطئ, حاول مجددا: ");
                                    withdrawal = in.nextInt();
                                } else if (withdrawal > balance) {
                                    System.out.print("رصيدك غير كافي, حاول مجددا: ");
                                    withdrawal = in.nextInt();
                                }else {
                                    break;
                                }
                            }
                            System.out.println("تمت عملية السحب بنجاح!");
                            balance -= withdrawal;
                            System.out.println("رصيدك الان: " + balance);
                            break;
                        case 4:
                            System.out.println("شكرا لاستخدامك الصراف الالي!");
                            break;
                    }
                    if (number == 4) {
                        break;
                    }
                }
                break;
            case 2:
                while(true) {
                    System.out.println("===== ATM =====");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    int number = in.nextInt();
                    if(number != 1 && number != 2 && number != 3 && number != 4){
                        while(true){
                            System.out.print("Choose a number between 1-4: ");
                            number = in.nextInt();
                            if(number == 1 || number == 2 || number == 3 || number == 4) {
                                break;
                            }
                        }
                    }
                    switch (number) {
                        case 1:
                            System.out.println("Current Balance: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter deposit amount: ");
                            int deposit = in.nextInt();
                            if (deposit <= 0) {
                                while (true) {
                                    System.out.print("Error, Enter a number above 0: ");
                                    deposit = in.nextInt();
                                    if (deposit > 0) {
                                        break;
                                    }
                                }
                            }
                            System.out.println("Deposit successful!");
                            balance += deposit;
                            System.out.println("Your Balance now is: " + balance);
                            break;
                        case 3:
                            if(balance == 0) {
                                System.out.println("You can't withdrawal, you have 0 balance");
                                break;
                            }
                            System.out.println("Your current balance is: " + balance);
                            System.out.print("Enter withdrawal amount: ");
                            int withdrawal = in.nextInt();
                            while (true) {
                                if(withdrawal <= 0) {
                                    System.out.print("Invalid number, try again: ");
                                    withdrawal = in.nextInt();
                                }else if (withdrawal > balance) {
                                    System.out.print("Insufficient balance, try again: ");
                                    withdrawal = in.nextInt();
                                }else{
                                    break;
                                }
                            }
                            System.out.println("Withdrawal successful!");
                            balance -= withdrawal;
                            System.out.println("Your Balance now is: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for using the ATM!");
                            break;
                    }
                    if (number == 4) {
                        break;
                    }
                }
                break;
        }
    }
}