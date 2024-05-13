public class App {
    public static void main(String[] args) throws Exception {
        Smartv smartv = new Smartv(false, 0, 0);
        smartv.ligar();
        smartv.aumentarVolume();
        smartv.mudarCanal(10);
        smartv.mudarCanal();
        smartv.diminuirVolume();

        smartv.verStatus();
        
    }
}
