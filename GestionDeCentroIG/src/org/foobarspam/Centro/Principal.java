
package org.foobarspam.Centro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.foobarspam.Personas.Alumne;
import org.foobarspam.Personas.Persona;
import org.foobarspam.Personas.Professor;

/**
 *
 * 
 */
public class Principal {
   
    String mensaje, nombre, apellidos;  //VARIABLES PARA ENTRADA DE DATOS Y PARA INFORMACIÃ“N AL USUARIO
    int dia, mes, año, sysdate;    //VARIABLES DE ENTRADA DE FECHAS
    final int maxPersonas = 3;  //VARIABLE MAX PARA INTRODUCIR PERSONAS
    
    Calendar fechaNacimiento = Calendar.getInstance();  //OBJETO DE LA CLASE CALENDAR PARA FECHA IMPRESA
    Calendar fecha = new GregorianCalendar();   //OBJETO DE LA CLASE CALENDAR PARA OBTENER LA FECHA DE SISTEMA
    
    static ArrayList <Persona> listaProfesores; //CREAMOS OBJETO DEL TIPO ARAYLIST PARA PROFESORES
    static ArrayList <Persona> listaAlumnos;    //CREAMOS OBJETO DEL TIPO ARRAYLIST PARA ALUMOS
    
    //METODO MAIN PARA INICIAR Y EJECUTAR EL PROGRAMA
    public void main(){ 
        listaProfesores = new ArrayList <Persona>();    //RESERVAMOS MEMORIA PARA LA LISTA DE PROFESORES
        listaAlumnos = new ArrayList <Persona>();   //RESERVAMOS MEMORIA PARA LA LISTA DE ALUMNOS
        sysdate = fecha.get(Calendar.YEAR);     //OBTENEMOS EL AÃ‘O A FECHA DE SISTEMA PARA FUTURA COMPARACIÃ“N
        mensaje = "Primero debes dar de alta 3 Alumnos y 3 Profesores.";
        imprimir(mensaje);
        introducirDatos();  //LLAMAMOS AL METODO PARA INICIO DE INTRODUCCIÃ“N DE DATOS
        mostrarDatos();     //LLAMAMOS AL METODO PARA IMPRIMIR LOS DATOS POR PANTALLA INTRODUCIDOS PREVIAMENTE POR EL USUARIO
        mensaje = "Hasta la próxima!";
        imprimir(mensaje);
    }
    //METODO INNTRODUCIR DATOS
    public void introducirDatos(){
        introducirAlumno(); //LLAMAMOS AL METODO INTRODUCIR ALUMNOS
        introducirProfesor();   //LLAMAMOS AL METODO INTRODUCIR PROFESORES
    }
    //MÃ‰TODO PRIVADO PARA IMPRIMIR POR PANTALLA EL TOSTRING DE PERSONA QUE NOS DEVOLVDRÃ� LOS VALORES DE LOS ATRIBUTOS DEL OBJETO DE LA CLASE PADRE DEL CUAL HEREDAN LAS CLASES PROFESOR Y ALUMNO
    private void imprimirPersona(Persona per){  //PASAMOS POR PARAMETRO EL OBJETO DE LA CLASE
        imprimir(per.toString());   //COMO PODEMOS VER POR PANTALLA, SOLO SE MUESTRAN LOS ATRIBUTOS QUE SON GENERICOS DE AMBAS CLASES
    }
    //METODO IMPRIMIR DATOS INTRODUCIDOS POR EL USUARIO POR PANTALLA Y MOSTRAR TODO EL RESULTADO
    public void mostrarDatos(){
        for (int i = 0; i < listaAlumnos.size(); i ++){ //BUCLE PARA RECORRIDO DE LA LISTA DE ALUMNOS
            Alumne aux1 = (Alumne) listaAlumnos.get(i); //CREAMOS OBJETO DEL TIPO ALUMNO Y HACEMOS CASTING
            imprimir("Alumne nº: " + (i+1) + " Nom: " + aux1.getNom() + " Lllinatges: " + aux1.getLlinatges()+ " Data de naixement: " + aux1.getDataDeNaixement()
                           + " Curso: " + aux1.getCurso()); //IMPRIMIMOS TODOS LOS DATOS ALMACENADOS DE ALUMNOS
        }
        for(int i = 0; i < listaProfesores.size(); i++){    //BUCLE PARA RECORRIDO DE LISTA DE PROFESORES
            Professor aux2 = (Professor) listaProfesores.get(i);    //CREAMOS OBJETO DEL TIPO PROFESOR E HACEMOS EL CASTING
            imprimir(aux2.toString());  //LLAMAMOS MEDIANTE OBJETO DE LA CLASE PROFESOR AL METODO TOSTRING PARA IMPRIMIR TODOS LOS DATOS
        }
    }
    //METODO PARA DAR DE ALTA ALUMNOS EN LA LISTA
    public void introducirAlumno(){
        for (int i = 0; i < maxPersonas; i++){    //BUCLE PARA REALIZAR 3 ITERACIONES
            mensaje = "\n" + "Introduzca los datos del alumno nº: " + (i + 1);
            imprimir(mensaje);
            mensaje = "Introduzca el nombre:";
            imprimir(mensaje);
            nombre = entradaTexto();
            mensaje = "Introduzca los apellidos:";
            imprimir(mensaje);
            apellidos = entradaTexto();
            mensaje = "Introduzca dia de nacimiento: Formato DD";
            imprimir(mensaje);
            dia = introducirNumero();
            if (esDia()){   //SI EL DIA ES CORRECTO PASAMOS A SIGUIENTE INSTRUCCION(BOOLEANA QUE REVISA QUE EL DIA SEA MAYOR A 1 Y MENOR QUE 31
                mensaje = "Introduzca el mes de nacimiento: Formato MM";
                imprimir(mensaje);
                mes = introducirNumero();
            }
            if (esMes()){   //SI ESL MES ES CORRECTO PASAMOS AL SIGUIENTE PASO(BOOLEANA QUE REVISA SI EL MES ESTA ENTRE 1 Y 12
                mensaje = "Introduzca el año de nacimiento: Formato AAAA";
                imprimir(mensaje);
                año = introducirNumero();
            }
            if (esAño()){   //SI EL AÃ‘O ES CORRECTO(BOOLEANA QUE MIRA QUE EL AÃ‘O DE NACIMIENTO NO SEA SUPERIOR A LA FECHA DEL SISTEMA A DIA DE HOY Y QUE NO SEA INFERIOR A UNA FECHA NO REAL
                fechaNacimiento.set(año, mes, dia); //PONEMOS LOS VALORES OBTENIDOS EN SU RESPECTIVO ORDEN
                Alumne al = new Alumne (nombre, apellidos, fechaNacimientoUsuario(fechaNacimiento));    //OBJETO DE LA CLASE ALUMNO AL CUAL LE PASAMOS TODOS LOS PARAMETROS NECESARIOS
                imprimirPersona(al);    //LLAMAMOS AL MÃ‰TODO PARA IMPRIMIR EL TOSTRING DE LA CALSE PERSONA
                listaAlumnos.add(al);   //AÃ‘ADIMOS A LA LISTA DICHO OBJETO
            }
            
        }    
    }
    //FUNCIÃ“N QUE NOS DEVUELVE UN STRING PARA PODER IMPRIMIR CORRECTAMENTE LA FECHA DE NACIMIENTO DE LA PERSONA
    public String fechaNacimientoUsuario (Calendar fecha){  
        return fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" + fechaNacimiento.get(Calendar.MONTH) + "/" + fechaNacimiento.get(Calendar.YEAR);   //DEVOLVEMOS EL RESULTADO OBTENIDO      
    }
    //METODO INTRODUCCION DE PROFESORES EN LA LISTA
    public void introducirProfesor(){
        for (int i = 0; i < maxPersonas; i++){    //BUCLE CON 3 ITERACIONES PARA INTRODUCIR PROFESORES
            mensaje = "\n"+ "Introduzca los datos del profesor nº: " + (i + 1);
            imprimir(mensaje);
            mensaje = "Introduzca el nombre:";
            imprimir(mensaje);
            nombre = entradaTexto();
            mensaje = "Introduzca los apellidos:";
            imprimir(mensaje);
            apellidos = entradaTexto();
            mensaje = "Introduzca dia de nacimiento: Formato DD";
            imprimir(mensaje);
            dia = introducirNumero();
            if(esDia()){    //MISMO PROCEDIMIENTO QUE CON ALUMNO
                mensaje = "Introduzca el mes de nacimiento: Formato MM";
                imprimir(mensaje);
                mes = introducirNumero(); 
            }if (esMes()){  //MISMO PROCEDIMIENTO QUE CON ALUMNO
                mensaje = "Introduzca el año de nacimiento: Formato AAAA";
                imprimir(mensaje);
                año = introducirNumero();
            }
            if(esAño()){    //MISMO PROCEDIMIENTO QUE CON ALUMNO
                fechaNacimiento.set(año,mes,dia);   //PONEMOS LOS VALORES
                Professor prof = new Professor (nombre, apellidos, fechaNacimientoUsuario(fechaNacimiento));    //CREAMOS EL OBJETO PROFESOR CON SUS PARAMETROS
                imprimirPersona(prof);  //LLAMAMOS AL METODO PARA IMPRIMIR EL TOSTRING DE LA CLASE PERSONA
                listaProfesores.add(prof);  //ALMACENAMOS EL OBJETO DE TIPO PROFESOR EN LA LISTA DE PROFESORES
            }
        }    
    }
    //FUNCION QUE REVISA QUE EL DÃ�A SEA CORRECTO Y DEVUELVE TRUE DE SER ASÃ�
    public boolean esDia(){
        while(dia < 1 || dia > 31){
                mensaje = "El día no se corresponde con una fecha real. Repita por favor.";
                imprimirError(mensaje);
                dia = introducirNumero();
        }
        return true;
    }
    //FUNCIÃ“N QUE REVISA QUE EL MES SEA CORRECTO Y DEVUELVE TRUE DE SER ASÃ�
    public boolean esMes(){
        while (mes < 1 || mes > 12){
                mensaje = "El mes no se corresponde con una fecha real. Repita por favor.";
                imprimirError(mensaje);
                mes = introducirNumero();
        }
        return true;
    }
    //FUNCIÃ“N QUE DEVUELVE QUE EL AÃ‘O SEA CORRECTO Y EN EL FORMATO CORRESPONDIENTE Y DEVUELVE TRUE DE SER ASÃ�
    public boolean esAño(){
        while (año < 1900 || año > sysdate){
                mensaje = "El año no se corresponde con una fecha real. Repita por favor.";
                imprimirError(mensaje);
                año = introducirNumero();
        }
        return true;
    }
    //METODO PARA IMPRIMIR POR PANTALLA
    public void imprimir(String sms){
        System.out.println(sms);
    }
    //FUNCIÃ“N QUE DEVUELVE UN STRING CON EL TEXTO INTRODUCIDO POR EL USUARIO
    public String entradaTexto(){
        String entrada = "";
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            entrada = br.readLine();
            if (entrada.isEmpty()){
                throw new Professor.StringVacio();
            }            
        }catch (Professor.StringVacio sv){  //CONTROL DE ERRORES DE INTRODUCCIÃ“N POR PARTE DEL USUARIO
            System.err.println("No has introducido un nada, por favor, introduzca especialidad");
            entrada = entradaTexto();
        }catch (IOException ioe){
            System.err.println("Error: " + ioe.getMessage());
        }
        return entrada;
    }
    //FUNCIÃ“N QUE DEVUELVE UN ENTERO CON UN VALOR INTRODUCIDO POR EL USUARIO
    public int introducirNumero (){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        int numero = 0;
        try{
            entrada = in.readLine();    
            if (entrada.isEmpty()){ 
                throw new DatoSinRellenar();
            }
            numero = Integer.parseInt(entrada); 
            if(numero < 0){
                throw new NumeroNegativo();
            }
        }catch (NumberFormatException nfe){ //CONTROL DE ERRORES DE FORMATO, NEGATIVO, ETC. EN UN NUMERO
            imprimirError("Error: " + entrada + " no es numero.");
            numero = introducirNumero();
        }catch (NumeroNegativo nn){ 
            imprimirError("El valor introducido "+ entrada + " es negativo, por lo tanto no vÃ¡lido.");
            numero = introducirNumero();
        }catch (DatoSinRellenar dsr){
            imprimirError("Error: No has introducido ningun valor.");
            numero = introducirNumero();
        }catch (IOException ioe){
            imprimirError("Error: " + ioe.getMessage());
        }
        return numero;
    }
    //METODO PÃ€RA IMPRIMIR ERRORES
    public void imprimirError(String sms){
        System.err.println(sms);
    }
    //CLASES DERIVADAS DE EXCEPTION PARA CONTROLAR ERRORES
    public class DatoSinRellenar extends Exception {
        public DatoSinRellenar() {
        }
    }
    private class NumeroNegativo extends Exception { 
        public NumeroNegativo() {
        }
    }
}
/*
CONTESTACIÃ“N A LAS PREGUNTAS:
1) Quin accÃ©s han de tenir els atributs i mÃ¨todes de Persona per poder-los utilitzar directament des de Professor ?
RESPUESTA: El acceso tiene que ser de tipo Protected.
2) Quina informaciÃ³ veis per els professors ? I per els alumnes ? Per quÃ¨?
RESPUESTA: De los profesores se visualiza toda la informaciÃ³n ya que tiene un mÃ©todo toString, sin embargo de alumnos solo vemos la informaciÃ³n que nos puede 
dar el padre con su toString de la clase Persona, es decir, solo nos muestra los atributos de Persona.
3) Podeu utilitzar getEspecialitat o getCurs dins el mÃ¨tode imprimir ? Per quÃ¨?
RESPUESTA: Porque son mÃ©todos de una clase heredada.
*/
