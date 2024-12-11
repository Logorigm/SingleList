import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i=0;i<4;i++){
            System.out.println(list.get(i));
        }
    }
}

/*
3
2 4 5
 */
