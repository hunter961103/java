
import java.util.Scanner;

public class StoreInventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 5;
        String[] item = new String[10];
        item[0] = "Pencil";
        item[1] = "Pen";
        item[2] = "Eraser";
        item[3] = "Ruler";
        item[4] = "Notebook";
        
        double[] price = new double[10];
        price[0] = 1.2;
        price[1] = 2.0;
        price[2] = 0.8;
        price[3] = 1.5;
        price[4] = 2.5;
        
        int[] unit = new int[10];
        unit[0] = 900;
        unit[1] = 500;
        unit[2] = 1000;
        unit[3] = 750;
        unit[4] = 600;
        
        System.out.println("###################################################");
        System.out.println("#                                                 #");
        System.out.println("#  Welcome to Stationery Store Management System  #");
        System.out.println("#                                                 #");
        System.out.println("###################################################");
        
        boolean exit = false;
        while(!exit) {
            System.out.println("\nPlease select an operation :\n"
                               + "1 ----- Add an item\n"
                               + "2 ----- Delete an item\n"
                               + "3 ----- Update an item\n"
                               + "4 ----- Search an item\n"
                               + "5 ----- View store's report\n"
                               + "E ----- Exit\n"
                               + "Your selection :");
            String selection = scan.next();
            switch(selection) {
                case "1" :
                    a = Add(item , price , unit , a);
                    break;
                case "2" :
                    a = Delete(item , price , unit , a);
                    break;
                case "3" :
                    Update(item , price , unit , a);
                    break;
                case "4" :
                    Search(item);
                    break;
                case "5" :
                    Report(item , price , unit , a);
                    break;
                case "E" :
                    exit = true;
                    break;
                default :
                    System.out.println("Your selection is invalid, please try again.");
            }
        }
    }
    
    public static int Add(String item[] , double price[] , int unit[] , int a) {
        Scanner scan = new Scanner(System.in);
        boolean end = false , end1 = false , end2 = false;
        while(!end) {
            if(a >= item.length) {
                System.out.println("The storage of array is full, please delete an item to add a new item.");
                end = true;
            }
            else {
                System.out.println("Do you want to add a new item? (Y/N)");
                String decision = scan.next();
                if(decision.equalsIgnoreCase("Y")) {
                    System.out.println("Enter the name of item :");
                    scan.nextLine();
                    item[a] = scan.nextLine();
                    while(!end1) {
                        System.out.println("Enter the price of item :");
                        if(!scan.hasNextDouble()) {
                            System.out.println("Please enter a double value.");
                            scan.next();
                        }
                        else {
                            price[a] = scan.nextDouble();
                            end1 = true;
                        }
                    }
                    while(!end2) {
                        System.out.println("Enter the unit of item :");
                        if(!scan.hasNextInt()) {
                            System.out.println("Please enter an integer value.");
                            scan.next();
                        }
                        else {
                            unit[a] = scan.nextInt();
                            end2 = true;
                        }
                    }
                    System.out.println("New item is added successfully.");
                    a++;
                    end = true;
                }
                else if(decision.equalsIgnoreCase("N"))
                    end = true;
                else
                    System.out.println("Please enter \"Y\" or \"N\".");
            }
        }
        return a;
    }
    
    public static int Delete(String item[] , double price[] , int unit[] , int a) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while(!end) {
            System.out.println("Select an item to delete :");
            for(int d = 0; d < a; d++) {
                System.out.println((d + 1) + " ----- " + item[d]);
            }
            System.out.println((a + 1) + " ----- Back\n"
                               + "Your selection :");
            if(!scan.hasNextInt()) {
                System.out.println("Your selection is invalid, please try again.");
                scan.next();
            }
            else {
                int delete = scan.nextInt();
                if(delete > 0 && delete <= a) {
                    for(int x = delete; x < a; x++) {
                        item[x - 1] = item[x];
                        price[x - 1] = price[x];
                        unit[x - 1] = unit[x];
                    }
                    System.out.println("Item at index[" + (delete - 1) + "] is deleted successfully.");
                    a--;
                    end = true;
                }
                else if(delete == (a + 1))
                    end = true;
                else
                    System.out.println("Your selection is invalid, please try again.");
            }
        }
        return a;
    }
    
    public static void Update(String item[] , double price[] , int unit[] , int a) {
        Scanner scan = new Scanner(System.in);
        boolean end = false , end1 = false , end2 = false , end3 = false;
        while(!end) {
            System.out.println("Select an item to update :");
            for(int u = 0; u < a; u++) {
                System.out.println((u + 1) + " ----- " + item[u]);
            }
            System.out.println((a + 1) + " ----- Back\n"
                               + "Your selection :");
            if(!scan.hasNextInt()) {
                System.out.println("Your selection is invalid, please try again.");
                scan.next();
            }
            else {
                int update = scan.nextInt();
                if(update > 0 && update <= a) {
                    while(!end1) {
                        System.out.println("Select one of the data to update :\n"
                                           + "1 ----- Name\n"
                                           + "2 ----- Price\n"
                                           + "3 ----- Unit\n"
                                           + "4 ----- Back\n"
                                           + "Your selection :");
                        if(!scan.hasNextInt()) {
                            System.out.println("Your selection is invalid, please try again.");
                            scan.next();
                        }
                        else {
                            int update1 = scan.nextInt();
                            switch(update1) {
                                case 1 :
                                    System.out.println("Enter the new name of item :");
                                    scan.nextLine();
                                    item[update - 1] = scan.nextLine();
                                    System.out.println("The name of item at index[" + (update - 1) + "] is updated successfully.");
                                    end1 = true;
                                    break;
                                case 2 :
                                    while(!end2) {
                                        System.out.println("Enter the new price of item :");
                                        if(!scan.hasNextDouble()) {
                                            System.out.println("Please enter a double value.");
                                            scan.next();
                                        }
                                        else {
                                            price[update - 1] = scan.nextDouble();
                                            end2 = true;
                                        }
                                    }
                                    System.out.println("The price of item at index[" + (update - 1) + "] is updated successfully.");
                                    end1 = true;
                                    break;
                                case 3 :
                                    while(!end3) {
                                        System.out.println("Enter the new unit of item :");
                                        if(!scan.hasNextInt()) {
                                            System.out.println("Please enter an integer value.");
                                            scan.next();
                                        }
                                        else {
                                            unit[update - 1] = scan.nextInt();
                                            end3 = true;
                                        }
                                    }
                                    System.out.println("The unit of item at index[" + (update - 1) + "] is updated successfully.");
                                    end1 = true;
                                    break;
                                case 4 :
                                    end1 = true;
                                    break;
                                default :
                                    System.out.println("Your selection is invalid, please try again.");
                            }
                        }
                    }
                    end = true;
                }
                else if(update == (a + 1))
                    end = true;
                else
                    System.out.println("Your selection is invalid, please try again.");
            }
        }
    }
    
    public static void Search(String item[]) {
        Scanner scan = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter the name of item to search :");
        String search = scan.nextLine();
        for(int s = 0; s < item.length; s++) {
            if(search.equalsIgnoreCase(item[s])) {
                System.out.println("Item found at index[" + s + "].");
                found = true;
            }
        }
        if(!found)
            System.out.println("Item not found.");
    }
    
    public static void Report(String item[] , double price[] , int unit[] , int a) {
        System.out.println("_________________________________________");
        System.out.printf("| %-15s| %-10s| %-10s|%n" , "Item" , "Price" , "Unit");
        System.out.println("|========================================|");
        for(int i = 0; i < a; i++)
            System.out.printf("| %-15s| %-10s| %-10s|%n" , item[i] , price[i] , unit[i]);
        System.out.println("_________________________________________");
    }
}
