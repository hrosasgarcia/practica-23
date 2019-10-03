
package practica23;

/**
 *
 * @author 17PROGB0442
 */
public class libro {
    
    private String Autor;
    private String titulo;
    private String ISBN;
    private int paginas;

    public libro(){}

    public libro(String Autor, String titulo, String ISBN, int paginas) {
        this.Autor = Autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "libro{" + "Autor=" + Autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", paginas=" + paginas + '}';
   
    }
}
 


