
package Method;

class People{
    String nama;
    int age;

   public void bct(){
        System.out.println("My name is : " + nama + " And I'm " + age + " Years Old");
    }
    int waktupensi(){

     int  yearsLeft = 65 - age;

   // System.out.println(yearsLeft);
    return yearsLeft;

    }
    int getAge(){
        return age;
    }
    String getName(){
        return nama;
    }
}

public class GetterAndReturn {
    
    public static void main(String[] args) {
        People bocah1 = new People();

        bocah1.nama = "JAMES";
        bocah1.age = 27;

        bocah1.bct();
        int tahun =  bocah1.waktupensi();
        System.out.println("Years till pensi " + tahun);

        int age = bocah1.getAge();
        String nama = bocah1.getName();

        System.out.println("Name is : " + nama);
        System.out.println("Age is : " + age);

    }
    
}
