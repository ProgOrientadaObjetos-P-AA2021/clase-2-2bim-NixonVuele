package paquete6;

public class EstudiantePresencial extends Estudiante {

    protected int numeroCreditos;
    protected double costoCredito;
    protected double matriculaPresencial;

    //Se añadio el constructor para que reciba los valore y luego
    //Se le envia los 4 parametros al constructor de la clase estudiante
    //Con la palabra reservada "super"
    public EstudiantePresencial(String n, String a, String iden, int ed,
            int numero, double valor) {
        super(n, a, iden, ed);
        numeroCreditos = numero;
        costoCredito = valor;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Numero de creditos: %d\n"
                + "Costo de Creditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());

        return cadenaFinal;
    }

}
