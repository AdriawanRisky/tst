class anjg {
    String name, hobby;
    int age;

    void hey() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello my name is : " + name + " and i am " + age + " years old");
        }

    }

    void Hello() {
        System.out.println("Hello there!");

    }
}

public class clsobj {

    public static void main(String[] args) {

        anjg anjg1 = new anjg();
        anjg1.name = "ROY";
        anjg1.age = 27;
        anjg1.hey();
        anjg1.Hello();

        anjg anjg2 = new anjg();
        anjg2.name = "AWS";
        anjg2.age = 22;
        anjg2.hey();
        anjg2.Hello();

    }
}
