package excecoes;

// Existem dois tipos de exceção. As checadas e as não checadas.

public class Excecoes {
    public static void main(String[] args) {
        try{
            validarNumro(10);
        }catch(Exception e){
            System.out.println("Deu ruim!");
            e.printStackTrace();
        }
    }

    public static void validarNumro(int numero) throws Exception{
        if(numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }
}
