public class Heri {
    public String name;
    protected String age;

    public Heri(){

    }

    public Heri(String name, String age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void bro(){
        System.out.println("hi bro");
    }
    public void ok(){
        System.out.println("okkk");
    }
}
