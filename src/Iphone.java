public class Iphone implements ReprodutorMusicalInterface, NavegadorNaInternetInterface, AparelhoTelefonicoInterface {

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo a música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }


    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Testando os métodos
        iphone.tocar("Tente outra vez");
        iphone.pausar();
        iphone.selecionarMusica("Java é maravilhoso");

        iphone.ligar("19-9999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.aprendendojava.com");
        iphone.adicionarNovaAba("https://www.stackoverflow.com");
        iphone.atualizarPagina();
    }
}
