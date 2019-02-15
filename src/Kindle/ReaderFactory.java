package Kindle;

import java.io.File;

/**
 * factory design pattern
 */
public interface ReaderFactory {
    public File toUTF8(Book book);

    public void separatePage(File file);

    public void display(File file);
}
