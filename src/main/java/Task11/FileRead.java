package Task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

  public List<String> getLine(String fileName) throws IOException {

    List<String> Lines = new ArrayList<>();
    try {
      Lines = Files.readAllLines(Path.of(fileName));

    } catch (IOException e) {
      e.printStackTrace();

    }
    return Lines;
  }

}
