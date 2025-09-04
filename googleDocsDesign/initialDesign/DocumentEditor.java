package googleDocsDesign.initialDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DocumentEditor {

    private ArrayList<String> elements = new ArrayList<>();
    private String renderedDocument;

    DocumentEditor() {
        this.renderedDocument = "";
    }

    public void addText(String text) {
        elements.add(text);
    }

    // the image type supproted are only .jpg and .png for now
    public void addImage(String path) {
        elements.add(path);
    }

    // this is a renderDocument function which is the business logic but here iam
    // just returning a simple string
    private String renderDocument() {
        if (renderedDocument.isEmpty()) {
            String result = "";
            for (String element : elements) {
                if (element.length() > 4 && (element.substring(element.length() - 4) == ".jpg"
                        || element.substring(element.length() - 4) == ".png")) {
                    result += "[Image: " + element + " ]\n";
                } else {
                    result += element + "\n";
                }
                renderedDocument = result;
            }
        }
        return renderedDocument;
    }

    protected void saveToFile() {
        try (PrintWriter file = new PrintWriter(new FileWriter("document.txt"))) {
            file.println(renderDocument());
            System.out.println("The Document saved to File");
        } catch (IOException err) {
            System.out.println("Some file related error occured" + err.getMessage());
        }
    }

}
