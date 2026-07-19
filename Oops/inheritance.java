

public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath (){
        System.out.println("Breaths");
    }
    void skinColor (){
        System.out.println("SkinColor");
    }
}

class Fish extends Animal{
    void fins(){
        System.out.print("fins");
    }
}
