package dioTrilhaJavaBasico.ModelandoIphone;

public class Iphone implements musicas, AparelhoTelefonico, Navegador {

    public void selecionarMusica(String musica) {
        System.out.println("Musica "+ musica + " selecionada");
    }
    public void tocar() {
        System.out.println("TOCANDO");
    }
    public void pausar() {
        System.out.println("PAUSANDO");
    }
    public void ligar(String numero) {
        System.out.println("LIGANDO");
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
}
