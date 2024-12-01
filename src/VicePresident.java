class VicePresident extends Manager{
//    Saat melakukan overriding semuanya harus sama, kecuali isi dari mody si methodnya

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name Is VP " + this.name);
    }
}
