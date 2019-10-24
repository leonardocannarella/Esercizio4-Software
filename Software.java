/**
 * Software - Inserisci metadati del programma e restituisce altrettanti
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 10/10/2019)
 */
public class Software
{
    private String denominazione;
    private String produttore;
    private double versione;
    private String sistemaOperativo;
    private int anno;
    
    public Software(String denominazione, String produttore, double versione, String sistemaOperativo, int anno)
    {
        setDenominazione(denominazione);
        setProduttore(produttore);
        setVersione(versione);
        setSistemaOperativo(sistemaOperativo);
        setAnno(anno);
    }
    
    private void setDenominazione(String d)
    {
        denominazione=d;
    }
    
    private void setProduttore(String p)
    {
        produttore=p;
    }
    
    private void setVersione(double v)
    {
        versione=v;
    }
    
    private void setSistemaOperativo(String OS)
    {
        sistemaOperativo=OS;
    }
    
    private void setAnno(int a)
    {
        anno=a;
    }
    
    public String getDenominazione()
    {
        return denominazione;
    }
    
    public String getProduttore()
    {
        return produttore;
    }
    
    public double getVersione()
    {
        return versione;
    }
    
    public String getSistemaOperativo()
    {
        return sistemaOperativo;
    }
    
    
    public int getAnno()
    {
        return anno;
    }
    
    public String toString()
    {
        return "SOFTWARE\n" + 
        "Denominazione: " + getDenominazione() + "\nProduttore: " + getProduttore() + "\nVersione: " + getVersione() + "\nSistema operativo: " + getSistemaOperativo() + "\nAnno: " + getAnno() + "\n";
    }
    
    public String compareAnno(Software a)
    {
        if(getAnno() > a.getAnno())
        {
            return getDenominazione() + " è più recente di " + a.getDenominazione();
        }
        else if(getAnno() < a.getAnno())
        {
            return getDenominazione() + " è più datato di " + a.getDenominazione();
        }
        else
        {
            return getDenominazione() + a.getDenominazione() + " sono stati prodotti lo stesso anno";
        }
    }
}
