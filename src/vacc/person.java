/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

import java.io.Serializable;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mt
 */
public abstract class person implements Serializable{
  protected int age;
  protected int id;
  protected String fname;
  protected String lname;
       binfile FManger = new binfile();
    public person(){
        
    }
   public void set_id(int id){
        this.id=id;
    }
    public void set_age(int age){
       this.age=age;
   }
    public void set_fname(String fname){
       this.fname=fname;
   }
    public void set_lname(String lname){

       this.lname=lname;
   }
   
   public int get_id(){
        return id;
    }
   public int get_age(){
       return age;
   }
   public String get_fname(){
       return fname;
   }
   public String get_lname(){
       return lname;
   } 
    
  @Override
   public abstract String toString();

    /*public boolean login(JTextField jTextFieldusername, JPasswordField jPasswordFieldpassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

}