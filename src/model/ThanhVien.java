package model;

public class ThanhVien {
	private String MATv;
	private String HoTen;
	private String GioiTinh;
	private String LoaiDoiTuong;
	public ThanhVien(String mATv, String hoTen, String gioiTinh, String loaiDoiTuong) {
		super();
		MATv = mATv;
		HoTen = hoTen;
		GioiTinh = gioiTinh;
		LoaiDoiTuong = loaiDoiTuong;
	}
	public String getMATv() {
		return MATv;
	}
	public void setMATv(String mATv) {
		MATv = mATv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getLoaiDoiTuong() {
		return LoaiDoiTuong;
	}
	public void setLoaiDoiTuong(String loaiDoiTuong) {
		LoaiDoiTuong = loaiDoiTuong;
	}
}
