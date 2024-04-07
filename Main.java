package src.backend;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Build street name:
        String street = "";
        for (int i = 0; i < args.length - 1; i++) {
            street += args[i] + " ";
        }
        street += args[args.length - 1];
        // Use graph with command args, e.g. 28th St
        Graph graph = new Graph("Shelter");
        String route = graph.bfs(street);
        System.out.println(route);
    }
}

