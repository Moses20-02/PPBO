/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Evaluation Software
 */
public class Laptop_ASus extends Laptop{
    
    @Override
    public void setMerk(String merk){
        this.merk = merk;
    }
    
   @Override
    public String getMerk(){
        return this.merk;
    }
  
}
