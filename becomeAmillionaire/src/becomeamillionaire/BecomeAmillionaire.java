/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becomeamillionaire;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class BecomeAmillionaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Millionaire Project by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        double interestRate = 0;
        double depositAmount = 0;
        double accountBalance = 0;
        int numberOfCycles = 0;
        boolean printed100000message = false;
        System.out.print("How much money are you depositing? ");
        depositAmount = computerKeyboardInput.nextInt();
        System.out.print("Which interest rate did you choose? ");
        interestRate = computerKeyboardInput.nextDouble();
        interestRate = interestRate / 100;
        accountBalance = depositAmount;
        do {
            numberOfCycles = numberOfCycles + 1;
            accountBalance = accountBalance + (accountBalance * interestRate);
            if (accountBalance > 100000 && printed100000message == false) {
                System.out.println("After " + numberOfCycles + " cycles, it's worth more than $100,000");
                printed100000message = true;
            }
        } while (accountBalance < 1000000);
        System.out.println("After " + numberOfCycles + " cycles, it's worth more than $1,000,000");
    }
}
