package CLASE01;

public class main {


   
    public static void main(String[] args) {

         book libro1 = new book();
         book libro2 = new book("Cien anos de soledad", "Gabriel Garca Marquez", 1967, "Narrativo" );
         book libro3 = new book("Don Quijote de la mancha", "Miguel de Cervantes Saavedra", 1605, "Novela", false);
         book libro4 = new book();

         
         libro1.title = "el aro";
         libro3.getBook();
         libro3.getBook();

         System.out.println("************************************");
         libro1.showInfo();
         System.out.println("************************************");
         libro2.showInfo();
         System.out.println("************************************");
         libro3.showInfo();
         System.out.println("************************************");
         
         

    }

    public static void metodos(String[] args) {


//         static String texto;// variable global
//             //tipos de metodos
//         //recibir parametros
//         //no recibir parametros 
//         //devolver algo
//         //no devolver nada

//         texto = metodo4();
//         metodo1();
//             // void significa que devuelve vacio 
// //no recibe nada, no devuelve nada bion
//     public static void metodo1(){
//         System.out.println("hola");
//     }
// //recibe parmeto ppero no devuelve
//     public static void metodo2(int a, int b){
//         System.out.println(a + b);
//     }
// //recibe parametro y devuelve 
//     public int metodo3(int a, int b){
//         return a+b;
//         // variable local, dentro de un metodo
//     }
// //no recibe pero si devuelve
//     public static String metodo4(){
//         return "hola";
//     }

//variables primitivas
//variables nvolventes
    }




}
