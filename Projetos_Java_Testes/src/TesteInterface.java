public interface TesteInterface {
    void acorda();
}

class Pessoa{
    public static class pessoa implements TesteInterface{
        public void acorda(){
            System.out.println("1° Respira ");
            System.out.println("2° Abre os olhos");
            System.out.println("3° Ir no banheiro");
        }
    }
    public static void main(String[]args){
        TesteInterface meuTeste = new pessoa();
        meuTeste.acorda();
    }
}

