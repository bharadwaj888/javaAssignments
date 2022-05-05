package Assignment10;

class Main {
    public static void main(String[] args)
    {
        Slist<Integer> intList = new Slist<>();
        intList.addintoSList(10);
        intList.addintoSList(20);
        intList.addintoSList(11);
        intList.addintoSList(12);
        intList.addintoSList(89);
        intList.addintoSList(88);
        intList.addintoSList(78);
        intList.print();
        System.out.println();
        intList.removefromList(78);
        intList.removefromList(88);
        intList.print();
        System.out.println();
        Slist<String> stringList = new Slist<>();
        stringList.addintoSList("Ten");
        stringList.addintoSList("One");
        stringList.addintoSList("Two");
        stringList.addintoSList("Three");
        stringList.addintoSList("Four");
        stringList.addintoSList("Five");
        stringList.addintoSList("Six");
        stringList.print();
        System.out.println();
        stringList.removefromList("Six");
        stringList.removefromList("Ten");
        stringList.print();
    }
}
