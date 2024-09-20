//This is the main class
package futis;
import java.util.Scanner;
import java.util.Date;
public class Futis {
    Scanner cin = new Scanner(System.in);
    Date now = new Date();
    //all the Atributes fro Regitration
    int cus_id= 1000, cus_Pnumber;
    // all atributes for odering
    int order_id = 200;
    String order_date;
    //product atributes
    String p_name;
     String p_describtion;
    int p_id, p_totalprice,p_price;
    //atributes in employee
    int emp_id;
   // supply atributes
    int sup_id;
   
    
    
  
    public static void main(String[] args) {
     Customer.Oldchild();
    
    }
    
}
