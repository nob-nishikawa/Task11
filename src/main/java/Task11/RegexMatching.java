package Task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching {

  public Matcher matching(Pattern pattern, String line) {
//    Pattern regexPattern = Pattern.compile(regex);
    return pattern.matcher(line);

  }


}

