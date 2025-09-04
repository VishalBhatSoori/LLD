package googleDocs.initialDesign;

public class Main {
    public static void main(String[] args) {
        DocumentEditor docs = new DocumentEditor();
        docs.addText("Hell from Vishal to Docs editor");
        docs.addImage("picture.jpg");
        docs.addImage("image.png");
        docs.addText("This is the end of docs");

        docs.saveToFile();
    }
}
