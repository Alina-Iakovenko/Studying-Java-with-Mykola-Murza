public class Main {
    public static void main(String[] args) {

        ArrayCollection testArray = new ArrayHomework();
        System.out.println(testArray.size());
        testArray.add(9);
        testArray.add(8);
        testArray.add(7);
        testArray.add(6);
        testArray.add(5);

        System.out.println(testArray.get(1));
        System.out.println(testArray.size());

        System.out.println(testArray.contains(9));
        System.out.println(testArray.contains(3));

        System.out.println(testArray.findIndex(7));
        System.out.println(testArray.findIndex(2));

        testArray.add(90);
        testArray.add(80);
        testArray.add(70);
        testArray.add(60);
        testArray.add(50);

        System.out.println(testArray.size());
        System.out.println(testArray.get(7));

        testArray.add(30);
        System.out.println(testArray.size());
        System.out.println(testArray.get(7));
        testArray.remove(7);
        System.out.println(testArray.get(7));
        System.out.println(testArray.size());

    }
}