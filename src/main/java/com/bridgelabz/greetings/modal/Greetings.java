package com.bridgelabz.greetings.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;
    public Greetings() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Greetings(int id, String message) {
        super();
        this.id = id;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getId() {
        return id;
    }
	public void setId(long id) {
		this.id = id;
	}


    @Override
    public String toString() {
        return "Greetings{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
