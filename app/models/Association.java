package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Association extends Model {

    public String login;

    public String password;

    public String name;

    public Address address;

    public String telephoneNumber;

}
