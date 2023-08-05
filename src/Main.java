public class Main {
    public static void main(String[] args) {
        Pessoa pessoaf = new pessoaFisica();
        Pessoa pessoaj = new pessoaJuridica();

        //getNome é possível pois esse atributo vem de herança da classe pai "Pessoa"
        /*getNome is possible because it takes the "nome" attribute from the
        parent class "Pessoa"*/
        pessoaj.getNome();
    }
}