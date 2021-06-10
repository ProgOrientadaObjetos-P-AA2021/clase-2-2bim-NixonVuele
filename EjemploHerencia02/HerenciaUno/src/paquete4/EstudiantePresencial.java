
package paquete4;

public class EstudiantePresencial extends Estudiante{
    
    protected int numeroCreditos;
    protected double costoCredito;
    protected double matriculaPresencial;
        //Se añadio el constructor para que reciba los valore y luego
    //Se le envia los 4 parametros al constructor de la clase estudiante
    //Con la palabra reservada "super"
    public EstudiantePresencial(String n, String a, String iden, int ed){
        super( n,  a,  iden,  ed);
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
}
