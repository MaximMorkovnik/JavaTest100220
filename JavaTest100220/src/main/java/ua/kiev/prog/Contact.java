package ua.kiev.prog;

import javax.persistence.*;

@Entity
@Table(name="Contacts")
public class Contact {
    @Id
    @GeneratedValue
    private long id;
    
    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;

    private String name;
    private String surname;
    private String patronymic;

    public Contact() {}

    public Contact(Group group, String name, String surname, String patronymic) {
        this.group = group;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
