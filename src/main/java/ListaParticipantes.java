
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ListaParticipantes {
    public ArrayList<Participante> participantes;
    private int indiceParticipantes;
    
    public ListaParticipantes() {
        participantes = new ArrayList<>();
        indiceParticipantes = 0;
    }
    
    public void ingresarParticipantes(Participante participante) {
        participantes.add(participante);
        indiceParticipantes++;
    }
    
    public void cargarParticipantes() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("participantes.txt"));
            String linea;
            while((linea = reader.readLine()) != null) {
                char[] letras = linea.toCharArray();
                char[] atributos = new char[50];
                
                String atributo;
                
                String nombre = null;
                String apellido = null;
                String correoElectronico = null;
                String numeroTelefono = null;
                String sexo = null;
                String edad = null;
                String numeroCarne = null;
                String facultad = null;
                String tallaPlayera = null;
                String textoPlayera = null;
                String modalidadCarrera = null;
                String numeroCorredor = null;
                String tiempoCarrera = null;
                
                int atributoNo = 1;
                int indiceAtributos = 0;
                
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] != '|') {
                        atributos[indiceAtributos] = letras[i];
                        indiceAtributos++;
                    } else {
                        atributo = new String(atributos);
                        switch (atributoNo) {
                            case 1:
                                nombre = atributo;
                                break;
                            case 2:
                                apellido = atributo;
                                break;
                            case 3:
                                correoElectronico = atributo;
                                break;
                            case 4:
                                numeroTelefono = atributo;
                                break;
                            case 5:
                                sexo = atributo;
                                break;
                            case 6:
                                edad = atributo;
                                break;
                            case 7:
                                numeroCarne = atributo;
                                break;
                            case 8:
                                facultad = atributo;
                                break;
                            case 9:
                                tallaPlayera = atributo;
                                break;
                            case 10:
                                textoPlayera = atributo;
                                break;
                            case 11:
                                modalidadCarrera = atributo;
                                break;
                            case 12:
                                numeroCorredor = atributo;
                                break;
                            case 13:
                                tiempoCarrera = atributo;
                                break;
                        }
                        atributoNo++;
                        indiceAtributos = 0;
                        atributos = new char[50];
                    }
                }
                nombre = nombre.replaceAll("[^\\p{Print}]", "");
                apellido = apellido.replaceAll("[^\\p{Print}]", "");
                correoElectronico = correoElectronico.replaceAll("[^\\p{Print}]", "");
                numeroTelefono = numeroTelefono.replaceAll("[^\\p{Print}]", "");
                sexo = sexo.replaceAll("[^\\p{Print}]", "");
                edad = edad.replaceAll("[^\\p{Print}]", "");
                numeroCarne = numeroCarne.replaceAll("[^\\p{Print}]", "");
                facultad = facultad.replaceAll("[^\\p{Print}]", "");
                tallaPlayera = tallaPlayera.replaceAll("[^\\p{Print}]", "");
                textoPlayera = textoPlayera.replaceAll("[^\\p{Print}]", "");
                modalidadCarrera = modalidadCarrera.replaceAll("[^\\p{Print}]", "");
                numeroCorredor = numeroCorredor.replaceAll("[^\\p{Print}]", "");
                tiempoCarrera = tiempoCarrera.replaceAll("[^\\p{Print}]", "");
                
                Participante participante = new Participante(nombre, apellido, correoElectronico, numeroTelefono, sexo, edad, numeroCarne, facultad, 
                tallaPlayera,textoPlayera, modalidadCarrera, numeroCorredor, tiempoCarrera);    
                ingresarParticipantes(participante); 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
    public int getIndiceParticipantes() {
        return indiceParticipantes;
    }
      
    private class ParticipanteAgeComparator implements Comparator<Participante> {
        @Override
        public int compare(Participante p1, Participante p2) {
            // Sort in descending order
            return Integer.compare(p1.getTiempo(), p2.getTiempo());
        }
    }
    
    public void ordenar() {
        Collections.sort(participantes, new ParticipanteAgeComparator());
    }
    
    public void imprimir() {
        for (int j = 0; j <= getIndiceParticipantes() - 1; j++) {
                    
            String nombre = participantes.get(j).getNombre();
            String apellido = participantes.get(j).getApellido();
            String correoElectronico = participantes.get(j).getCorreoElectronico();
            String numeroTelefono = participantes.get(j).getNumeroTelefono();
            String sexo = participantes.get(j).getSexo();
            String edad = participantes.get(j).getEdad();
            String numeroCarne = participantes.get(j).getNumeroCarne();
            String facultad = participantes.get(j).getFacultad();
            String talla = participantes.get(j).getTallaPlayera();
            String texto = participantes.get(j).getTextoPlayera();
            String modalidad = participantes.get(j).getModalidadCarrera();
            String numeroCarrera = participantes.get(j).getNumeroCorredor();
            String tiempoCarrera = participantes.get(j).getTiempoCarrera();
            
            System.out.println(nombre);
            System.out.println(tiempoCarrera);
        }
    } 
}