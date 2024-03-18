class Parent {
    public void display() {
        System.out.println("This is the display method of the Parent class");
    }

    public void display(String message) {
        System.out.println("Message from Parent class: " + message);
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the display method of the Child class");
    }

    public void display(int number) {
        System.out.println("Number from Child class: " + number);
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        parent.display("Hello");

        Child child = new Child();
        child.display();
        child.display(144);
    }
}