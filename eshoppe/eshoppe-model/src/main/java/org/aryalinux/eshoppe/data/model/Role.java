package org.aryalinux.eshoppe.data.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Role extends BaseEntity {
	@Column
	private String name;
	@OneToMany
	private List<Responsibility> responsibilities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Responsibility> getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(List<Responsibility> responsibilities) {
		this.responsibilities = responsibilities;
	}

}