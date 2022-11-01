package Transport.Drivers;

public class DriverC {
    private String fio;
    private String experience;
    private String driversLicense;

    public DriverC(String fio, String experience, String driversLicense) {
        this.fio = validOrDefaultFio(fio);
        this.experience = validOrDefaultExperience(experience);
        this.driversLicense = validOrDefaultDriversLicense(driversLicense);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }
    private static String validOrDefaultFio(String fio) {
        if (fio == null || fio.isEmpty() || fio.isBlank()) {
            return  "имя не указано";
        } else {
            return fio;
        }
    }
    private static String validOrDefaultDriversLicense(String driversLicense) {
        if (driversLicense == null || driversLicense.isEmpty() || driversLicense.isBlank()) {
            return  "нет прав";
        } else {
            return driversLicense;
        }
    }
    private static String validOrDefaultExperience(String experience) {
        if (experience == null || experience.isEmpty() || experience.isBlank()) {
            return  "нет стажа вождения";
        } else {
            return experience;
        }
    }

    @Override
    public String toString() {
        return "Водитель: " + fio + '\'' + " стаж: " + experience + '\'' + " лет, наличие водительских прав: " + driversLicense;
    }
}
