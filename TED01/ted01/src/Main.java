public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi", 2018, 4, "Manual");
        Carro carro2 = new Carro("BMW", 2007, 4, "Automática");

        Moto moto1 = new Moto("Honda", 2019, 1100, "Elétrica");
        Moto moto2 = new Moto("Kawasaki", 20012, 700, "Kick");

        carro1.setAptoParaRodarEmAreasRestritas(true);
        carro2.setAptoParaRodarEmAreasRestritas(false);

        System.out.println("Detalhes do carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());
        System.out.println("Número de Rodas: " + carro1.getNumeroRodas());a
        System.out.println("Tipo de Transmissão: " + carro1.getTipoTransmissao());
        System.out.println("Apto para rodar em áreas restritas? " + (carro1.isAptoParaRodarEmAreasRestritas() ? "Sim" : "Não"));

        System.out.println("\nDetalhes do carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Ano de Fabricação: " + carro2.getAnoFabricacao());
        System.out.println("Número de Rodas: " + carro2.getNumeroRodas());
        System.out.println("Tipo de Transmissão: " + carro2.getTipoTransmissao());
        System.out.println("Apto para rodar em áreas restritas? " + (carro2.isAptoParaRodarEmAreasRestritas() ? "Sim" : "Não"));

        System.out.println("\nDetalhes da moto 1:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Ano de Fabricação: " + moto1.getAnoFabricacao());
        System.out.println("Cilindrada: " + moto1.getCilindrada());
        System.out.println("Tipo de Partida: " + moto1.getTipoPartida());

        System.out.println("\nDetalhes da moto 2:");
        System.out.println("Marca: " + moto2.getMarca());
        System.out.println("Ano de Fabricação: " + moto2.getAnoFabricacao());
        System.out.println("Cilindrada: " + moto2.getCilindrada());
        System.out.println("Tipo de Partida: " + moto2.getTipoPartida());
    }
}