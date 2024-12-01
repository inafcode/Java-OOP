public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Ilham", "Pontianak");
//        person1.name = "Ilham";
//        person1.address = "Pontianak";
//        person1.country = "Singpore"; // error karena sudah di set final di awal

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Adit");
        person1.sayHello("Muh");

        var person2 = new Person("Ilham");
        System.out.println(person2.name);

        Person person3;
        person3 = new Person();
        person3.name = "Jaka";
        person3.sayHello("Samsul");
    }
}