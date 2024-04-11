public class catalogo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula Matrix");
        /*
         * asignar tipo de valor en Java
         * 
         * tiipo str,int,float,double,bolean nameVarieble = value;
         */
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        /* cadenas de texo */
        String sinopsis = """
                MAtirx es una paradoja, de una de las mejores
                peliculas de la ciecia ficcion lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
        /* convertir a otoro tipo de dato */
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}
