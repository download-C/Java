package polymorphism;

class Employee {
	public String name;
	public String grade;
	
	Employee() {
		
	}
	
	Employee(String name) {
		this.name = name;
	}

}

class Engineer extends Employee {
	
//	Engineer(String name) {
//		super(name);
//		
//	}

	private String skillset;
	

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	

}