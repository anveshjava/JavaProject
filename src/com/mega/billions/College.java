package com.mega.billions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college")
public class College {

	private Principal principal;
	private Teacher teacher;
	@Value("{CVR COLLEGE OF ENGG}")
	private String collegeName;

	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using principal setter method");
	}

	public void test() {

		principal.principalInfo();
		teacher.teach();
		System.out.println(collegeName);
		System.out.println("i am from college test");
	}
}
