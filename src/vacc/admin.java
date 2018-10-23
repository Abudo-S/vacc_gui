/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mt
 */
public class admin extends staff implements Serializable{
   private final String adminFileName = "admin.bin";
    public admin(){
 
    }   
     /*public void add_c(int hour,String day,String drug,double evnumber,String payment_type) {
        client x = new client( hour, day, drug, evnumber, payment_type);
        if (x.addclient()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
     public void list() {
        client x = new client();
        System.out.println(x.display());
    }
    
     public void delete_c(int id) {
        client x = new client();
        if (x.delete(id)) {
           System.out.println("client: "+ id + " deleted.");
        } else {
            System.out.println("failed.");
        }
    }
      public void update_c(int oldid, client cli) {
        client x = new client();
        if (x.update(oldid,cli)) {
            System.out.println(cli.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }*/
  
   public boolean add_c(client c)
   {
       int i=c.clients.size();
       if(i==0)
       c.commitToFile();
       c.loadFromFile();
       c.clients.add(c);
       return c.commitToFile();
   }
   public ArrayList<client> list(client c) {
        c.loadFromFile();
        return c.clients;
    }
     public boolean delete(int id) {
         client c=new client();
          c.loadFromFile();
        int index = c.getclientnum(id);

        if (index != -1) {
            c.clients.remove(index);

            return c.commitToFile();
        }
        return false;
    }
      /*public void VloadFromFile(vacc_center v) {
       v=(vacc_center)FManger.read(v.vaccFileName);
    }*/
     public boolean update(client x) {
        x.loadFromFile();
        int index = x.getclientnum(x.get_id());
        if (index != -1) {
            x.clients.set(index, x);

            return x.commitToFile();
        }

        return false;
    }
    /*public boolean add_vacc(vacc_center v)
   {
       return FManger.write(v.vaccFileName,v);       
   }*/
    public boolean add_supplier(supplier su,vacc_center v)
     {
         v.su=su;
         return FManger.write(su.supplierFileName,su);
     }
     public boolean add_seller(seller se,vacc_center v)
     {
         v.se=se; 
         return FManger.write(se.sellerFileName,se);
     }
     public void add_admin(admin ad,vacc_center v)
     {
         v.ad=this;
         FManger.write(adminFileName,this);
     }
      @Override
      public boolean login(String username,String pass){
     if(username.equals("admin123@hotmail.com")&&pass.equals("12345"))
     {
          this.email=username;
          this.pass=pass;
          return true;
     }
     else
        return false;
}
  @Override
    public String toString() {
        return "admin : " + fname + " " + lname + "\n" + "id : " + id+ "\n" + " age : " + "\n" +" salary : " + salary+ "\n"+age+ " username : " + email+ "\n"+ " pass : " + pass ;
                }
}
