package test11;

public class Person {
    public String name;
    public int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person tmp = (Person)obj;
            return name.equals(tmp.name)&& age == tmp.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (name+age).hashCode();
    }

    @Override
    public String toString() {
        return name+":"+age;
    }


}
