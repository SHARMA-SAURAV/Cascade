import javax.persistence.*;

@Entity
public class person {
	@Id
	private int id;
	private String name;
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Aadharcard aadharcard;
	
	
	
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", address=" + address + ", aadharcard=" + aadharcard + "]";
	}
	public Aadharcard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(Aadharcard aadharcard) {
		this.aadharcard = aadharcard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
