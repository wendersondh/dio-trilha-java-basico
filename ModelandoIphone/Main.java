package dioTrilhaJavaBasico.ModelandoIphone;

public class Main {
    public static void main(String[] args) {
        Iphone xs = new Iphone();

        xs.selecionarMusica("Surreal");
        xs.tocar();
        xs.pausar();

        xs.ligar("98888-8888");
        xs.atender();
        xs.iniciarCorreioVoz();

        xs.exibirPagina("google.com");
        xs.atualizarPagina();
        xs.adicionarNovaAba();
    }
}
