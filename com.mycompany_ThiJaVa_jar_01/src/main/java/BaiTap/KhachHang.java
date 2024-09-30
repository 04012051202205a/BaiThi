/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.util.Objects;
/**
 *
 * Vũ Xuân An: 
 */
/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String maso;
    private String hoten;
    private int sohokhau;
    private double chisocu;
    private double chisomoi;

    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }
    

    public KhachHang(String maso, String hoten, int sohokhau, double chisocu,double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sohokhau = sohokhau;
        this.chisocu = chisocu;
        this.chisomoi=chisomoi;
    }   

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSohokhau() {
        return sohokhau;
    }

    public void setSohokhau(int sohokhau) {
        this.sohokhau = sohokhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }
    public  double getTieuThu(){
    return chisomoi-chisocu;
    
    }
    public double getDinhMuc(){
    return sohokhau*4;
    
    }
    public  double tinhTienTra(){
    double tieuthu=getTieuThu();
    double giaban=0;
    if (tieuthu<=getDinhMuc())
    {
    giaban=tieuthu*6700;
    } else if(tieuthu<=getDinhMuc()+2){
    giaban=getDinhMuc()*6700+(tieuthu-getDinhMuc())*12900;
    
    
    }
    
    
    
    
    return tinhTienTra();
    }


    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.maso, other.maso);
    }    
    
}
