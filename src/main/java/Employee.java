import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eNo;
	private String eName;
	private int sal;
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int eNo, String eName, int sal) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eNo){
		this.eNo=eNo;
	}
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", sal=" + sal
				+ "]";
	}
	
}
