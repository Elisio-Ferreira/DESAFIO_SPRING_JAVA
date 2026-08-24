package jogos;


public record Jogo(
        String nome,
        String genero,
        int ano,
        boolean multiplayer
) {
}
