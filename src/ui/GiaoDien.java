package ui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Phim;

public class GiaoDien extends JFrame {
	private JTextField MaPhim, TenPhim, Description, ThoiLuong, CC, KT;
	private DefaultTableModel model;
	private ArrayList<Phim> PhimInfoList = new ArrayList<Phim>();
	public GiaoDien() {
		super("Quan li phim");
		initGui();
	}
	void initGui() {
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		GiaoDien giaodien = new GiaoDien();
		giaodien.setVisible(true);
	}
}
