package oops.polymorphism;
class fileOpen{
    public void run(){
        System.out.println("open file");
    }
}
class PDFfile extends fileOpen{
    @Override
    public void run(){
        System.out.println("open PDF file");
    }
}
class Textfile extends fileOpen{
    @Override
    public void run(){
        System.out.println("open Text file");
    }
}
public class method_overridingPOLY {
    public static void main(String[] args) {
        fileOpen fileObj = new fileOpen();
        fileObj.run();
        PDFfile PdfObj = new PDFfile();
        PdfObj.run();
        Textfile TextObj = new Textfile();
        TextObj.run();
    }
}
