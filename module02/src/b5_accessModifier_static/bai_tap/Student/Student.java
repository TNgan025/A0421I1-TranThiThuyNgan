package b5_accessModifier_static.bai_tap;

public class Student {
    private String name ="John";
    private String class1 ="C02";
    public Student() {

    };
    public void setName(){
        System.out.println(name);
    }
    public void setClasses() {
        System.out.println(class1);
    }
//    public void setName(){
//        System.out.println(name);
//    }
//    protected void setClasses() {
//        System.out.println(class1);
//    }
//    default void setName(){
//    System.out.println(name);
//}
//    protected void setClasses() {
//        System.out.println(class1);
//    }
}
