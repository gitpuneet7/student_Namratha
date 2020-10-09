package Training;

public class AuthorizeService {
	
	Dao dataSource;

	public AuthorizeService(Dao dao) {
		// TODO Auto-generated constructor stub
		this.dataSource = dao;
	}

	public boolean checkUser(UserInfo userInfo_stub) {
		
		UserInfo user =  dataSource.getUser_byName();
		
		System.out.println(user.getName());
		
		return user.equals(userInfo_stub);
	}

}
