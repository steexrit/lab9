class Student {
    private int IDNumber;
    private String name;

    // Конструктор
    public Student(int IDNumber, String name) {
        this.IDNumber = IDNumber;
        this.name = name;
    }

    // Геттер для IDNumber
    public int getIDNumber() {
        return IDNumber;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + IDNumber + ", name='" + name + "'}";
    }
}
