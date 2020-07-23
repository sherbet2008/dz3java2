package com.company;

public class BankAccount extends Exception {

    private double amount;
 public BankAccount (){
     amount = 0.0;
 }
    double getAmount(){
        return amount;
}
   void deposit(double sum){
        amount += sum;
   }
    void withDraw(int sum) throws Exception{


        if( sum < amount  ) {
            amount -= sum;
        }  else throw new Exception(" Не хватает средств. ");

        }

    }
