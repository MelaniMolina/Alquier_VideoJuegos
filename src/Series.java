public class Series {
    String titulo;
    int num_temp;
    Boolean entregado = false;
    String genero;
    String creador;

    public  Series(){
        titulo = "Hada de las Pesas";
        num_temp = 2;
        genero = "Romantico";
        creador = "Josue Salazar";
    }
public  Series(String titulos, String creadores){
        this.titulo = titulos;
        this.creador = creadores;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_temp() {
        return num_temp;
    }

    public void setNum_temp(int num_temp) {
        this.num_temp = num_temp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    public  void Datos_Series(Series ser[]){
        ser[0].setTitulo("Lluvia de Amor");
        ser[0].setNum_temp(2);
        ser[0].setCreador("Oh Soo Yeon");
        ser[0].setGenero("Romance Melodrama");

        ser[1].setTitulo("The Wolking Dead");
        ser[1].setNum_temp(11);
        ser[1].setCreador("Frank Darabont");
        ser[1].setGenero("Drama y Terror");

        ser[2].setTitulo("Breanking Bad");
        ser[2].setNum_temp(5);
        ser[2].setCreador("Vince Gilligan");
        ser[2].setGenero("Accion Drama");

        ser[3].setTitulo("Better call Saul");
        ser[3].setNum_temp(6);
        ser[3].setCreador("Peter Gould");
        ser[3].setGenero("Drama");

        ser[4].setTitulo("La maldicion de hill house");
        ser[4].setNum_temp(1);
        ser[4].setCreador("Mike Flanagan");
        ser[4].setGenero("Terror");
    }
}
