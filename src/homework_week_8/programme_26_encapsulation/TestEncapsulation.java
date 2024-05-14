package homework_week_8.programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //seting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        //display value of variables
        System.out.println(("Prime's name: " + obj.getName()));
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());
        //direct rollNo is not possible due to encapsulation

    }
}
