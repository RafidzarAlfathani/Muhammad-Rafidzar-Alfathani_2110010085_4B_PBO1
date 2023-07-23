/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author rafidzar alfath 21 10 01 0085
 */
class Orang {
    private double beratBadan; // encapsulation (private dan atribut)
    private double tinggiBadan;

    // Constructor berat dan tinggi badan
    public Orang(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    // Getter (Accessor) untuk mendapatkan berat badan
    public double getBeratBadan() {
        return beratBadan;
    }

    // Getter (Accessor) untuk mendapatkan tinggi badan
    public double getTinggiBadan() {
        return tinggiBadan;
    }
    
    // setter (mutator)  
    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    } 
    
    // Method untuk menghitung BMI (Body Mas Index)
    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }
}
