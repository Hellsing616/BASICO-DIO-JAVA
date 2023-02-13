package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {}
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo: "+getTitulo()+"\n"+
                "Descrição: : "+getDescricao()+"\n"+
                "data=" + data +
                '}';
    }
}
