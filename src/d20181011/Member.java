package d20181011;

import java.io.Serializable;
//객체 직렬화 - 보낼 객체를 잘게 쪼개서 보내기.
public class Member implements Serializable {	
	
	private String id,name,addrs,email;
	transient String pw; //transient : 정보 보호
	
	public Member()	{}

	public Member(String id,String pw, String name, String addrs, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addrs = addrs;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
