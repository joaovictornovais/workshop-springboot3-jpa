package com.joao.course.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_payment")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	
	@OneToOne
	@MapsId
	private Order order;
	
	public Payment() {}
	
	public Payment(Long id, Instant moment, Order order) {
		this.id = id;
		this.moment = moment;
		this.order = order;
	}
}
