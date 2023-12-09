import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestingData {
    static List<Arguments> data (){
        return Arrays.asList(arguments("Jack Black", 23), arguments("John Gaspar", 56), arguments("Bianca Martini", 18));
    }
}
