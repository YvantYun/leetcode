package algorithms;

public class Linked {

    public static void main(String[] args) {
        Node<String> first = new Node<>();
        Node<String> second = new Node<>();
        Node<String> third = new Node<>();
        first.t = "to";
        second.t = "be";
        third.t = "or";
        first.next = second;
        second.next = third;
    }


}
