interface Nameable {
    String getName();
}

class Person implements Nameable {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Planet implements Nameable {
    private final String name;

    Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableExample {
    public static void main(String[] args) {
        Nameable[] objects = {
                new Person("Анна"),
                new Planet("Земля")
        };

        for (Nameable object : objects) {
            System.out.println(object.getName());
        }
    }
}
