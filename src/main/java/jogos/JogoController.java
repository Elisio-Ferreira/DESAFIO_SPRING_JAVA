package jogos;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import  java.util.List;

@RestController
public class JogoController {

        @GetMapping("/boas-vindas")
        public String boasVinda() {
            return "Minha API de jogos esta no AR!";
        }



        @GetMapping("/destaque")
        public Jogo destaque() {
            return new Jogo("Minecraft",
                    "sandbox",
                    2011,
                    true);
        }

        @GetMapping("/jogos")
        public List<Jogo> jogos() {
            return List.of(
                    new Jogo("Minecraft", "Sandbox", 2011, true),
                    new Jogo("GTA V", "Ação", 2013, true),
                    new Jogo("FIFA 24", "Esporte", 2011, true),
                    new Jogo("The Witcher 3", "RPG", 2015, false)

            );

        }
}