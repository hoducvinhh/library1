package Bai42;

import java.io.Serializable;

public class SinhVien1 implements Comparable<SinhVien1>, Serializable
{
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien1(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh)
    {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public SinhVien1(String maSinhVien)
    {
        this.maSinhVien = maSinhVien;
    }
    public String getMaSinhVien()
    {
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien)
    {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return this.diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
                + ", diemTrungBinh=" + diemTrungBinh + "]";
    }

    @Override
    public int compareTo(SinhVien1 o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien1 other = (SinhVien1) obj;
        if (maSinhVien == null) {
            if (other.maSinhVien != null)
                return false;
        } else if (!maSinhVien.equals(other.maSinhVien))
            return false;
        return true;
    }

    
}