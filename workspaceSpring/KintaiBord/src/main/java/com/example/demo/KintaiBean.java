package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class KintaiBean {
	@Getter
	@Setter
	private String displayYmd;
	@Getter
	@Setter
	private String displaySt;
	@Getter
	@Setter
	private String displayEd;
	@Getter
	@Setter
	private String displayRt;

}
