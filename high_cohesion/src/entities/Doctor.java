package entities;

/*Baixa coesão pois a classe foi criada para representar um médico
 não para acumular responsabilidades que não possuem relação direta 
 com a sua finalidade */

public class Doctor {
	private String name;
	private String medicalSpecialty;

	public void registerPatient() {
		// Cadastro de paciente
	}

	public void scheduleAppointment() {
		// Agendamento de consulta
	}

	public void calculateSalary() {
		// Cálculo salarial
	}

	public void sendEmail() {
		// Envio de e-mail
	}
}
