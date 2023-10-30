package org.example;

@Observe(key = "Licitante")
public class Leiloeiro implements Observer {
    private String nome;
    private String[] items;

    @Override
    public void update(String LicitanteNome, int LicitanteDinheiro) {
        System.out.println(LicitanteNome + "atualizou o dinheiro disponível: " + LicitanteDinheiro );
    }

}
