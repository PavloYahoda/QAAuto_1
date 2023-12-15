package pyah.first.lesson;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParametrizedTest {

    @Order(1)
    @DisplayName("Test with string params")
    @ParameterizedTest()
    @NullSource
    @EmptySource
    @ValueSource(strings = {"First run", "Second run", "Third run"})
        void stringValue(String param){
        System.out.println(param);
    }

    @Order(2)
    @DisplayName("Test with int params")
    @ParameterizedTest()
    @ValueSource(ints = {1, 2, 3})
        void intValue(int param){
        System.out.println("Run# " + param);
    }

    @Order(3)
    @DisplayName("Test with CSV - string values")
    @ParameterizedTest()
    @CsvSource(value = {"Jack Black", "John Gaspar", "'Martini, Bianca'"})
        void csvStringValue(String param){
        System.out.println(param);
    }

    @Order(4)
    @DisplayName("Test with CSV - string values with custom delimiter")
    @ParameterizedTest()
    @CsvSource(value = {"Jack_Black", "John_Gaspar", "Martini_Bianca"}, delimiter = '_')
    void csvCustomDelimiter(String param1, String param2){
        System.out.println(param1 + " " + param2);
    }

    @Order(5)
    @DisplayName("Test with one CSV file")
    @ParameterizedTest()
    @CsvFileSource (files = "src/test/resources/Book1.csv", numLinesToSkip = 0, delimiter = ';')
    void printFromCSVFile(int rowNumber, String firstName, String lastName, int accountNumber, double money){
        System.out.printf("%-3s %-8s %-10s %-10s %-10s %n", rowNumber, firstName, lastName, accountNumber, money);
    }

    @Order(6)
    @DisplayName("Test with two CSV files")
    @ParameterizedTest()
    @CsvFileSource (files = {"src/test/resources/Book1.csv", "src/test/resources/Book2.csv"}, numLinesToSkip = 0, delimiter = ';')
    void printCSVFiles(int rowNumber, String firstName, String lastName, int accountNumber, double money){
        System.out.printf("%-3s %-8s %-10s %-10s %-10s %n", rowNumber, firstName, lastName, accountNumber, money);
    }

    @Order(7)
    @DisplayName("Test Method Source")
    @ParameterizedTest()
    @MethodSource(value = "pyah.first.lesson.TestingData#data") //set fully qualified name # method's name
    void printFromMethod(String name, int age){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
