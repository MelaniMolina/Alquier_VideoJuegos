public class VideoJuegos {
    String titulo;
    int horas_estimadas;
    boolean entregados = false;
    String  genero;
    String compania;
    public VideoJuegos(){
        titulo = "Rocket";
        horas_estimadas = 5;
        genero = "Deportivo";
        compania = "Psyonix";
    }
public VideoJuegos(String titul,int horas){
        this.titulo =titul;
        this.horas_estimadas = horas;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    public  void Datos_VideoJuegos(VideoJuegos juegos[]){
        juegos[0].setTitulo("FIFA");
        juegos[0].setHoras_estimadas(10);
        juegos[0].setCompania("Electronic Arts");
        juegos[0].setGenero("Deportivo");

        juegos[1].setTitulo("Persona 5 Royale");
        juegos[1].setHoras_estimadas(90);
        juegos[1].setCompania("Atlus");
        juegos[1].setGenero("JRPG");

        juegos[2].setTitulo("POKEMON Violet");
        juegos[2].setHoras_estimadas(40);
        juegos[2].setCompania("Pokemon Company");
        juegos[2].setGenero("RPG");

        juegos[3].setTitulo("The legend of Zelda Breath of Wild");
        juegos[3].setHoras_estimadas(85);
        juegos[3].setCompania("Nintendo");
        juegos[3].setGenero("Aventura");

        juegos[4].setTitulo("Super Mario Odyssey");
        juegos[4].setHoras_estimadas(25);
        juegos[4].setCompania("Nintendo");
        juegos[4].setGenero("Plataformero");
    }
}
