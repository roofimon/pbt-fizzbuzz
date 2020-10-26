import com.sun.tools.javac.util.Assert;
import net.jqwik.api.Example;
import net.jqwik.api.lifecycle.BeforeExample;
import org.assertj.core.api.Assertions;


public class FizzBuzzUnitTest {
    FizzBuzz fizzBuzz;
    @BeforeExample
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Example
    public void itShouldReturn1WhenInoutIs1() {
        String actual = fizzBuzz.count(1);
        Assertions.assertThat(actual).isEqualTo("1");
    }

    @Example
    public void itShouldReturn8WhenInoutIs8() {
        String actual = fizzBuzz.count(8);
        Assertions.assertThat(actual).isEqualTo("8");
    }

    @Example
    public void itShouldReturnFizzWhenInoutIs3() {
        String actual = fizzBuzz.count(3);
        Assertions.assertThat(actual).isEqualTo("Fizz");
    }

    @Example
    public void itShouldReturnFizzWhenInoutIs6() {
        String actual = fizzBuzz.count(6);
        Assertions.assertThat(actual).isEqualTo("Fizz");
    }

    @Example
    public void itShouldReturnFizzWhenInoutIs12() {
        String actual = fizzBuzz.count(12);
        Assertions.assertThat(actual).isEqualTo("Fizz");
    }

    @Example
    public void itShouldReturnBuzzWhenInoutIs5() {
        String actual = fizzBuzz.count(5);
        Assertions.assertThat(actual).isEqualTo("Buzz");
    }

    @Example
    public void itShouldReturnBuzzWhenInoutIs10() {
        String actual = fizzBuzz.count(10);
        Assertions.assertThat(actual).isEqualTo("Buzz");
    }

    @Example
    public void itShouldReturnFizzBuzzWhenInoutIs15() {
        String actual = fizzBuzz.count(15);
        Assertions.assertThat(actual).isEqualTo("FizzBuzz");
    }

    @Example
    public void itShouldReturnFizzBuzzWhenInoutIs30() {
        String actual = fizzBuzz.count(30);
        Assertions.assertThat(actual).isEqualTo("FizzBuzz");
    }
}
