package model;

import java.time.Year;

public class Phim {
	private String MaP;
	private String TenP;
	private Year NamSX;
	private String Theloai;
	public Phim(String maP, String tenP, Year namSX, String theloai) {
		super();
		MaP = maP;
		TenP = tenP;
		NamSX = namSX;
		Theloai = theloai;
	}
	public String getMaP() {
		return MaP;
	}
	public void setMaP(String maP) {
		MaP = maP;
	}
	public String getTenP() {
		return TenP;
	}
	public void setTenP(String tenP) {
		TenP = tenP;
	}
	public Year getNamSX() {
		return NamSX;
	}
	public void setNamSX(Year namSX) {
		NamSX = namSX;
	}
	public String getTheloai() {
		return Theloai;
	}
	public void setTheloai(String theloai) {
		Theloai = theloai;
	}
	
}
