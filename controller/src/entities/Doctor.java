package entities;

public class Doctor {

	private String name;
	private String medicalSpecialty;
	private String register;

	public Doctor(String name, String medicalSpecialty, String register) {
		this.name = name;
		this.medicalSpecialty = medicalSpecialty;
		this.register = register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMedicalSpecialty() {
		return medicalSpecialty;
	}

	public void setMedicalSpecialty(String medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

}
