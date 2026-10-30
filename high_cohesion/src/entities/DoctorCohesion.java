package entities;
// Alta coesão pois tem apenas responsabilidades ligadas ao médico
public class DoctorCohesion {

	private String name;
    private String medicalSpecialty;
    private String register;

    public void updateSpecialty(String specialty) {
        this.medicalSpecialty = specialty;
    }
}
