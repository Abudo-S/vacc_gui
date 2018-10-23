
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mt
 */
public abstract class staff extends person implements Serializable {
    protected double salary;
    public staff(double salary){
        this.salary=salary;
    }
    void set_salary(double salary){
        this.salary=salary;
    }
    double get_salary(){
        return salary;
    }  
      @Override
    public abstract String toString();
    
}
