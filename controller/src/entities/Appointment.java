package entities;

public class Appointment {

	private String appointmentNumber;
	private String description;
	private Doctor doctor;
	private Patient patient;

	public Appointment(String appointmentNumber, String description, Doctor doctor, Patient patient) {
		this.appointmentNumber = appointmentNumber;
		this.description = description;
		this.doctor = doctor;
		this.patient = patient;
	}

	public String getAppointmentNumber() {
		return appointmentNumber;
	}

	public String getDescription() {
		return description;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Patient getPatient() {
		return patient;
	}

}
