package ru.overtired.javafx.sample3.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @Column(name = "[Key]", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int key;

    @Column(name = "Type", nullable = false)
    private String type;



    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }
}
