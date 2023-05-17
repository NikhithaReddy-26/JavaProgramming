package assignment10;
public class Main {

    public static void main(String[] args) {
        SList sl = new SList();
        SListIterator sli = sl.iterateList();
        System.out.print(sl);
        sli.insertNode("10");
        sli.insertNode("20");
        sli.insertNode("50");
        sli.insertNode("30");
        sli.insertNode("60");
        sli.insertNode("40");
        System.out.println(sl.toString());
        SListIterator slir = sl.iterateList();
        slir.removeNode();
        System.out.println(sl.toString());
    }

}