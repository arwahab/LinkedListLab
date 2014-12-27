// Lab 02 - LinkedListLab //
// Abdul Wahab //

public class LinkedList {

    public int node;
    public String string;
    public LinkedList nextLink;

    public LinkedList(int aNum, String strings) {
        node = aNum;
        string = strings;
    }

    public void printLink() {
        System.out.println("{" + node + ", " + string + "} ");
    }
}

class List {

    private LinkedList firstItem;

    public List() {
        firstItem = null;
    }

    public boolean isEmpty() {
        return firstItem == null;
    }

    void insert(int d1, String strings) {
        LinkedList link = new LinkedList(d1, strings);
        link.nextLink = firstItem;
        firstItem = link;
    }

    public LinkedList delete() {
        LinkedList tempVal = firstItem;
        firstItem = firstItem.nextLink;
        return tempVal;
    }

    void printList() {
        LinkedList currLink = firstItem;
        System.out.print("Linked List: " + "\n" + "\n");
        while (currLink != null) {
            currLink.printLink();
            currLink = currLink.nextLink;
        }
        System.out.println("");
    }
}

class Driver {

    public static void main(String[] args) {
        List thisList = new List();

        thisList.insert(4, "just some gibberish");
        thisList.insert(3, "to make a string");
        thisList.insert(2, "tohdeirftewsllab");
        thisList.insert(1, "tunaeprettubyllejiep");
        thisList.insert(0, "shamshi");
        thisList.printList();

    }

}
