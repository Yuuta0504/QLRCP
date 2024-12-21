package dao;

import java.util.List;

import model.LICHCHIEU;
import model.Phim;
import model.Ve;

public interface NHANVIENDAO {
	List<Ve> getAllTickets();

	Ve getTicketDetails(String MaVE);

	List<ThanhVien> getAllCustomer();

	List<LICHCHIEU> getMovieSchedules();

	Phim getMovieDetails(String MaPhim);
}
