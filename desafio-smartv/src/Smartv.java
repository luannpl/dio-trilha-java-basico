public class Smartv{

    private boolean ligada;
    private int canal;
    private int volume;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        if(volume>0){
            volume--;
        }
    }

    public void mudarCanal(){
        canal++;
    }

    public void mudarCanal(int canal){
        this.canal = canal;
    }

    public Smartv(boolean ligada,int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void verStatus(){
        System.out.println("Tv ligada? "+ligada);
        System.out.println("Canal: "+canal);
        System.out.println("Volume: "+volume);
    }

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


}