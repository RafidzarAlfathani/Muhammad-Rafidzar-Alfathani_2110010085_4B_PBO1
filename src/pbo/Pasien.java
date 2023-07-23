/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author rafidzar alfath
 */
// Inheritence class pasien
class Pasien extends Orang {
    private String nama;

    // Constructor nama, berat, dan tinggi badan
    public Pasien(String nama, double beratBadan, double tinggiBadan) {
        super(beratBadan, tinggiBadan);
        this.nama = nama;
    }

    // Getter(Accessor) untuk mendapatkan nama pasien
    public String getNama() {
        return nama;
    }
}

