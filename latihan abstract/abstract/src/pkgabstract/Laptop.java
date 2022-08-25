/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Evaluation Software
 */
public abstract class Laptop {
    protected String merk ;
    public abstract void setMerk(String merk);
    public abstract String getMerk();
    public void display(){
        System.out.println("Merek laptop : " + this.merk);
    }
    
}
