
public class CalculadoraTest {

    public static void main(String[] args) {
       Calculadora calc = new Calculadora();
       

        //Cenário de teste  1: Soma de dois valores
        double soma = calc.somar(1, 3);
        System.out.println(soma);
        
        
        
        //Cenário de teste  2: Soma de dois valores sendo um zero
        soma = calc.somar(1, 0);
        System.out.println(soma);
        
        
        
        
        //Cenário de teste  3: Soma de dois valores sendo que ambos são zero
        soma = calc.somar(0, 0);
        System.out.println(soma);
        
        
        
        
        //Cenário de teste  4: Soma de dois valores sendo um negativo
        soma = calc.somar(1, -3);
        System.out.println(soma);
        
        
        
        //Cenário de teste  5: Soma de dois valores sendo um número quebrado
        soma = calc.somar(1, 3.3);
        System.out.println(soma);
        
        //Cenário de teste  6: Soma de dois valores sendo ambos números quebrados
        soma = calc.somar(1.2, 3.3);
        System.out.println(soma);
    }
    
}
