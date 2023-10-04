package main;

public class Bankaccount {
    int id;
    String name;
    double balance;


    public static void main (String [] args) {

       Bankaccount MyAccount = new Bankaccount();
       Bankaccount YourAccount = new Bankaccount();
       Bankaccount HisAccount = new Bankaccount();


       MyAccount.id = 1;
       MyAccount.name = "Danil";
       MyAccount.balance = 21.12;


       YourAccount.id = 3;
       YourAccount.name = "Salam";
       YourAccount.balance = 10.10;



       HisAccount.id = 5;
       HisAccount.name = "Alan";
       HisAccount.balance = 8.11;


        System.out.println(MyAccount.balance);




    }


}
