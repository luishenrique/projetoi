/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoi;

/**
 *
 * @author L. Henrique
 */
public class diasUteisEHoras {
    //horas
    String horas = "8";

    //dias uteis meses
    String janeiro = "22";
    String fevereiro = "18";
    String marco = "22";
    String abril = "20";
    String maio = "22";
    String junho = "20";
    String julho = "22";
    String agosto = "23";
    String setembro = "19";
    String outubro = "22";
    String novembro = "18";
    String dezembro = "20";

    public String itemSelecionado(String resposta) {
        switch (resposta) {
            case "Janeiro":
                return janeiro;
            case "Fevereiro":
                return fevereiro;
            case "Março":
                return marco;
            case "Abril":
                return abril;
            case "Maio":
                return maio;
            case "Junho":
                return junho;
            case "Julho":
                return julho;
            case "Agosto":
                return agosto;
            case "Setembro":
                return setembro;
            case "Outubro":
                return outubro;
            case "Novembro":
                return novembro;
            case "Dezembro":
                return dezembro;
            default:
                return null;
        }
    }
}
