public class Tester {
    public static void main(String args[]){
        MyGenericDS ds = new MyGenericDS<String>();
        testDS(ds);
    }
    public static void testDS(GenericOrderedCollection ds){
        //append some ints to ds, pop from ds, peek, and print it
        ds.append("Zero");
        ds.append("One");
        ds.append("Two");
        ds.append("Three");
        ds.remove(0);
        System.out.println(ds);
    }
}
