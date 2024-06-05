package it.unicam.cs.f1.manager;

import it.unicam.cs.f1.agent.Agent;
import it.unicam.cs.f1.agent.Bot;
import it.unicam.cs.f1.agent.Player;
import it.unicam.cs.f1.exceptions.IllegalPlayerType;

import java.io.File;
import java.util.Scanner;

public class AgentManager implements Manager<Agent[]> {
    private String pathToAgents;

    public AgentManager(String pathToAgents) {
        this.pathToAgents = pathToAgents;
    }

    public Agent[] load() {
        try {
            File myFile = new File(this.pathToAgents);
            Scanner myReader = new Scanner(myFile);
            int rows = Integer.parseInt(myReader.nextLine());

            Agent[] agents = new Agent[rows];
            for (int i = 0; i < rows; i++) {
                String line = myReader.nextLine().toLowerCase();
                String[] components = line.split(" ");
                if (components[0].equals("bot")){
                    agents[i] = new Bot(components[1]);
                } else if (components[0].equals("player")) {
                    agents[i] = new Player(components[1]);
                } else {
                    throw new IllegalPlayerType(components[0]);
                }
            }
            myReader.close();
            return agents;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
