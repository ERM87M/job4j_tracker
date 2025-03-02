package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput validateInput = new ValidateInput(output, in);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"5"}
        );
        ValidateInput validateInput = new ValidateInput(output, in);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(5);
    }

    @Test
    void whenMultipleValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1", "2", "3", "4", "5"}
        );
        ValidateInput validateInput = new ValidateInput(output, in);
        int selectedOne = validateInput.askInt("Enter menu:");
        assertThat(selectedOne).isEqualTo(1);
        int selectedTwo = validateInput.askInt("Enter menu:");
        assertThat(selectedTwo).isEqualTo(2);
        int selectedThree = validateInput.askInt("Enter menu:");
        assertThat(selectedThree).isEqualTo(3);
        int selectedFour = validateInput.askInt("Enter menu:");
        assertThat(selectedFour).isEqualTo(4);
        int selectedFive = validateInput.askInt("Enter menu:");
        assertThat(selectedFive).isEqualTo(5);
    }

    @Test
    void whenNegativeValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-1"}
        );
        ValidateInput validateInput = new ValidateInput(output, in);
        int selected = validateInput.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}