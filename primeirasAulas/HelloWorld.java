package primeirasAulas;
public class HelloWorld {

    public static void main(String[] args) {
        System.err.println("Hello World");

        int dadoDoTipoInt = 10;
        // double dadoDoTipoDpuble = 3.14;
        // float dadoDoTipoFloat = 1.33f;
        // long dadoDotipoLong = 83012981283021980L;
        // String dadoDoTipoString = "minha string";
        // boolean dadoDoTipoBoolean = false;
        
        if(dadoDoTipoInt == 11) {
            System.out.println("Entrou no if");
        } else {
            System.out.println("Entrou no else");
        }

        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            valorInicial++;
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}