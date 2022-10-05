public class Pet {
    int age;
    Color color;
    Sheltor shelter;


    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Pet(int age, Color color, Sheltor shelter) {
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    public Sheltor getShelter() {
        return shelter;
    }

    public void setShelter(Sheltor shelter) {
        this.shelter = shelter;
    }


    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public  String getInfo(){
        return ("age - " + this.getAge() +
                "\ncolor - " + this.getColor() +
                "\nSheltor`s name -" + shelter.getName() +
                "\naddress - " + shelter.getAddress());
    }


}

