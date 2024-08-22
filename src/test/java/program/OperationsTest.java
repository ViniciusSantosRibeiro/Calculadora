package test.java.program;

import main.java.program.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationsTest {

    @Test
    void somartoria() {
        Operations operation = new Operations();
        float result = operation.Somar(10, 20);
        Assertions.assertEquals(30, result);
    }

    @Test
    void multiplicando() {
        Operations operation = new Operations();
        float result = operation.Multiplicacao(10, 20);
        Assertions.assertEquals(200, result);
    }

    @Test
    void dividindo() {
        Operations operation = new Operations();
        float result = operation.Dividir(40, 2);
        Assertions.assertEquals(20, result);
    }

    @Test
    void subtraindo() {
        Operations operation = new Operations();
        float result = operation.Subtracao(20, 10);
        Assertions.assertEquals(10, result);
    }

    @Test
    void restoDaDivisao() {
        Operations operation = new Operations();
        float result = operation.RestoDivisao(20, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    void checkIsPar() {
        Operations operation = new Operations();
        boolean result = operation.isPar(20, 20);
        Assertions.assertTrue(result);
    }
}