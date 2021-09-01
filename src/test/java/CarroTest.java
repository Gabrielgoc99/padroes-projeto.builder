import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CarroTest {

    @Test
    public void deveRetonarCarro() {
        Carro carro = new Carro(1, "ABC-2D12", "Focus");
        carro.setMarca("Ford")
                .setVersao("2.0 Titanium")
                .setCor("Cinza")
                .setAno(2013)
                .setAnoModelo(2013);

    }

}