class Astronaut {
    int oxygen = 100;
    int water = 100;
    int food = 100;

    void survive(int days) {
        oxygen -= days * 10;
        water -= days * 8;
        food -= days * 7;

        System.out.println("Oxygen: " + oxygen);
        System.out.println("Water: " + water);
        System.out.println("Food: " + food);

        if (oxygen > 0 && water > 0 && food > 0)
            System.out.println("Status: Astronaut Survived!");
        else
            System.out.println("Status: Mission Failed!");
    }
}

public class Main {
    public static void main(String[] args) {
        Astronaut a = new Astronaut();

        System.out.println("=== MARS SURVIVAL SIMULATOR ===");
        a.survive(5);
    }
}
