package com.company;

public class Main {

    public static void main (String[] args) throws Exception  {

        BankAccount ba = new BankAccount();
        ba.deposit(10000.0);
        System.out.println(ba.getAmount());
        ba.withDraw(6000);
        System.out.println(ba.getAmount());
       // try {
       //     ba.withDraw(6000);
       // } catch (Exception e) {
        //    e.getMessage();
          //  System.out.println(ba.getAmount());
        }
    }

