package lt.swedbank.vsumskis;

public class Person {
    private String name;
    Person friend;

    public Person(Person friend,String name) {
        this.name = name;
        this.friend = friend;
    }

    public Person(String name) {
        this.name = name;
        this.friend = null;
    }

    public String getName() {
        return name;
    }

    public Person getFriend() {
        return friend;
    }
}
