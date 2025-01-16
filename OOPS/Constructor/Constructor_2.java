public class Constructor_2 {

    private String name;
    private int id;
    private int age;

    public Constructor_2(String name, int id, int age) {
        // here we will only set the values
        setName(name);
        setId(id);
        setAge(age);
    }

    public Constructor_2() {
        getName();
        getAge();
        getId();
    }

    //getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // for Coupling what we do is make it private so it cant be used by other class and hence reduce complexity
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
