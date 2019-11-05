/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 mencetak nama
 */
public class Pboulang10115109Latihan45Cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Printer printer1 = new Printer();
         
         System.out.println("masukan nama anda :");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        
        printer1.setNama(nama);
        System.out.println("mau cetak brapa kali ?");
       
        int i = input.nextInt();
        printer1.setJumlahcetak(i);
        
        System.out.println("\n nama anda : "+printer1.getNama());
        System.out.println("hasil cetak : ");
         printer1.cetak(printer1.getJumlahcetak(),printer1.getNama());
    }
    
}
