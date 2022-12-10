package org.example;

import me.dilley.MineStat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final int MINECRAFT_PORT = 25565;

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        final var ip = "35.210.62.232";

        log.info("Checking server status: {}:{}", ip, MINECRAFT_PORT);
        MineStat mineStat = new MineStat(ip, MINECRAFT_PORT);

        int players;
        if(mineStat.isServerUp()) {
            log.info("Server {} is up", ip);
            players = mineStat.getCurrentPlayers();
        } else {
            log.info("Server {} is down", ip);
            players = 0;
        }

        log.info("Players online: {}", players);
    }
}
