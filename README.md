# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskrip

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Orang`, `Pasien`, dan `BmiPasien` adalah contoh dari class.

```bash
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

```

2. **Object** adalah instance dari class. Pada kode ini, `Scanner scanner = new Scanner(System.in);` adalah contoh pembuatan object.

```bash
mhs[Scanner scanner = new Scanner(System.in);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` `beratBadan`dan `tinggiBadan` adalah contoh atribut.

```bash
String nama;
double beratBadan;
double tinggiBadan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang` dan `Pasien`.

```bash
public Orang(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

public Pasien(String nama, double beratBadan, double tinggiBadan) {
        super(beratBadan, tinggiBadan);
        this.nama = nama;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBeratBadan` dan `setTinggiBadan` adalah contoh method mutator.

```bash
public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    } 
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getBeratBadan`, dan `getTinggiBadan`,adalah contoh method accessor.

```bash
 public double getBeratBadan() {
        return beratBadan;
    }

public double getTinggiBadan() {
        return tinggiBadan;
    }

public String getNama() {
        return nama;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` `beratBadan` dan `tinggiBadan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private double beratBadan;
private double tinggiBadan;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Pasien` mewarisi `Orang` dengan sintaks `extends`.

```bash
class Pasien extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `hitungBMI`.

```bash
if (bmi < 18.5) {
                kategoriBMI = "Kurus";
            } else if (bmi >= 18.5 && bmi < 25) {
                kategoriBMI = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                kategoriBMI = "Gemuk";
            } else {
                kategoriBMI = "Obesitas";
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
  for (int i = 0; i < jumlahPasien; i++) { 
            scanner.nextLine();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
            System.out.print("Masukkan nama pasien ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan berat badan (kg) pasien ke-" + (i + 1) + ": ");
            double beratBadan = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi badan (m) pasien ke-" + (i + 1) + ": ");
            double tinggiBadan = scanner.nextDouble();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Pasien[] daftarPasien = new Pasien[jumlahPasien];` adalah contoh penggunaan array.

```bash
Pasien[] daftarPasien = new Pasien[jumlahPasien];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `` untuk menangani error.

```bash

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
|     | **TOTAL**      | **85** |

## Pembuat

Nama: Muhammad Rafidzar Alfathani
NPM: 2110010085
