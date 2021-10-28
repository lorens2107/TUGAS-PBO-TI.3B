package com.index;

public class setter {
    private String nama;
  private int stoc, harga_satuan, harga, total_harga;

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getStoc() {
    return stoc;
  }

  public void setStoc(int stoc) {
    this.stoc = stoc;
  }

  public int getHarga_satuan() {
    return harga_satuan;
  }

  public void setHarga_satuan(int harga_satuan) {
    this.harga_satuan = harga_satuan;
  }

  public int getHarga() {
    return harga;
  }

  public void setHarga(int stoc, int harga_satuan) {
    this.harga = stoc * harga_satuan;
  }

  public int getTotal_harga() {
    return total_harga;
  }

  public void setTotal_harga(int total_harga) {
    this.total_harga = total_harga;
  }
}
