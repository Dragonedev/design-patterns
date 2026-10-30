package controller;

import entities.Appointment;
import entities.Doctor;
import entities.Patient;
import exception.InvalidApointmentException;

public class AppointmentController {

	public Appointment scheduleApointment(String appointmentNumber, String description, Doctor doctor,
			Patient patient) {
		if (appointmentNumber == null || appointmentNumber.isBlank()) {
			throw new InvalidApointmentException("Appointment number cannot be null or blank.");
		}

		if (description == null || description.isBlank()) {
			throw new InvalidApointmentException("Appointment description cannot be null or blank.");
		}

		if (doctor == null) {
			throw new InvalidApointmentException("Doctor cannot be null.");
		}
		if (patient == null) {
			throw new InvalidApointmentException("Patient cannot be null.");
		}

		return new Appointment(appointmentNumber, description, doctor, patient);
	}
}
