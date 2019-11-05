/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan45.cetaknama;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 printer
 */
public class Printer {
    private int jumlahcetak;
    private String nama;

    public int getJumlahcetak() {
        return jumlahcetak;
    }

    public void setJumlahcetak(int jumlahcetak) {
        this.jumlahcetak = jumlahcetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(int jumlahcetak, String nama){
        int i;
        for (i=1; i<=jumlahcetak;i++){
            System.out.println(i+""+nama);
        }
    }
}
