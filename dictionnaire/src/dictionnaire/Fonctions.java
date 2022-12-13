package dictionnaire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fonctions {

	//Lecture du fichier francais.txt
		public static void lectureFichierFrancais(ArrayList tableauFrancais) {
				File fileFrancais = new File("francais.txt");
				try(BufferedReader buffered = new BufferedReader(new FileReader(fileFrancais))) {
					String line;
					while((line = buffered.readLine()) != null) {
						tableauFrancais.add(line);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}


		//Lecture du fichier anglais.txt
		public static void lectureFichierAnglais(ArrayList tableauAnglais) {
		File fileAnglais = new File("anglais.txt");
		try(BufferedReader buffered = new BufferedReader(new FileReader(fileAnglais))) {
			String line;
			while((line = buffered.readLine()) != null) {
				tableauAnglais.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		
		//Lecture du fichier espagnol.txt
		public static void lectureFichierEspagnol(ArrayList tableauEspagnol) {
		File fileEspagnol = new File("espagnol.txt");
		try(BufferedReader buffered = new BufferedReader(new FileReader(fileEspagnol))) {
			String line;
			while((line = buffered.readLine()) != null) {
				tableauEspagnol.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
