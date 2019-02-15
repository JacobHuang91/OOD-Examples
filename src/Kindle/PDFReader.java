package Kindle;

import java.io.File;

public class PDFReader implements ReaderFactory {
    @Override
    public File toUTF8(Book book) {
        return null;
    }

    @Override
    public void separatePage(File file) {

    }

    @Override
    public void display(File file) {

    }
}
