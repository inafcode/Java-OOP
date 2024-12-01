class Person {
    String name;
    String address;
    final String country = "Indonesia";

//    Person(String paramName, String paramAddress){
//        name = paramName;
//        address = paramAddress;
//    }

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name Is, " + this.name);
    }
}
