class Tree {
    String type;
    String color;
    Tree(String type, String color) {
        this.type = type;
        this.color = color;
    }
}
class Branch extends Tree {
    Branch(String type, String color) {
        super(type, color);
    }
}
class Leaf extends Branch {
    Leaf(String type, String color) {
        super(type, color);
    }
    void dis() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
}
public class test {
    public static void main(String[] args) {
        Leaf obj = new Leaf("Cherry Blossom", "Pink");
        obj.dis();
    }
}
