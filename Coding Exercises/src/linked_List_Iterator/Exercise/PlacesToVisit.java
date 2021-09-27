package linked_List_Iterator.Exercise;

import java.util.*;

public class PlacesToVisit {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> placesToVisit = new LinkedList<>();
    LinkedList<String> citiesList = new LinkedList<>();

    //    private LinkedList<String> getInitiallySavedList() {
//        placesToVisit.add("Volos");
//        placesToVisit.add("Athens");
//        placesToVisit.add("Thessaloniki");
//        placesToVisit.add("Ioannina");
//        placesToVisit.add("Patra");
//        placesToVisit.add("Nafplio");
//        placesToVisit.add("Leukada");
//        placesToVisit.add("Serres");
//
//        Collections.sort(placesToVisit);
//
//        return placesToVisit;
//    }

    private void printList() {

        Iterator<String> iterator = this.citiesList.iterator();
        while (iterator.hasNext()) {
            System.out.println("*Cities to visit in alphabetical order*\n");
            for (int y = 0; y < this.citiesList.size(); y++)
                System.out.println("[" + (y + 1) + "]" + iterator.next());
        }
        System.out.println("=========================");
    }

    private boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public LinkedList<String> getCitiesList() {
        return citiesList;
    }

    public void visit() {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator;

        printMenu();

        while (!quit) {

            int action = scanner.nextInt();
            scanner.nextLine();
            listIterator = this.citiesList.listIterator();
            switch (action) {

                case 0:
                    System.out.println("Road Trip is over");
                    quit = true;
                    break;

                case 1:

                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                        if (listIterator.hasNext()) {
                            System.out.println("Now visiting " + listIterator.next());
                        } else {
                            System.out.println("Reached the end of the list");
                            goingForward = false;
                        }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (this.citiesList.isEmpty()) {
                        System.out.println("There are currently no cities to visit");
                        System.out.println("-> Press 5 \n\t To add a destination");
                    } else {
                        printList();
                    }
                    break;

                case 4:
                    printMenu();
                    break;

                case 5:
                    System.out.println("Add a city you want to visit");
                    String newCity = scanner.next();
                    addInOrder(this.citiesList, newCity);
                    System.out.println(newCity + " added to the List");
                    break;
            }
        }

    }

    public void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("""
                0 - to quit
                1 - go to next city
                2 - go to previous city
                3 - print cities
                4 - print menu options
                5 - add new city""");
    }
}
