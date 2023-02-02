public class Cat extends Animal{

    @Override
    public void sound() {

        System.out.println("meaw");
    }
    public Cat() {
        super(false, "milk and meat");
    }
}
