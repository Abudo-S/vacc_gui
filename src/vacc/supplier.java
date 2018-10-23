/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

/**
 *
 * @author mt
 */
public class supplier extends person implements drugs {
    double drugs_costs[]={7.5,10.5,5,15,40.7,30,80,12,8,7};
    final String supplierFileName = "supplier.bin";
    String email;
    public supplier(){
        
    }
  public void set_email(String email)
    {
    this.email=email;
    }

public String get_email()
    {
    return email;
    }
    void show_drugsnames_costs()
    {
        for(int i=0;i<drugs_costs.length;i++)
        {
            System.out.println("drug:"+drugs[i]+"   its cost:"+drugs_costs[i]);
        }
    }

    @Override
    public String toString() {
        return "supplier : " + fname + " " + lname + "\n" + "id : " + id+ "\n" + " age : " + "\n" +" salary : " + "\n"+age;
    }
}
