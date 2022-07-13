package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {

        System.out.println("THIS IS THE QUERY:: -->" + query);

		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else {
            if (query.contains("what")) {
                String[] parsed = query.split(" ");
                int first = Integer.parseInt(parsed[3]);
                int second = Integer.parseInt(parsed[5]);
                return Integer.toString(first + second);
            } else if (query.contains("which")) {
                String[] parsed = query.split(" ");
            }
        }

        return "";
    }
}
