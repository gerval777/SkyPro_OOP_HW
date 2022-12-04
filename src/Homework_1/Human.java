package Homework_1;

import java.util.Objects;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Human (String name, String town, int yearOfBirth, String jobTitle) {

        setTown(town);
        setYearOfBirth(yearOfBirth);

        if (name == null || name.trim().isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (jobTitle == null || jobTitle.trim().isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.trim().isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + getTown() +
                ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(town, human.town)
                && Objects.equals(jobTitle, human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name, town, jobTitle);
    }
}

