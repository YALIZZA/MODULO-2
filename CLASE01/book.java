package CLASE01;

public class book {
    //atributos
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    //inicializacion de atributos
    public book () {//constructor, no recibe parametro y no inicia nada
        //su proposito es emezar a construir con valores iniciales
        //this = para referirse a atributos globales
        title = "Sin titulo";
        author = "N/A";
        year = 0;
        gender = "N/A";
        isBusy = false;

    }

    public book(String title, String author, int year, String gender, boolean isBusy) {

        this.title = title; // o titleP
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;
    }
  
    public book(String title, String author, int year, String gender) {

        this.title = title; // o titleP
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;
    }

    public void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("Is busy: " + isBusy);
    }

   public void showInfo() {
        System.out.println("Gender: " + gender);
        System.out.println("Is busy: " + isBusy);

   }

    protected void getBook(){
        if(!isBusy) {
            isBusy = true;
            System.out.println("El lbro: " + title + "ha sido prestado.");
        } else {
             System.out.println("El libro: " + title + "ya esta prestado.");
        }

    }

    public void returnBook(){
        if(!isBusy) {
            isBusy = false;
            System.out.println("El lbro: " + title + "ha sido devuelto.");
        } else {
             System.out.println("El libro: " + title + "no esta prestado.");
        }

    }

}
