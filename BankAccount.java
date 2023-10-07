class BankAccount{
    //constructors -- this are methods called when an object is created/instantiated 
    public BankAccount(double useramount, String userName, int userAccountNumber,
                         String userPassword,String useremail, int userCardNumber){
     amount = useramount; 
     Name = userName;
     AccountNumber = userAccountNumber;
     Password = userPassword;
     Email = useremail;
     CardNumber = userCardNumber;
    }
    // these are properties or attributes
    double amount;
    String Name;
    int AccountNumber;
    String Password;
    String Email;
    int CardNumber;
    boolean IsActivated;

    //methods
    void ActivateUser(){
        if(amount > 100){
            IsActivated = true;
        }
    } 

   
}


class Read{
    public static  void main(String[] args){
         BankAccount EniBA = new BankAccount(100, "Adeyemo Adedoyin", 85, "Wondafully", "adedoyineniola91@gmail.com", 645);
         BankAccount KolaBA = new BankAccount(000, "Adeyemo Eniola", 85, "Wonlly", "adedoyineniola56@gmail.com", 95);
        BankAccount DamiBA = new BankAccount(1000, "Osagie Kolawole", 1001, "Wonderfully", "adedoyineniola91@gmail.com", 45);   
        DamiBA.Email = " ndnfn ff";  
        System.out.println(EniBA.amount);   
        System.out.println(EniBA.Name);                         
        System.out.println(EniBA.Password);  
        DamiBA.ActivateUser();
        System.out.println(DamiBA.IsActivated);                         
                       


    }
}