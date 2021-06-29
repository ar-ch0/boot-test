package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class MailDto {
	private String address;
	private String title;
	private String message;

}
