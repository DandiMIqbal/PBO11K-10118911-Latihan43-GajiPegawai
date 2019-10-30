/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118911.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author Dandi M Iqbal
 * Nama : Dandi Muhammad Iqbal 
 * Kelas : IF-11K
 * Nim : 10118911
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji
 * pegawai
 */
public class PBO11K10118911Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner scn = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();
        
        gp.setNama("Chiqo Rifky Saputra");
        gp.setAlamat("Jl. Berlian no 6");
        gp.setUangTransport(2500000);
        gp.setUangTunjangan(3000000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
        
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.getTotalGaji());
    }
    
}
