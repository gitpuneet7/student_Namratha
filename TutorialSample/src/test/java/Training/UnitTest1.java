package Training;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class UnitTest1 {

	UserInfo userInfo_stub;
    UserInfo userInfo_user;
    Dao dao;
    UserInfo storeduserinfo;
    
  private void createMocks(){
		dao=mock(Dao.class);
		when(dao.getUser_byName()).thenReturn((UserInfo) storeduserinfo);
		
	}
  

	@Before
	public void setUp(){
		userInfo_stub = new UserInfo();
		userInfo_stub.setName("Puneet");
		userInfo_stub.setDOB("10/10/10");
		userInfo_stub.setCountry("India");
		
		storeduserinfo = new UserInfo();
		storeduserinfo.setName("Puneet");
		storeduserinfo.setDOB("10/10/10");
		storeduserinfo.setCountry("India");
		
		
		userInfo_user = new UserInfo();
		userInfo_user.setName("Puneet");
		userInfo_user.setDOB("10/10/20");
		userInfo_user.setCountry("HongKong");
	}
	
	
	@After
	public void tearDown(){
		//authService=null;
	}
	
	//Assuming that user entered is already present in the database, so it is 
		// autherized
		@Test
		public void checkUser_Test_Autherized() throws Exception{
         boolean expected = true;
         boolean actual = false;
         createMocks();
         
		 AuthorizeService authorize = new AuthorizeService(dao);
         
         actual = authorize.checkUser(userInfo_stub);
         Mockito.verify(dao).getUser_byName();
         
         assertEquals(actual,expected);
			
		}
	
		//unauthorized
		@Test
		public void checkUser_Test_UnAutherized() throws Exception{
         boolean expected = false;
         boolean actual = false;
         createMocks();
         
		 AuthorizeService authorize = new AuthorizeService(dao);
         
         actual = authorize.checkUser(userInfo_user);
         Mockito.verify(dao).getUser_byName();
         
         assertEquals(actual,expected);
			
		}

}
