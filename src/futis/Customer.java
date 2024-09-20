package futis;
public class Customer extends Futis {
    String cus_firstname, cus_lastname;   
    String cus_town, cus_subtown; 
    int optionTown, optionSubtown;
    int p_quantity;
    String payment;
    int optionFood,optionPayment;
    String emp_name,emp_lastname,emp_gender;
    int emp_age,emp_contact;
    String sup_name, sup_contratExpirey,sup_location;
    int sup_contact;
    
    
   
public void registration(){
    cus_id++;
    order_id++;
    System.out.println("PLEASE ENTER DETAILS BELLOW");
    System.out.println("*****************************\n");
    System.out.println("FIRSTNAME");
   cus_firstname = cin.next();
    System.out.println("LASTNAME");
    cus_lastname = cin.next();
    System.out.println("PHONE NUMBER");
    cus_Pnumber = cin.nextInt();
}
public void quantity(){
  p_quantity = cin.nextInt();
  p_totalprice = p_price * p_quantity;
} 
public void locationTown(){
    optionTown = cin.nextInt();
    switch(optionTown){
        case 1:
            cus_town = "Mbabane";
            break;
        case 2:
            cus_town = "Nhalangano";
            break;
        case 3:
            cus_town = "Hlatikhulu";
            break;
        case 4:
            cus_town = "Mahlanya";
            break;
        case 5:
            cus_town = "Manzini";
            break;
        case 6:
            cus_town = "Siteki";
            break;
        case 7:
            cus_town = "Simunye";
            break;
        case 8:
            cus_town = "Big Band";
            break;
        case 9:
            cus_town = "Pigg's Peak";
            break;
        case 10:
            cus_town = "Matsapha";
            
    }   
}
public void locationSubtown(){
     optionSubtown = cin.nextInt();
      switch(optionSubtown){
        case 1:
            cus_subtown = " Zone 1";
            break;
        case 2:
            cus_subtown = " Zone 2";
            break;
        case 3:
            cus_subtown = "Sandla";
            break;
        case 4:
            cus_subtown = "Sdvashini";
            break;
        case 5:
           cus_subtown = "Mbangweni";
            break;
        case 6:
           cus_subtown = "Woodlands";
            break;
        case 7:
            cus_subtown = "Thembelisha";
            break;
        case 8:
            cus_subtown = "Skom";
            break;
        case 9:
            cus_subtown = "Mangwaneni";
            break;
        case 10:
            cus_subtown = "Around Town";
}}
public void foodAssign(){
    optionFood = cin.nextInt();
    switch(optionFood){
        case 1:
            p_name = "2 Pieces";
            p_id = 301;
            p_price = 45;
           p_describtion = "Sweet chilli";
            break;
        case 2:
             p_name = "Chips";
              p_id = 302;
              p_price = 20;
             p_describtion = "tomoto liking good";
             break;
        case 3:
             p_name = "Burger";
              p_id = 303;
              p_price = 50;
              p_describtion = "extra cheese";
             break;
        case 4:
             p_name = "Drink";
              p_id = 304;
              p_price = 30;
              p_describtion = "cocacola";
             break;
            
}}
public void PaymentAssign(){
     optionPayment = cin.nextInt();    
    switch(optionPayment){
        case 1:
            payment = "Credit Card";
            break;
        case 2:
            payment = "eWallet";
            break;
        case 3:
            payment = "MOMO";
            break;
        case 4:
            payment = "eMali";
            
}}
public void empDefination(){
    if(p_id == 301){
        emp_id = 5505;
        emp_name = "Simiso";
        emp_lastname = "Ndlandla";
        emp_contact = 78127878;
        emp_gender = "M";
        emp_age = 28;
    }
    else if(p_id ==302){
         emp_id = 4404;
        emp_name = "Notsile";
        emp_lastname = "Zungu";
        emp_contact = 79685755;
        emp_gender = "F";
        emp_age = 30;
    }
    else if(p_id ==303){
         emp_id = 3303;
        emp_name = "Ntsiki";
        emp_lastname = "Msibi";
        emp_contact = 78563456;
        emp_gender = "F";
        emp_age = 26;
    }
    else if(p_id ==304){
         emp_id = 6606;
        emp_name = "Thando";
        emp_lastname = "Mshengu";
        emp_contact = 79680000;
        emp_gender = "M";
        emp_age = 32;
    }
    else if(p_id ==305){
         emp_id = 1101;
        emp_name = "Johane";
        emp_lastname = "Hleta";
        emp_contact = 76454545;
        emp_gender = "M";
        emp_age = 34;
}}
public void supDefination(){
    if(cus_town == "Hlatikhulu" ||cus_town == "Pigg's Peak" ||cus_town == "Nhalangano" ){
        sup_id = 9898;
        sup_name = "Jobad Foods";
        sup_location = "Zulwini";
        sup_contratExpirey = "3 years";
        sup_contact = 33003399;
    }
   else if(cus_town == "Mbabane" || cus_town == "Manzini" | cus_town == "Mahlanya" || cus_town == "Matsapa" ){
        sup_id = 1010;
        sup_name = "Umbuluzi";
        sup_location = "Shlangwini";
         sup_contratExpirey = "4 years";
        sup_contact = 33444444;
    }
   else if(cus_town == "Siteki" || cus_town == "Big Bend" || cus_town == "Simunye" ){
        sup_id = 3030;
        sup_name = "Filipo Inv";
        sup_location = "Mhlume";
        sup_contratExpirey = "3 years";
        sup_contact = 33555447;
    }
}
public void Customer(){
    System.out.println("\nCUSTOMER");
    System.out.println("Cus_ID:  "+ cus_id);
    System.out.println("Cus_Firstname:  " + cus_firstname);
    System.out.println("Cus_Lastname:  "+ cus_lastname);
    System.out.println("Cus_Town:  "+ cus_town);
    System.out.println("Cus_Subtown:  "+ cus_subtown);
    
}
public void Order(){
    System.out.println("\nORDER");
    System.out.println("\nOrder_ID:  "+ order_id);
    System.out.println("Cus_ID:  "+ cus_id);
    System.out.println("Date:  " + now);
    System.out.println("Quantiy:  "+ p_quantity);
    System.out.println("Payment:  "+ payment);
    System.out.println("Total Price:  "+ p_totalprice );
    System.out.println("P_ID:  " + p_id);
    System.out.println("P_Name:  "+ p_name);
}
public void Product(){
    System.out.println("\nPRODUCT");
    System.out.println("\n p_id:  " + p_id);
    System.out.println("p_name:  " + p_name);
    System.out.println("p_price:  " + p_price);
    System.out.println("Describtion:  "+ p_describtion);
    System.out.println("Supply Date:  "+ now);
    System.out.println("Sup_id:  "+ sup_id);
    System.out.println("Emp_id:  "+ emp_id);
}
public void Employee(){
    System.out.println("\nEMPLOYEE");
    System.out.println("\nemp_name:  "+ emp_name);
    System.out.println("emp_id:  "+ emp_id);
    System.out.println("nemp_contact:  "+ emp_contact);
    System.out.println("emp_age:  "+ emp_age);
    System.out.println("emp_gender:  "+ emp_gender);
}
public void Supply(){
    System.out.println("\nSUPPLY");
    System.out.println("\nSup_id:  "+ sup_id);
    System.out.println("Sup_name:  "+ sup_name);
    System.out.println("Sup_Contract:  "+ sup_contratExpirey);
    System.out.println("Sup_location:  "+ sup_location);
    System.out.println("Sup_contact:  "+ sup_contact);
    System.out.println("emp_id:  "+ emp_id);
}




 public static void Oldchild(){
     Customer c = new Customer();
     Menus m = new Menus();
     c.registration();
     m.townMenu();
     c.locationTown();
     m.subTownsMenu();
     c.locationSubtown();
     m.thanks();
     m.Food();
     c.foodAssign();
     System.out.println("QUANTITY");
     c.quantity();
     m.peymentmethods();
     c.PaymentAssign();
     c.empDefination();
     c.supDefination();
     
     c. Customer();
     c.Order(); 
     c.Product();
     c.Employee();
     c. Supply();
 }
}
