package ro.fasttrackit.homework.lab12;

public class StundentGrade {
    private String name;
    private String discipline;
    private int age;

    public StundentGrade(String name, String discipline, int age) {
        this.name = name;
        this.discipline = discipline;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StundentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StundentGrade that = (StundentGrade) o;

        if (age != that.age) return false;
        if (!name.equals(that.name)) return false;
        return discipline.equals(that.discipline);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + discipline.hashCode();
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        StundentGrade stundentGrade = new StundentGrade("Dorel", "Matematica",34);

    }
}