package dao;

import java.util.List;

import model.LICHCHIEU;
import model.Phim;
import model.Ve;

public interface THANHVIENDAO {
	void bookTicket(Ve ticket);

	List<LICHCHIEU> viewMovieSchedule();

	Phim getMovieDetails(String MaPhim);
	
	
}
