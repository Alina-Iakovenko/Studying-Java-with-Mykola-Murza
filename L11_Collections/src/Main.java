import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        String[] arr = {"a", "b", "c", "d", "e"};
//        for (int i = 0; i < arr.length; i++) {
//            strings.add(arr[i]);
//        }
//        System.out.println(strings);
//    }


//    public class Main {
//        public static void main(String[] args) {
//            HashMap<String, String> residenceMap = new HashMap<>();
//            Scanner scan = new Scanner(System.in);
//
//            while (true) {
//                System.out.print("Enter your full name: ");
//                String fullName = scan.nextLine();
//                if (fullName.equals("")||fullName.equalsIgnoreCase("stop")) break;
//                else {
//                    System.out.print("Enter your residence: ");
//                    String residence = scan.nextLine();
//                    if (residence.equals("")||residence.equalsIgnoreCase("stop")) break;
//                    else {
//                        residenceMap.put(fullName, residence);
//                    }
//                }
//                System.out.println(residenceMap);
//            }
//        }


    public class Main {
        public static void main(String[] args) {
            HashMap<String, List<String>> residenceMap = new HashMap<>();
            Scanner scan = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();

            while (true) {
                System.out.print("Enter your residence: ");
                String residence = scan.nextLine();
                if (residence.equals("")||residence.equalsIgnoreCase("stop")) {
                    System.out.println("You skipped residence.");
                    break;
                }
                else {
                    System.out.print("Enter your full name: ");
                    String fullName = scan.nextLine();
                    if (fullName.equals("")||fullName.equalsIgnoreCase("stop")) {
                        System.out.println("You skipped name.");
                        break;
                    }
                    else if (residenceMap.containsKey(residence)) {
                        residenceMap.get(residence).add(fullName);
                    } else {
                        ArrayList<String> newNamesList = new ArrayList<>();
                        newNamesList.add(fullName);
                        residenceMap.put(residence, newNamesList);
                    }
                }
            }
            System.out.println(residenceMap);
        }
    }
}