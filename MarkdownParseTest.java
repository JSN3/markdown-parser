import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class MarkdownParseTest {

    String winPath = "C:/Users/kimtj/Documents/GitHub/markdown-parser/";

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of(winPath + "test-file.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestTwo() throws IOException {
        Path fileName = Path.of( winPath + "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestThree() throws IOException {
        Path fileName = Path.of( winPath + "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestFour() throws IOException {
        Path fileName = Path.of( winPath + "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestFive() throws IOException {
        Path fileName = Path.of( winPath + "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

}