public class Human{
    // Field 
    private String name;
    private int age;
    // Constrructor
    public Human(String name,int age) {
        this.name = setName(name);
        this.age = setAge(age);
    }
    
    // setter
    public String setName(String name) {
        return this.name= name;
    }
    public int setAge(int age) {
        return this.age= age;
    }
    // getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    // Method
	public void print(){
	   System.out.print("이  름 : "+ name + "\t나  이 : " + age );
	}
}