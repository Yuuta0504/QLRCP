package dao;

import java.util.List;

public interface THANHVIENDAO {
	void bookTicket(Ve ticket);

	List<LichChieu> viewMovieSchedule();

	Phim getMovieDetails(String MaPhim);
}
