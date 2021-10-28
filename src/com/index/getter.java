package com.index;

class Mahasiswa {
  String nama;
  String kelas;
  String nim;
  String jurusan;
  String tugas;

  Mahasiswa(String nama,String kelas,String nim,String jurusan,String tugas){
    this.nama = nama;
    this.kelas = kelas;
    this.nim = nim;
    this.jurusan = jurusan;
    this.tugas = tugas;
  }

  void show(){
    System.out.println("\nNama    : " + this.nama);
    System.out.println("Kelas   : " + this.kelas);
    System.out.println("Nim     : " + this.nim);
    System.out.println("Jurusan : " + this.jurusan);
    System.out.println("Jurusan : " + this.tugas);
    System.out.println("===============================================");
  }
}

public class getter {
  public static void main(String[] args) {

    int total_harga;

    setter bolpoint1 = new setter();
    bolpoint1.setNama("Bolpoint");
    bolpoint1.setStoc(10);
    bolpoint1.setHarga_satuan(2000);
    bolpoint1.setHarga(10, 2000);
    int bolpoint = bolpoint1.getHarga();

    setter pensil2 = new setter();
    pensil2.setNama("Pensil");
    pensil2.setStoc(10);
    pensil2.setHarga_satuan(1000);
    pensil2.setHarga(10, 1000);
    int pensil = pensil2.getHarga();

    setter penghapus3 = new setter();
    penghapus3.setNama("Penghapus");
    penghapus3.setStoc(10);
    penghapus3.setHarga_satuan(500);
    penghapus3.setHarga(10, 500);
    int penghapus = penghapus3.getHarga();

    Mahasiswa mahasiswa1 = new Mahasiswa("Laurensius Suban Ola", "TI.3B", "17200037", "Teknik Informatika", "Coding Java (Pewarisan & Enkapsulasi)");
    mahasiswa1.show();

    System.out.println("\nNama Alat Tulis = " + bolpoint1.getNama());
    System.out.println("Stoc            = " + bolpoint1.getStoc());
    System.out.println("Harga Satuan    = Rp. " + bolpoint1.getHarga_satuan());
    System.out.println("Harga           = Rp. " + bolpoint1.getHarga());

    System.out.println("\nNama Alat Tulis = " + pensil2.getNama());
    System.out.println("Stoc            = " + pensil2.getStoc());
    System.out.println("Harga Satuan    = Rp. " + pensil2.getHarga_satuan());
    System.out.println("Harga           = Rp. " + pensil2.getHarga());

    System.out.println("\nNama Alat Tulis = " + penghapus3.getNama());
    System.out.println("Stoc            = " + penghapus3.getStoc());
    System.out.println("Harga Satuan    = Rp. " + penghapus3.getHarga_satuan());
    System.out.println("Harga           = Rp. " + penghapus3.getHarga());

    total_harga = bolpoint + pensil + penghapus;
    System.out.println("\nTotal Harga     = Rp. " + total_harga);
  }
}
