class ngaro {
    String nama;
    int age;

    void bct() {
        System.out.println("My name is : " + nama);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        // System.out.println(yearsLeft);
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return nama;
    }
    // }

    // public class getterandreturn {
    public static void main(String[] args) {

        ngaro itally1 = new ngaro();

        itally1.nama = "St. Jimmy";
        itally1.age = 27;

        // itally1.bct();
        int years = itally1.calculateYearsToRetirement();
        System.out.println("Years till retirements " + years);

        int age = itally1.getAge();
        String nama = itally1.getName();

        System.out.println("Name is : " + nama);
        System.out.println("Umur : " + age);
    }
}
