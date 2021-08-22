package b10_list.bai_tap.ArrayList;

public class MyListTest {

    private static Object MyListTest;

    public static class Students{
        private int id;
        private String name;

        public Students( String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Students a = new Students("Huy");
        Students b = new Students("Min");
        Students c = new Students("Duy");
        MyList<Students> studentsList = new MyList<>();
        studentsList.add(a);
        studentsList.add(b);
        studentsList.add(c);
        studentsList.add(1,"Dung");
        MyList<Students> list = studentsList.clone();
        System.out.println(studentsList);
    }
}
