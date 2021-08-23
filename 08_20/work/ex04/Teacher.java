public class Teacher extends Human{
    // Field 
    private String subject;
    // Constrructor
    public Teacher(String name,int age, String subject) {
        super(name,age);
        this.subject = setSubject(subject);
    }
    // Method
    public String setSubject(String subject) {
        return this.subject= subject;
    }
    public void print() {
		super.print();
        System.out.print("\t담당과목 : " + subject);
		System.out.println();
    }
}
    
    