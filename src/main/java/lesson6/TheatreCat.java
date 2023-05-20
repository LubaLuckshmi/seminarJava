package lesson6;

public class TheatreCat extends Cat{
    int groupId;
    String ability;

    public TheatreCat(int age, String name, String breed, boolean isMale, int groupId, String ability) {
        super(age, name, breed, isMale);
        this.groupId = groupId;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ability;
    }
}
