public class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

    private String nome;

    AparelhoTelefonico(String nome) {

        this.nome = nome;

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba aberta.");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida.");
        
    }

    @Override
    public void pausar() {
        
        System.out.println("Pausado.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando.");
        
    }

    public String getNome() {
        return nome;
    }
}
