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
public class invoice {
    client c;
     int invoices_number;
    public invoice(client c){
        this.c=c;
    }
   void show_invoice(vacc_center v)
    {
         invoices_number=c.clients.size();
        double x=0.0;
        for(int i=0;i<v.drugs.length;i++)
        {
            if(v.drugs[i]==c.drug)
            {
                x=v.piece_drugcost[i];
            }
        }
        System.out.println("invoice number:"+invoices_number);
        System.out.println(c.toString()+"\n"+x);
    }
}
