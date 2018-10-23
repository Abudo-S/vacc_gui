/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

/**
 *
 * @author time tec
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author user
 */
public class client extends person implements Serializable {

     
 public int hour;
 public String day;
 public String drug;
 double evnumber;
 //double cost;
 public timeslot t;
 public String payment_type;
 long nvisa;
 String email;
   final String clientFileName = "client.bin";
  public static ArrayList<client> clients = new ArrayList<client>();
  
 
/*public client(int hour,String day,String drug,double evnumber,String payment_type,timeslot t)        
{
    this.evnumber=evnumber;
    this.day=day;
    this.drug=drug;
    this.hour=hour;
    this.payment_type=payment_type;
    this.t=t;
}*/
public client(){
    
}
public void set_email(String email)
{
    this.email=email;
}

public String get_email()
{
    return email;
}
public void set_evnumber(double evnumber)
{
    this.evnumber=evnumber;
}

public double get_evnumber()
{
    return evnumber;
}
public void set_nvisa(long nvisa){
    this.nvisa=nvisa;
}
public long get_nvisa(){
    return nvisa;
}
public void make_app()
{
    int nnumber;
    nnumber=clients.size();
   
      t.orderedh[nnumber]=this.hour;
    
   
      t.orderedd[nnumber]=this.day;
}
public void delete_app(String day,int hour)
{
    int i=0;
    int m=0;
  while(i<t.orderedh.length-1)
  {
      if(t.orderedh[i]==hour)
      {
         m=1;
      }
      if(m==1)
      {
           t.orderedh[i]=t.orderedh[i+1];
      }
      m=0;
      i++;
  }
  t.orderedh[i]=0;
  System.out.println("1 appointment has been deleted in: "+day);
  i=0;
  m=0;
  while(i<t.orderedd.length-1)
  {
      if(t.orderedd[i]==day)
          m++;
  }
  if(m==1)
  {
       while(i<t.orderedd.length)
       {
            if(t.orderedd[i]==day)
           t.orderedd[i]=t.orderedd[i+1];
       } 
       t.orderedd[i]=null;
  }
  //int x;
  //   x= getclientnum(id);
  //clients.remove(x);
}
void search_time()
{
    t.show_time();
}
/*void check_visa()
{
    if(payment_type=="visa")
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your visa number");
        nvisa=sc.nextInt();
    }
}*/

public void loadFromFile() {
        clients = (ArrayList<client>) FManger.read(clientFileName);
    }
public boolean commitToFile() {
        return FManger.write(clientFileName, clients);
    }
   /* public boolean addclient() {
        loadFromFile();
        clients.add(this);
        return commitToFile();
    }*/
    
   /* public String display() {
        loadFromFile();
        String S = "\nAll clients:\n";
        for (client x : clients) {
            S = S + x.toString();
        }
        return S;
    }*/
 public client searchclienttById(int id) {
        client temp = new client();
        loadFromFile();
        int index = getclientnum(id);
        if (index != -1) {
            return clients.get(index);
        } else {
            return temp;
        }
    }
    
    public int getclientnum(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).get_id() == id) {
                return i;
            }
        }
        return -1;
    }
   /* public boolean delete(int id) {
        loadFromFile();
        int index = getclientnum(id);

        if (index != -1) {
            clients.remove(index);

            return commitToFile();
        }
        return false;
    }*/
   /*  public boolean update(int oldid, client x) {
        loadFromFile();
        int index = getclientnum(oldid);

        if (index != -1) {
            clients.set(index, x);

            return commitToFile();
        }

        return false;
    }*/
    @Override
   public String toString() {
     return("first name:"+fname+"\n"+"last name:"+lname+"\n"+"age:"+age+"\n"+"id:"+id+"\n"+"day:"+day+"\n"+"hour:"+hour+"\n"+"pay in:"+payment_type+"\n"+"email:"+email+"\n"+"drug:"+drug);
    }
}
