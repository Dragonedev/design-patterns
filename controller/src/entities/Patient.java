package entities;

public class Patient {

	private String cpf;
	private String name;
	private String age;

	public Patient(String cpf, String name, String age) {
		this.cpf = cpf;
		this.name = name;
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

}
