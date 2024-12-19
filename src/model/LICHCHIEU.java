package model;

public class LICHCHIEU {
	private String MALC;
	private String MARP;
	private int SLVE;
	private String DiaChi;
	private String ThanhPho;
	public LICHCHIEU(String mALC, String mARP, int sLVE, String diaChi, String thanhPho) {
		super();
		MALC = mALC;
		MARP = mARP;
		SLVE = sLVE;
		DiaChi = diaChi;
		ThanhPho = thanhPho;
	}
	public String getMALC() {
		return MALC;
	}
	public void setMALC(String mALC) {
		MALC = mALC;
	}
	public String getMARP() {
		return MARP;
	}
	public void setMARP(String mARP) {
		MARP = mARP;
	}
	public int getSLVE() {
		return SLVE;
	}
	public void setSLVE(int sLVE) {
		SLVE = sLVE;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getThanhPho() {
		return ThanhPho;
	}
	public void setThanhPho(String thanhPho) {
		ThanhPho = thanhPho;
	}
	
}
