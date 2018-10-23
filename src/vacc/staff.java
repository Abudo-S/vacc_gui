


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;
import java.io.Serializable;
/**
 *
 * @author mt
 */
public abstract class staff extends person implements Serializable {
     protected double salary;
     protected String email;
     protected String pass;
    public staff(double salary){
        this.salary=salary;
    }
    public staff()
    {
        
    }
    public void set_salary(double salary){
        this.salary=salary;
    }
    public double get_salary(){
        return salary;
    }  
    public void set_email(String email){
       this.email=email;
   }
   public void set_pass(String pass){
       this.pass=pass;
   }
    public String get_email(){
       return email;
   }
   public String get_pass(){
       return pass;
   }
   
      @Override
    public abstract String toString();
    public abstract boolean login(String username,String pass);
    
}
