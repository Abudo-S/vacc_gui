/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

import java.io.Serializable;
import java.util.ArrayList;
import static vacc.client.clients;

/**
 *
 * @author mt
 */
public class vacc_center implements drugs,Serializable {
    String vacc_name;
    client c=new client();
    admin ad;
    seller se;
    timeslot t;
   // final String vaccFileName = "vacc.bin";  
    int nclient=c.clients.size();
    public final double[] piece_drugcost={10.5,15.5,7,19,50.7,40,100,17,12,11};
    supplier su;
    public int[] stock_quantity={20,15,10,20,9,17,25,30,8,19};
    
    public vacc_center(String vacc_name,admin ad,timeslot t,supplier su){
        this.vacc_name=vacc_name;
        this.ad=ad;
        this.t=t;
        this.su=su;
    }
    public vacc_center(){
        
    }
    
    void showall()
    {
            System.out.println("supplier:"+su.toString()+"number of clients:"+c.clients.size()+"\n"+"admin:"+ad.toString()+"seller:"+se.toString());
    }  
    double evaluation_avg()
    {
        double evavg = 0;
        for(int i=0;i<c.clients.size();i++)
        {
            evavg+=c.clients.get(i).evnumber;
        }
        evavg=evavg/c.clients.size();
        return evavg;
    }
    public boolean check_stock(String drug_name)
    {        
        for(int i=0;i<10;i++)
        {
            if(drugs[i]==drug_name)
            {
                if(stock_quantity[i]!=0)
                   return true;               
            }
        }
        return false;
    }

public boolean check_validdrug(String drug)
{
    for(int i=0;i<drugs.length;i++)
    {
        if(drugs[i]==drug)
        {
            return true;
        }
    }
    return false;
}
}