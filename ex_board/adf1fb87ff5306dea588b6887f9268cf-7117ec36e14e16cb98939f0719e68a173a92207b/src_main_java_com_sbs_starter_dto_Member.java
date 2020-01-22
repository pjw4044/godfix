package com.sbs.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private long id;
	private String regDate;
	private String loginId;
	private String loginPw;
}
