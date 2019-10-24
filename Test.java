
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test
{
    public static void main (String[] args)
    {
        Software a, b;
        a = new Software("Office 365", "Microsoft", 12.0, "Windows e Linux", 2019);
        b = new Software("BlueJ", "Oracle", 0.1, "Windows e Linux", 2003);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        
        System.out.println(a.compareAnno(b));
    }
}
