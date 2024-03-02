package web.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="users", schema = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Size(min = 2, max = 40, message = "Invalid name")
    @Pattern(regexp = "^[A-Za-zА-Яа-яЁё]{2,40}$", message = "use correct value")
    private String name;

    @Column
    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 120, message = "Age should be less than 120")
    private int age;

    @Column
    @Size(min = 6, max = 11, message = "Invalid number")
    private String number;
    public User() {
    }

    public User(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}
