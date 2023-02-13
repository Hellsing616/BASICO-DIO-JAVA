package br.com.dio.dominio;


public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {}
    public Curso(String titulo, String descricao, int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo: "+getTitulo()+"\n"+
                "Descrição: : "+getDescricao()+"\n"+
                "Carga Horario: " + cargaHoraria  +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
