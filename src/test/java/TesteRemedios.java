import org.farmacia.entities.Farmaceutica;
import org.farmacia.entities.Remedio;
import org.farmacia.entities.Substancia;
import org.farmacia.entities.Tipo;
import org.farmacia.services.RemedioService;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteRemedios {
    static void testeRemedios(Scanner sc) {
        RemedioService.cadastrarRemedio(sc);
        /*
        RemedioService.atualizarRemedio(sc);
        RemedioService.removerRemedio(sc);
         */
        RemedioService.listarRemedios();
    }
}
