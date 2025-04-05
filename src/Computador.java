public class Computador {
    public String marca;
    public float preco;
    HardwareBasico hardwareB;
    SistemaOperacional sistemaO;
    MemoriaUSB memoriaUSB;


    public Computador(String marca, SistemaOperacional sistemaO, HardwareBasico hardwareB, float preco) {
        this.marca = marca;
        this.sistemaO = sistemaO;
        this.hardwareB = hardwareB;
        this.preco = preco;
    }

    public void mostraPcConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Hardware: " + hardwareB.nome);
        System.out.println("Sistema Operacional: " + sistemaO.nome + " " + sistemaO.tipo+ " bits");
        System.out.println("Pc possui "+hardwareB.capacidade+" Gb de espaço");


    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB=musb;
    }
}
