package com.pl.rentcars.general.entity;

import com.pl.rentcars.general.enumarations.Status;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
