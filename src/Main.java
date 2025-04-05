import java.util.Scanner;

//Felipe Campos de Souza
//Matrícula: 453
//Engenharia de Software
//Turma C06-B

public class Main {
    public static void main(String[] args) {
        HardwareBasico hardware1 = new HardwareBasico("Pentium Core i3", 500);
        HardwareBasico hardware2 = new HardwareBasico("Pentium Core i5", 1000);
        HardwareBasico hardware3 = new HardwareBasico("Pentium Core i7", 2000);

        SistemaOperacional sistemaOP1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional sistemaOP2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional sistemaOP3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB memoriausb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriausb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriausb3 = new MemoriaUSB("Hd externo", 1000);

        Computador computador1 = new Computador("Apple", sistemaOP1, hardware1, 453);
        Computador computador2 = new Computador("Samsung", sistemaOP2, hardware2, 1687);
        Computador computador3 = new Computador("Dell", sistemaOP3, hardware3, 6113);

        computador1.addMemoriaUSB(memoriausb1);
        computador2.addMemoriaUSB(memoriausb2);
        computador3.addMemoriaUSB(memoriausb3);

        Cliente cliente = new Cliente("Roberto Carlos", 1112223334);

        Scanner escolha = new Scanner(System.in);

        Computador[] computadores = {computador1, computador2, computador3};
        int[] carrinho = new int[3];
        int posicaoCarrinho = 0;

        int escolhido;
        do {
            System.out.println("Qual promoção deseja comprar? Escolha as promoções de 1-3, caso queira finalizar, digite 0");
            System.out.println("Promoção 1 - Apple - Valor: 453R$");
            System.out.println("Promoção 2 - Samsung - Valor: 1687R$");
            System.out.println("Promoção 3 - Dell - Valor: 6113R$");

            escolhido = escolha.nextInt();

            if (escolhido < 0 || escolhido > 3) {
                System.out.println("Escolha entre 1 e 3!");
            } else if (escolhido != 0 && posicaoCarrinho < 3) {
                carrinho[posicaoCarrinho] = escolhido - 1;
                cliente.comprados[posicaoCarrinho] = computadores[carrinho[posicaoCarrinho]];
                posicaoCarrinho++;
                System.out.println("Computador adicionado ao carrinho!");
            } else if (posicaoCarrinho >= 3) {
                System.out.println("Escolha no máximo 3 itens!");
            }

        } while (escolhido != 0 && posicaoCarrinho < 3);

        System.out.println("\nResumo da compra");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Itens da compra:");

        for (Computador pc : cliente.comprados) {
            if (pc != null) {
                pc.mostraPcConfigs();
            }
        }

        System.out.println("Total da compra: " + cliente.calculaTotalCompra());
    }
}
