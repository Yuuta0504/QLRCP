package model;

import java.sql.Date;

public class Ve
{
	private String MaVE;
	private String MaTV;
	private String MaLC;
	private java.util.Date NgayMua;
	private String LoaiVe;
	private float GiaTien;
	public String getMaVE() {
		return MaVE;
	}
	public void setMaVE(String maVE) {
		MaVE = maVE;
	}
	public String getMaTV() {
		return MaTV;
	}
	public void setMaTV(String maTV) {
		MaTV = maTV;
	}
	public String getMaLC() {
		return MaLC;
	}
	public void setMaLC(String maLC) {
		MaLC = maLC;
	}
	public java.util.Date getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(java.util.Date ngayMua) {
		NgayMua = ngayMua;
	}
	public String getLoaiVe() {
		return LoaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		LoaiVe = loaiVe;
	}
	public float getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(float giaTien) {
		GiaTien = giaTien;
	}
	public Ve(String maVE, String maTV, String maLC, java.util.Date ngayMua, String loaiVe, float giaTien) {
		MaVE = maVE;
		MaTV = maTV;
		MaLC = maLC;
		NgayMua = ngayMua;
		LoaiVe = loaiVe;
		GiaTien = giaTien;
	}
	
}
