import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FrequenzaCarattere
{
	public static void main(String args[])
	{
		int[] frequenza = new int[10];
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		String tel = null;
		boolean errore = false;
        System.out.println("Inserisci numero di telefono: ");
        try
        {
			tel = tastiera.readLine();
		}
        catch (IOException e) {}
        for(int i = 0; i < tel.length(); i++)
        {
        	char c = tel.charAt(i);
        	if(c<'0' || c>'9')
        	{
        		errore = true;
        		break;
        	}
        	else
        	{
        		int numero = Character.getNumericValue(c);
        		frequenza[numero]++;
        	}
        }
        if(errore)
        {
        	System.out.println("Errore non hai inserito un numero di telefono valido");
        }
        else
        {
	        for(int i = 0; i < frequenza.length; i++)
	        {
	        	System.out.println("numero di "+i+" : "+frequenza[i]);
	        }
        }
	}
}
