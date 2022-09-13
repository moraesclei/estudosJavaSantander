public class opboolea {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // write your code here

        boolean fimDeSemana = false;
        boolean fazendoSol = false;
        boolean vamosApraia = fimDeSemana && fazendoSol;
        System.out.println(vamosApraia);

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (or)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
    }
}
