class Tree {
    String type;
    String color;
    String location;

    Tree(String type, String color, String location) {
        this.type = type;
        this.color = color;
        this.location = location;
    }
}

class Branch extends Tree {
    Branch(String type, String color, String location) {
        super(type, color, location);
    }
}

class Leaf extends Branch {
    Leaf(String type, String color, String location) {
        super(type, color, location);
    }

    void dis() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Location: " + location);
    }
}

public class test {
    public static void main(String[] args) {
        Leaf obj = new Leaf("Cherry Blossom", "Pink", "Japan");
        obj.dis();
    }
}
