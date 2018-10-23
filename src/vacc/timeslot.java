/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacc;

import java.io.Serializable;



/**
 *
 * @author abudo
 */
public class timeslot implements Serializable {
    public  final String[] day={"saturday","sunday","monday","tuesday","wednesday","thursday","friday"};
    public final int[] hours={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28} ;
     public int[] orderedh=new int [28];
     public String[] orderedd=new String [28];
     //public static int x=0;
     public timeslot(){
         
     }
     
    public void show_time()
    {
        int m=0;
       System.out.println("we work all days from 1pm:4pm");
       System.out.println("that's ordered time:");
       for(int i=0;i<day.length;i++)
       {
           for(int j=0;j<orderedd.length;j++)
           {
               if(day[i]==orderedd[j]&&m==0)
               {
                   System.out.print(day[i]+"  ");
                   m++;
               }              
           }
           m=0;          
       }
       System.out.print("\n");      
       int u=0;
     
          while(u<25){
       for(int i=0;i<orderedh.length;i++)
       {
           if(orderedh[i]==u+1)
           {
               System.out.print("1,");
           }
           if(orderedh[i]==u+2)
           {
               System.out.print("2,");
           }
           if(orderedh[i]==u+3)
           {
               System.out.print("3,");
           }
           if(orderedh[i]==u+4)
           {
               System.out.print("4,");
           }
       }
      
       System.out.print("--");       
       u+=4;     
      }
          System.out.print("\n");
}
    public boolean check_validtime(int hour)
    {
        for(int i=0;i<orderedh.length;i++)
        {
            if(orderedh[i]==hour)
                return false;
        } 
                return true;
    }
}
