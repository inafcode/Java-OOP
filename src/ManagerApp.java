public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Ilham";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Satria";
        vp.sayHello("Bambang");
    }
}
