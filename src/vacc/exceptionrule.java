/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

import javax.swing.JOptionPane;

/**
 *
 * @author mt
 */
public class exceptionrule {
     public exceptionrule() 
        {
        
    }
   /* public exceptionrule(String s) {
        super(s);
    }*/

   public int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a Positive Number for " + x + " !"));
            if (number <= 0||number>150) {
                JOptionPane.showMessageDialog(null, "Not a valid Input for Positive Int Try Again");
            }
        } while (number <= 0||number>150);

        return number;
    }

   public String checkEmail(String x){
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter a Valid input for " + x + " !");
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not a valid Input for Email Try Again");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }

   public String checkPassLength(String x) {
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Enter more than 8 char for " + x + " !");
            if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Not a valid Password length Try Again ");
            }
        } while (pass.length() < 8);

        return pass;
    }
   public String checkpayment(String x){
        String payment;
        do{
            payment=JOptionPane.showInputDialog("choose cash or visa " + x + " !");
            if(!payment.equals("cash")||!payment.equals("visa"))
               JOptionPane.showMessageDialog(null, "Not valid ,Try Again");
        }while(!payment.equals("cash")||!payment.equals("visa"));
     return payment;
    }
    public long checkvisanumber(){
        long nvisa;
        int count = 0;
        do {
            nvisa =Long.parseLong(JOptionPane.showInputDialog("Enter your 16 digits'visa number !"));
           while (nvisa != 0) {
            nvisa = nvisa / 10;
            count++;
        }
            if (count!=16) {
                JOptionPane.showMessageDialog(null, "Not a valid Input,Try Again");
            }
        } while (count !=16);
       return nvisa;
}
     public int check_id(client c) {
        int number,x=0;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a valid id !"));
           for(int i=0;i<c.clients.size();i++)
            {
                if(c.clients.get(i).get_id()==number||number<=0){
                JOptionPane.showMessageDialog(null, "Not a valid Input Try Again");
               x++;
                }
            }
        } while (x!=0);

        return number;
    }
      public double check_evnumber(String x) {
        double number;
        do {
            number = Double.parseDouble(JOptionPane.showInputDialog("Enter a number from 0.0:5.0" + x + " !"));
            if (number <=0.0||number>5.0) {
                JOptionPane.showMessageDialog(null, "Not a valid Input Try Again");
            }
        } while (number <=0.0||number>5.0);

        return number;
    }
    public String check_d(timeslot t,String day){
        int c;
        do {  
            c=0;
                day=JOptionPane.showInputDialog("another day:");
               // hour = Integer.parseInt(JOptionPane.showInputDialog("hour !"));
       for(int m=0;m<t.day.length;m++)
          {
           for(int j=0;j<t.orderedd.length;j++)
           {              
               if(t.day[m]==t.orderedd[j])
               {
                   c++;
               }
           }         
               }
                if(c==4){
                    JOptionPane.showMessageDialog(null, "Not a valid day,Try Again");
                }       
         } while (c==4);   
        return day;
    }

public int check_h(timeslot t,int hour){
    int i;
    do{
        hour = Integer.parseInt(JOptionPane.showInputDialog("another hour :"));
       for( i=0;i<t.orderedh.length;i++)
       {
           if(t.orderedh[i]==hour)
               JOptionPane.showMessageDialog(null, "Not a valid hour,Try Again");
       }
      } while (t.orderedh[i]==hour); 
    return hour;
}
}

