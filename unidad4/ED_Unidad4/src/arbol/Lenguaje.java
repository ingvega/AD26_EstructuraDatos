/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author paveg
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Lenguaje {

    static class Variable {
        int valor;
        Variable(int valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringBuilder sb=new StringBuilder();
        
        StringTokenizer st = null;

        HashMap<String, Variable> interprete = new HashMap<>();
        
        int linea = 1;
        String line;
//        for (int i = 0; i < 18; i++) {
//            line = br.readLine();
//        
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue; 

            st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue;

            String instruccion = st.nextToken();

            if (instruccion.equalsIgnoreCase("VAR")) {
                if (st.hasMoreTokens()) {
                    String varName = st.nextToken();
                    if (interprete.containsKey(varName)) {
                        sb.append("ERROR L").append(linea).append("\n");
                        //pw.println("ERROR L" + linea);
                    } else {
                        interprete.put(varName, new Variable(0));
                    }
                }
            } 
            else if (instruccion.equalsIgnoreCase("REF")) {
                if (st.hasMoreTokens()) {
                    String varNueva = st.nextToken();
                    if (st.hasMoreTokens()) {
                        String varExistente = st.nextToken();
                        
                        if (!interprete.containsKey(varExistente) || interprete.containsKey(varNueva)) {
                            sb.append("ERROR L").append(linea).append("\n");
                        } else {
                            interprete.put(varNueva, interprete.get(varExistente));
                        }
                    }
                }
            } 
            else if (instruccion.equalsIgnoreCase("INC")) {
                if (st.hasMoreTokens()) {
                    String varName = st.nextToken();
                    if (!interprete.containsKey(varName)) {
                        sb.append("ERROR L").append(linea).append("\n");
                    } else {
                        interprete.get(varName).valor++;
                    }
                }
            } 
            else if (instruccion.equalsIgnoreCase("PRINT")) {
                if (st.hasMoreTokens()) {
                    String varName = st.nextToken();
                    if (!interprete.containsKey(varName)) {
                        sb.append("ERROR L").append(linea).append("\n");
                    } else {
                        sb.append(interprete.get(varName).valor).append("\n");
                    }
                }
            }

            linea++;
        }
//        interprete.put("A", new Variable(0));
//        for (Map.Entry<String, Variable> entry : interprete.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//           
//            
//        }
        System.out.println(sb);
        br.close();
        
        /*
        
PRINT A
INC A
VAR AB
VAR A
PRINT A
INC A
PRINT A
REF B C
REF B A
INC A
PRINT A
PRINT B
INC B
PRINT A
PRINT B
REF C B
INC C
PRINT A
        */
    }
}