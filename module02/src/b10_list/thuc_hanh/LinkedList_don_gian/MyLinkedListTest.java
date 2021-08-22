package b10_list.thuc_hanh.LinkedList_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
//Bước 6: Tạo lớp TestMyLinkedList chứa hàm main
        //Tạo đối tượng thuộc lớp MyLinkedList.
        //Lần lượt gọi các phương thức addFist(), add(), printList() chạy ứng dụng quan sát kết quả.
                System.out.println("/=/=/=/= TESTING /=/=/=/=");
                MyLinkedList ll = new MyLinkedList(10);
                ll.addFirst(11);
                ll.addFirst(12);
                ll.addFirst(13);

                ll.add(4,9);
                ll.add(4,9);
                ll.printList();
            }
    }
