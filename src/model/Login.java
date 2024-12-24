package model;

public class Login {
	    private String gmail;
	    private String password;
	    private ThanhVien user;

	    public Login(String gmail, ThanhVien user, String password) {
	        this.gmail = gmail;
	        this.user = user;
	        this.password = password;
	    }


	    public String getGmail() {
	        return gmail;
	    }

	    public void setGmail(String gmail) {
	        this.gmail = gmail;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public ThanhVien getUser() {
	        return user;
	    }

	    public void setThanhVien(ThanhVien user) {
	        this.user = user;
	    }


	}

}
