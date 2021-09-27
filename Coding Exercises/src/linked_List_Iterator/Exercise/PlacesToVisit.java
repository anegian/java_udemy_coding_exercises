package linked_List_Iterator.Exercise;

import java.util.*;

public class PlacesToVisit {

    LinkedList<String> citiesList = new LinkedList<>();

    private void printList() {

        Iterator<String> iterator = this.citiesList.iterator();
        while (iterator.hasNext()) {
            System.out.println("*Cities to visit in alphabetical order*\n");
            for (int y = 0; y < this.citiesList.size(); y++)
                System.out.println("[" + (y + 1) + "]" + iterator.next());
        }
        System.out.println("=========================");
    }

    public boolean addInOrder(LinkedList<String> linkedList, String newCity) {

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

    public void visit() {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printMenu();
        int i = 0;
        int y = -1;

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("Road Trip is over");
                    quit = true;
                    break;

                case 1:
                    if (this.citiesList.isEmpty()) {
                        System.out.println("Reached the end of the list");
                        break;
                    }
                    if (i < this.citiesList.size() & i >= 0) {
                        System.out.println("Now visiting " + this.citiesList.get(i));
                        i++;
                        y++;
                    } else {
                        System.out.println("Reached the end of the list: " + this.citiesList.get(i - 1));
                    }
                    break;

                case 2:
                    try {
                        if (y < this.citiesList.size() & y > -1) {
                            System.out.println("Now visiting " + this.citiesList.get(y - 1));
                            y--;
                            i--;
                        } else if (y == -1) {
                            System.out.println("We are at the start of the list");
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("We are at the start of the list: " + this.citiesList.get(y));
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
