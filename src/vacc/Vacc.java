
package vacc;

import javax.swing.JOptionPane;
import java.util.*;
public class Vacc {


    public static void main(String[] args) {
        try{
       /* seller s=new seller();
          
     Scanner sc= new Scanner(System.in);
            System.out.println("New seller \n"+"Enter id");
       s.set_id(sc.nextInt());
        System.out.println("Enter first name");
       s.set_fname(sc.next());
        System.out.println("Enter last name");
      s.set_lname(sc.next());
       System.out.println("Enter age");
        s.set_age(sc.nextInt());
        System.out.println("Enter the salary");
        s.set_salary(sc.nextDouble());
      System.out.println("Enter username");
      s.set_username(sc.next());
      System.out.println("Enter password");
      s.set_pass(sc.next());
      
      System.out.println("New client\n");
      System.out.println("Enter the day");
      String d,y;
      int h;
      d=sc.next();
       System.out.println("Enter the hour");
       h=sc.nextInt();
       System.out.println("Enter the drug");
      y=sc.next();
       System.out.println("Enter the cost");
       double n;
       n=sc.nextDouble();
       
        client c1=new client(h,d,y,n);
          System.out.println("Enter id");
       c1.set_id(sc.nextInt());
        System.out.println("Enter first name");
       c1.set_fname(sc.next());
        System.out.println("Enter last name");
      c1.set_lname(sc.next());
       System.out.println("Enter age");
        c1.set_age(sc.nextInt());
      System.out.println("Enter username");
      c1.set_username(sc.next());
      System.out.println("Enter password");
      c1.set_pass(sc.next());
      
      seller s1=new seller(c1);
       s1.fname=s.fname;
       s1.lname=s.lname;
       s1.salary=s.salary;
       s1.pass=s.pass;
       s1.id=s.id;
       s1.username=s.username;
       s1.age=s.age;
       System.out.println("seller's info.");
        System.out.println("age:"+s.get_age()+"\n"+"first name:"+s.get_fname()+"\n"+"last name:"+s.get_lname()+"\n"+"id:"+s.get_id()+"\n"+"salary:"+s.get_salary()+"\n");
         System.out.println("client's info.");
          System.out.println("age:"+c1.age+"\n"+"first name:"+c1.fname+"\n"+"last name:"+c1.lname+"\n"+"id:"+c1.id+"\n"+"day:"+c1.day+"\n"+"hour:"+c1.hour+"\n");
       */
        /*timeslot t=new timeslot();
        
        t.orderedd[0]="saturday";
        t.orderedd[1]="monday";
        t.orderedd[2]="saturday";
        t.orderedd[3]="wednesday";
        t.orderedd[4]="friday";
        t.orderedd[5]="sunday";
        t.orderedh[0]=1;
        t.orderedh[1]=5;
        t.orderedh[2]=3;
        t.orderedh[3]=9;
        t.orderedh[4]=8;
        t.orderedh[5]=2;
        t.orderedh[6]=7;
        t.orderedh[7]=28;
        t.show_time();
      /*  client c=new client(5,"saturday","profine",4.5,"cash");
        
        timeslot t = new timeslot();
        c.make_app();
        c.check_visa();
        
        t.show_time();*/
       //System.out.println("Enter username and pass");
        //Scanner sc=new Scanner(System.in);
       // String x=sc.next();
        //String y=sc.next();
        /*timeslot t=new timeslot();
        admin ad=new admin();
        //ad.login(x, y);
        ad.set_age(25);
        ad.set_fname("mohamed");
        ad.set_id(1);
        ad.set_lname("mahmoud");
        ad.set_salary(10000);
   
        //vacc_center v=new vacc_center("maow vacc",ad,t);
       
        client c=new client(5,"sunday","Eylea",4.7,"cash",t); 
         c.set_age(18);
        c.set_fname("karm");
        c.set_id(12);
        c.set_lname("mohamed");
        c.make_app();
        ad.add_c(c);
        c.commitToFile();
       
        System.out.println(c.toString());
        
         c.delete_app("sunday", 5,12);
         client c2=new client(9,"monday","Eylea",4.7,"cash",t); 
         c2.set_age(18);
        c2.set_fname("karm");
        c2.set_id(12);
        c2.set_lname("mohamed");
        c2.make_app();
        c2.commitToFile();
        t.show_time();*/
      exceptionrule ex=new exceptionrule();
      supplier su=new supplier();
      String fname,lname,day,email,pass,drug,payment;
      int id,age,hour;
      double salary,cost,evnumber;
      int c=0;
      Scanner sc=new Scanner(System.in);
      admin ad=new admin();
      ad.set_age(25);
      ad.set_fname("Ali");
      ad.set_id(11111);
      ad.set_lname("yassin");
      ad.set_salary(15000);
      timeslot t=new timeslot();
      
      System.out.println("Hello,enter your email");
      email=sc.next();
      System.out.println("Enter your pass");
      pass=sc.next();  
      if(ad.login(email, pass))
      {                     
          vacc_center v=new vacc_center("Mvacc",ad,t,su);
           System.out.println("1-add seller\n2-add client\n3-add supplier");
          c=sc.nextInt();
          while(c!=0)
          {
              switch(c)
              {
                  case 1:
                      seller se=new seller();
              System.out.println("firstname:");
              fname=sc.next();
              se.set_fname(fname);
               System.out.println("lastname:");
               lname=sc.next();
               se.set_lname(lname);
                System.out.println("age:");
                age=sc.nextInt();
                se.set_age(age);
                 System.out.println("salary:");
                 salary=sc.nextDouble();
                 se.set_salary(salary);
                  System.out.println("email:");
                  email=sc.next();
                  //email=ex.checkEmail("email");                 
                  se.set_email(email);
                   System.out.println("pass:");
                   pass=sc.next();
                  // pass=ex.checkPassLength("password");
                   se.set_pass(pass);
                    System.out.println("id:");
                    id=sc.nextInt();
                    se.set_id(id);
                    ad.add_seller(se, v);
                     System.out.println("what you have entered:");
                     System.out.println(se.toString()); 
                   break;
                  case 2:
                       System.out.println("firstname:");
                        fname=sc.next();
                         System.out.println("lastname:");
                        lname=sc.next();
                          System.out.println("age:");
                            age=sc.nextInt();
                             System.out.println("id:");
                              id=sc.nextInt();
                        System.out.println("your drug name:");
                            drug=sc.next();                          
                           /* while(v.check_validdrug(drug)==false)
                            {
                                 System.out.println("your drug name:");
                                 drug=sc.next();
                            }*/
                            v.check_stock(drug);
                            t.show_time();
                             System.out.println("your day:");
                             day=sc.next();
                              System.out.println("your hour:");
                                hour=sc.nextInt();
                                for(int i=0;i<t.day.length;i++)
                                {
                                   if(t.day[i]==day)
                                       hour=hour+(i*4);
                                }
                                int i=0; 
                                while(t.check_validtime(hour)==false)
                                {
                                    System.out.println("can't choose this time");
                                     day=sc.next();
                                     hour=sc.nextInt();
                                }
                                 System.out.println("your payment type:");
                                    payment=sc.next();
                                  System.out.println("your evaluation ,please:");
                                     evnumber=sc.nextDouble();
                              // client c1=new client(hour,day,drug,evnumber,payment,t);  
                                     client c1=new client();
                                 c1.set_fname(fname);                       
                                 c1.set_lname(lname);                       
                                 c1.set_age(age);                                   
                                       c1.set_id(id);
                                    // ad.add_seller(, v);
                                       t.show_time();
                                      System.out.println("what you have entered:");
                                       System.out.println(c1.toString()); 
                                       break;
              }
               System.out.println("\n\n"+"-add seller\n2-add client\n3-add supplier");
              c=sc.nextInt();
          }
          
          System.out.println("Goodbye");
      }
      else
           System.out.println("Cann't log in");   
        }
        catch(Exception e){
            System.out.println(e);
        }   
    }   
}
