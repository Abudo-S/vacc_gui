package vacc;

import java.io.*;

/**
 *
 * @author time tec
 */
public class seller extends staff implements Serializable {
    //String email;
     final String sellerFileName = "seller.bin";
      
    public seller() {
  
    }
   /* public void set_email(String email)
    {
    this.email=email;
     }

public String get_email()
   {  
    return email;
   }*/
    public void make_invoice(vacc_center v,client c,invoice in)
    {//agg
       for(int i=0;i<v.drugs.length;i++)
       {
        if(v.drugs[i]==c.drug)
           v.stock_quantity[i]--;
        v.check_stock(c.drug);
              in.show_invoice(v);
       }
    }
    @Override
    public boolean login(String username,String pass){
     if(username.equals("seller123@hotmail.com")&&pass.equals("12345"))
     {
          this.email=username;
          this.pass=pass;
        return true;
     }
     else
        return false;
}
    @Override
   public String toString()
   {
    return("age:"+age+"\n"+"first name:"+fname+"\n"+"last name:"+lname+"\n"+"email:"+email+"\n"+"pass:"+pass+"\n"+"id:"+id+"\n"+"salary:"+salary+"\n");
   }
}
