public class Aufgabe5_1810653831 {
    public static void main(String[] args)
    {
        int zahl1 = 10;
        int zahl2 = 20;

        /*Dies ist ein Präfix, die Variable wird erst nach der Weiterverwendung um eins erhöht.
        Weshalb beim "sout" die selbe Zahl ausgegeben wird (in diesem Fall 10/20)*/
        System.out.println(zahl1++);
        System.out.println(zahl2++);

        //Gibt man die Zahl anschließend noch einmal aus, wird die addition ausgeführt und die Variable um eins erhöht.(11/21)
        System.out.println(zahl1);
        System.out.println(zahl2);

        /*Dies ist ein Postfix, die Variable wird vor der Weiterverwendung um eins erhöht.
        Weshalb beim "sout" die direkt die Variable+1 ausgegeben wird. (in diesem Fall 12&22)*/
        System.out.println(++zahl1);
        System.out.println(++zahl2);

        System.out.println(zahl1);
        System.out.println(zahl2);

        /*Bei den Inkrementierungen handelt es sich um Präfix (++zahl) und Postfix (zahl++), dabei unterscheidet sich die
         * Ausführungsreihenfolge. Beim Präfix wird es vor der Weiterverwendung, beim Postfix nach der Weiterverwendung
         * der Variablen ausgeführt. */


    }
}
