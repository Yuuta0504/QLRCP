package dao;

import java.util.List;

public interface NHANVIENDAO {
	List<Ve> getAllTickets();

	Ve getTicketDetails(String MaVE);

	List<ThanhVien> getAllCustomer();

	List<LichChieu> getMovieSchedules();

	Phim getMovieDetails(String MaPhim);
}
