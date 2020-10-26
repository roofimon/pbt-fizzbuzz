import net.jqwik.api.*;
import org.assertj.core.api.*;

public class PropertyBasedTests {

    @Property
    void anyNumberDivisibleByThreeIsReplacedByTheWordFizz(@ForAll("onlyDivisibleByThree") int val){
        String result = new FizzBuzz().count(val);
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Property
    void anyNumberDivisibleByFiveIsReplacedByTheWordFizz(@ForAll("onlyDivisibleByFive") int val){
        String result = new FizzBuzz().count(val);
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Property
    void anyNumberDivisibleByFifteenIsReplacedByTheWordFizzBuzz(@ForAll("divisibleByThreeAndFive") int val){
        String result = new FizzBuzz().count(val);
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Provide
    Arbitrary<Integer> onlyDivisibleByThree() {
        return Arbitraries.integers().between(1, 100).filter(anInt -> (anInt % 3 == 0)&&(anInt % 5 != 0));
    }

    @Provide
    Arbitrary<Integer> onlyDivisibleByFive() {
        return Arbitraries.integers().between(1, 100).filter(anInt -> (anInt % 3 != 0)&&(anInt % 5 == 0));
    }

    @Provide
    Arbitrary<Integer> divisibleByThreeAndFive() {
        return Arbitraries.integers().between(1, 100).filter(anInt -> (anInt % 3 == 0)&&(anInt % 5 == 0));
    }
}
