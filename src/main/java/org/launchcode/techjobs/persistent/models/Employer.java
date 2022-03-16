package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Can't leave blank!")
    @Size(min = 3, max = 50, message = "Location entry must be between 3 and 50 characters!")
    private String location;

    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();


    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

}
