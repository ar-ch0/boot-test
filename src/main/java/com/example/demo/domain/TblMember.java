package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_member")
@Data
@NoArgsConstructor
public class TblMember {

	@Id
	@Column(name = "seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;

	@Column(name = "name")
	private String name;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "member_id")
	private Collection<TblPhone> phone;

	public TblMember(String name) {
		this.name = name;
	}

	public void addPhone(TblPhone p) {
		if (phone == null) {
			phone = new ArrayList<TblPhone>();
		}
		phone.add(p);
	}

	@Override
	public String toString() {
		String result = "[" + seq + "]" + name;
		for (TblPhone p : phone) {
			result += "\n" + p.toString();
		}

		return result;
	}
}
