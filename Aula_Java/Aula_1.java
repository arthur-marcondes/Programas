public class Aula_1 {
    public static void main(String[] args) {
        var n = 10;
        var m = 20;
        var soma = n  + m;
        var texto = "A soma de: ";
        float numero1 = 15.2f;
        char letra = 'V';
        boolean teste = true;
        double numero2 = 20.5;
        double resultado = numero2 / numero1;
        System.out.println("O resultado de = " + resultado);
        if (resultado > 2) {
            System.out.println("O resultado é maior que 2 " + teste);
        } else {
            System.out.println("O resultado é menor que 2 " + letra);
        }
        System.out.println(texto + n + " + " + m + " = ");
        System.out.println(soma);
    }
}
