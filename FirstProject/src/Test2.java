import com.firstproject.Department;
import com.firstproject.Employee1;

public class Test2 {

	public static void main(String[] args) {
		Employee1 emp1=new Employee1(123, "sachin");
		Employee1 emp2=new Employee1(124, "raju");
		Employee1 emp3=new Employee1(124, "ram");
		Employee1[] employee=new Employee1[3];
		employee[0]=emp1;
		employee[1]=emp2;
		employee[2]=emp3;
		Department department=new Department(11, "BCCh", employee);
		department.display();

	}

}
