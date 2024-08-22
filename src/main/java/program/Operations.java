package main.java.program;
public class Operations {
    public static float Somar(float a, float b){
        float result = a + b;
        return result;
    }

    public static float Dividir(float a, float b){
        float result = a / b;
        return result;
    }

    public static float Subtracao(float a, float b){
        float result = a - b;
        return result;
    }

    public static float RestoDivisao(float a, float b){
        float result = a % b;
        return result;
    }

    public static float Multiplicacao(float a, float b){
        float result = a * b;
        return result;
    }

    public static boolean isPar(float n1, float n2){
        float result = n1 + n2;
        if(result % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
