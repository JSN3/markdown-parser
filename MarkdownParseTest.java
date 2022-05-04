import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(3, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of( "test-file.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestTwo() throws IOException {
        Path fileName = Path.of( "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestThree() throws IOException {
        Path fileName = Path.of( "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestFour() throws IOException {
        Path fileName = Path.of( "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void getLinksTestFive() throws IOException {
        Path fileName = Path.of( "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

}