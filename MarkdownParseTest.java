import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;


public class MarkdownParseTest {
    
@Test
public void addition() {
    assertEquals(2, 1 + 1);
}

@Test
public void getLinksTest() throws IOException {
    Path fileName = Path.of("test-file.md");
    String content = Files.readString(fileName);
    ArrayList expected = new ArrayList<String>();
    expected.add("https://something.com");
    expected.add("some-thing.html");
    assertEquals(expected, MarkdownParse.getLinks(content));
}

}