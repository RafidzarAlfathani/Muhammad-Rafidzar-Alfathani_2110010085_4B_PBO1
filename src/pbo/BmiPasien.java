/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author rafidzar alfath
 */
public class BmiPasien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPasien; 

        System.out.print("Masukkan jumlah pasien: ");
        jumlahPasien = scanner.nextInt();
        
        //array
        Pasien[] daftarPasien = new Pasien[jumlahPasien];
        for (int i = 0; i < jumlahPasien; i++) { 
            scanner.nextLine();

            System.out.print("Masukkan nama pasien ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan berat badan (kg) pasien ke-" + (i + 1) + ": ");
            double beratBadan = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi badan (m) pasien ke-" + (i + 1) + ": ");
            double tinggiBadan = scanner.nextDouble();

            daftarPasien[i] = new Pasien(nama, beratBadan, tinggiBadan);
        }

        System.out.println("\nHasil Penghitungan BMI Pasien:");

        for (int i = 0; i < jumlahPasien; i++) {
            Pasien pasien = daftarPasien[i]; 
            double bmi = pasien.hitungBMI();
            String kategoriBMI = "";
            
            
            if (bmi < 18.5) {
                kategoriBMI = "Kurus";
            } else if (bmi >= 18.5 && bmi < 25) {
                kategoriBMI = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                kategoriBMI = "Gemuk";
            } else {
                kategoriBMI = "Obesitas";
            }
                
            System.out.println("Nama: " + pasien.getNama() + ", Berat Badan: " + pasien.getBeratBadan() + " kg, Tinggi Badan: " + pasien.getTinggiBadan() + " m, BMI: " + bmi + ", Kategori BMI: " + kategoriBMI);
        }

        scanner.close();
    }
}

