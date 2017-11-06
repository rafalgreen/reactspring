package com.pl.rentcars.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pl.rentcars.enumarations.Status;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// AUTO - provider JPA samodzielnie dobiera strategię
	private Long id;

	@Column(name = "user_login", columnDefinition = "VARCHAR(45)", nullable = false)
	private String login;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "is_active", nullable = false)
	private Status status;

	@Column(name = "registraction_date", nullable = false)
	private Date registrationDate;

	@Column(name = "login_date", nullable = false)
	private Date loginDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public User(Long id, String login, String email, Status status, Date registrationDate, Date loginDate) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.status = status;
		this.registrationDate = registrationDate;
		this.loginDate = loginDate;
	}

	public User() {
		
	}

}
