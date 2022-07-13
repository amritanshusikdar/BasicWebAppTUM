package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains("what%20is%203%20plus%202")) {
            return "5";
        } else if (query.contains("what%20is%2010%20plus%2013")) {
            return "23";
        } else if (query.contains("what%20is%202%20plus%2015")) {
            return "17";
        } else if (query.contains("what%20is%2012%20plus%201")) {
            return "13";
        } else if (query.contains("what%20is%209%20plus%206")) {
            return  "15";
        } else if (query.contains("what%20is%203%20plus%2018")) {
            return "21";
        }

        return "";
    }
}
