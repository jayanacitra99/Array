/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author diniristanti
 */
public class testarraydua {
    
    int nis [][] = {{210650},{210651},{210652}};
        String nama [][] = {{"Dini Eka"},{"Qurrotul Ayun"},{"Adelia Nova"}};
        public void tampil(String n){
            System.out.println("Identitas Siswa Angkatan 24");
        }
    public void namanim (int n){
        for (int i=0; i<1; i++){
            for (int j=0; j<1; j++){
                System.out.println(nama[i][j] + ":" + nis [i][j]);
            }
        }
    }
    
    public static void main(String[] args){
    
        testarraydua siswa = new testarraydua();
        siswa.tampil(null);
        siswa.namanim(0);
    }

}
