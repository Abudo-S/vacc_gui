/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mt
 */
public abstract class person {
    protected int age;
    protected int id;
    protected String fname;
    protected String lname;
    protected String username;//email
    protected String pass;
    public person(){
        
    }
   void set_id(int id){
        this.id=id;
    }
   void set_age(int age){
       this.age=age;
   }
   void set_fname(String fname){
       this.fname=fname;
   }
   void set_lname(String lname){
       this.lname=lname;
   }
   void set_username(String username){
       this.username=username;
   }
   void set_pass(String pass){
       this.pass=pass;
   }
   int get_id(){
        return id;
    }
   int get_age(){
       return age;
   }
   String get_fname(){
       return fname;
   }
   String get_lname(){
       return lname;
   }
   String get_username(){
       return username;
   }
   String get_pass(){
       return pass;
   }

   public boolean login(String username,String pass){
     if(username.equals("admin123@hotmail.com")&&pass.equals(12345))
        return true;
     else
        return false;
}
@Override
    public abstract String toString();

}