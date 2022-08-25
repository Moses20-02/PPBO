/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author Evaluation Software
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop_ASus asus1 = new Laptop_ASus();
        asus1.merk = "Asus rog";
        System.out.println(asus1.getMerk());
        asus1.setMerk("Asus vivobook");
        System.out.println(asus1.getMerk());
        asus1.display();
        
    }
    
}
