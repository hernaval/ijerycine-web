package com.github.yjj.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	private String idTicket;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdAt")
	private Date createAt;

}
