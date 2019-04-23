import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile {
    public HerbNode ReadHerb() {
        HerbNode herbhead = null;
        try {
            File file = new File("HerbData.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()) {
                String name = "" , type = "" , imagelct = "" , description = "" , relatedds = "" , relatedtm = "";
                if(scanner.hasNextLine())
                    name = scanner.nextLine();
                if(scanner.hasNextLine())
                    type = scanner.nextLine();
                if(scanner.hasNextLine())
                    imagelct = scanner.nextLine();
                if(scanner.hasNextLine())
                    description = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedds = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedtm = scanner.nextLine();
                HerbNode list = new HerbNode(name , type , imagelct , description , relatedds , relatedtm);
                if(herbhead == null)
                    herbhead = list;
                else {
                    list.setLink(herbhead);
                    herbhead = list;
                }
            }
            fileReader.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return herbhead;
    }
    
    public DiseaseNode ReadDisease() {
        DiseaseNode diseasehead = null;
        try {
            File file = new File("DiseaseData.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()) {
                String name = "" , description = "" , relatedh = "" , relatedtm = "";
                if(scanner.hasNextLine())
                    name = scanner.nextLine();
                if(scanner.hasNextLine())
                    description = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedh = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedtm = scanner.nextLine();
                DiseaseNode list = new DiseaseNode(name , description , relatedh , relatedtm);
                if(diseasehead == null)
                    diseasehead = list;
                else {
                    list.setLink(diseasehead);
                    diseasehead = list;
                }
            }
            fileReader.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return diseasehead;
    }
    
    public TreatmentNode ReadTreatment() {
        TreatmentNode treatmenthead = null;
        try {
            File file = new File("TreatmentData.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()) {
                String name = "" , type = "" , description = "" , relatedh = "" , relatedds = "";
                if(scanner.hasNextLine())
                    name = scanner.nextLine();
                if(scanner.hasNextLine())
                    type = scanner.nextLine();
                if(scanner.hasNextLine())
                    description = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedh = scanner.nextLine();
                if(scanner.hasNextLine())
                    relatedds = scanner.nextLine();
                TreatmentNode list = new TreatmentNode(name , type , description , relatedh , relatedds);
                if(treatmenthead == null)
                    treatmenthead = list;
                else {
                    list.setLink(treatmenthead);
                    treatmenthead = list;
                }
            }
            fileReader.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return treatmenthead;
    }
    
    public void SaveHerb(HerbNode herbhead) {
        try {
            File file = new File("HerbData.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            HerbNode current = herbhead;
            while(current != null) {
                printWriter.println(current.getName().toString());
                printWriter.println(current.getType().toString());
                printWriter.println(current.getImage().toString());
                printWriter.println(current.getDescription().toString());
                printWriter.println(current.getRelatedds().toString());
                printWriter.println(current.getRelatedtm().toString());
                current = current.getLink();
            }
            printWriter.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void SaveDisease(DiseaseNode diseasehead) {
        try {
            File file = new File("DiseaseData.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            DiseaseNode current = diseasehead;
            while(current != null) {
                printWriter.println(current.getName().toString());
                printWriter.println(current.getDescription().toString());
                printWriter.println(current.getRelatedh().toString());
                printWriter.println(current.getRelatedtm().toString());
                current = current.getLink();
            }
            printWriter.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void SaveTreatment(TreatmentNode treatmenthead) {
        try {
            File file = new File("TreatmentData.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            TreatmentNode current = treatmenthead;
            while(current != null) {
                printWriter.println(current.getName().toString());
                printWriter.println(current.getType().toString());
                printWriter.println(current.getDescription().toString());
                printWriter.println(current.getRelatedh().toString());
                printWriter.println(current.getRelatedds().toString());
                current = current.getLink();
            }
            printWriter.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
