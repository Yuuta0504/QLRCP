create database Movie;

use Movie;

create table User (
ID				int auto_increment,
Username		nvarchar(100) not null,
Usermail		nvarchar(100) not null,
UserPassword	nvarchar(100) not null,
constraint pk_User	primary key(ID)
);

create table Staff (
IDSTAFF			int auto_increment,
StaffName		nvarchar(100) not null,
StaffMail		nvarchar(100) not null,
StaffPass		nvarchar(100) not null,
constraint pk_Staff	primary key(IDSTAFF)
);

create table Movie (
IDMovie			int auto_increment,
Title			nvarchar(255),
Genre			nvarchar(100),
Duration		int,
Director		nvarchar(255),
release_date	date,
Moviedescrip	text,
main_cast		text,
create_at timestamp default CURRENT_TIMESTAMP,
update_at timestamp default current_timestamp on update current_timestamp,
constraint pk_Movie primary key (IDMovie)
);

create table Cinema (
IDCinema		int auto_increment,
CinemaName		nvarchar(255),
Adress			nvarchar(255),
PhoneNumber		int check (PhoneNumber < 11),
constraint pk_Cinema primary key (IDCinema)
);

create table Schedule (
IDSchedule		int AUTO_INCREMENT,
IDMovie			int not null,
IDRoom			int not null,
Showdate		date not null,
Showtime		time not null,
Price			Decimal(10,2) not null,
status ENUM('Dang Chieu', 'Ngung Chieu') default 'Dang Chieu',
create_at timestamp default CURRENT_TIMESTAMP,
update_at timestamp default current_timestamp on update current_timestamp,
constraint pk_Schedule primary key (IDSchedule)
);
alter table Schedule add constraint fk_Schedule_Movie foreign key (IDMovie) references Movie(IDMovie) on delete cascade;

create table Room (
IDRoom			int auto_increment,
IDCinema		int not null,
RoomName		nvarchar(100) not null,
capacity		int not null,	-- Suc chua cua phong
Status enum('Con trong', 'Het cho')	default 'Con trong',
create_at timestamp default CURRENT_TIMESTAMP,
update_at timestamp default current_timestamp on update current_timestamp,
constraint pk_Room primary key (IDRoom)
);

create table Ticket (
IDTicket		int auto_increment,
IDSchedule		int not null,
IDSeat			int not null,
TicketStatus	enum('Da Dat', 'Bi Huy', 'Chua Thanh Toan') default 'Chua Thanh Toan',
Price			decimal(10, 2) not null,
constraint pk_Ticket primary key (IDTicket),
constraint fk_Schedule_Ticket foreign key (IDSchedule) references Schedule(IDSchedule) on delete cascade on update cascade,
constraint fk_Seat_Ticket foreign key (IDSeat) references Seat(IDSeat) on delete cascade on update cascade
);


alter table Room add constraint fk_Cinema_Room foreign key (IDCinema) references Cinema(IDCinema);
alter table Schedule add constraint fk_Schedule_Room foreign key(IDRoom) references Room(IDRoom) on delete cascade on update cascade;