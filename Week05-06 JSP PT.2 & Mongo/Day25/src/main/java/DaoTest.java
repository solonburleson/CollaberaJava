import com.collabera.day25.dao.EmployeeDao;

public class DaoTest {

	public static void main(String[] args) {
		EmployeeDao empDao = new EmployeeDao();
		
		System.out.println(empDao.getAll());
	}

}
