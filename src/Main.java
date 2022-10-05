public class Main {
    public static void main(String[] args) {
    Sheltor sheltor = new Sheltor("SHELTOR", "123");
    Pet pet = new Pet(8, Color.BlAK, sheltor);
        System.out.println(pet.getInfo());
    }
}