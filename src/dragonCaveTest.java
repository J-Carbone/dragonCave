import dragoncave.main;

import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class dragonCaveTests {
    private void setInput(String data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        System.setIn(input);
    }
    private ByteArrayOutputStream getOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        return output;
    }
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    @After
    public void afterEach() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("Checks when the choice is neither 1 or 2")
    void choiceIsNotOneOrTwo() {
        this.setInput("3\n");
        ByteArrayOutputStream outputStream = this.getOutput();
        String output = outputStream.toString();
        assertFalse(output.contains("That is not a choice!"));
    }

    @Test
    @DisplayName("Checks when the number is 2")
    void choiceIsNumberTwo() {
        this.setInput("2\n");
        ByteArrayOutputStream outputStream = this.getOutput();
        String output = outputStream.toString();
        assertFalse(output.contains("treasure"));
    }

    @Test
    @DisplayName("Checks when the number is 1")
    void choiceIsNumberOne() {
        this.setInput("1\n");
        ByteArrayOutputStream outputStream = this.getOutput();
        String output = outputStream.toString();
        assertFalse(output.contains("Gobbles"));
    }

    @Test
    @DisplayName("Checks when no number is entered")
    void choiceIsNotANumber() {
        this.setInput("Q\n");
        ByteArrayOutputStream outputStream = this.getOutput();
        String output = outputStream.toString();
        assertFalse(output.contains("That is not a number!"));
    }
}