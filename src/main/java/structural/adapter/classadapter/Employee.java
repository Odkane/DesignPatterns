package structural.adapter.classadapter;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String officeLocation;

    public String getFullName() {
        return this.fullName;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getOfficeLocation() {
        return this.officeLocation;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
