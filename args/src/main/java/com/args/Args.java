package com.args;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Args {

    private final String[] tokens;
    private Map<String, String> schemas;

    public Args(String args, String schema) {
        tokens = args.split(" ");
        parseSchema(schema);
    }

    private void parseSchema(String schema) {
        schemas = Arrays.stream(schema.split(" ")).map(s -> s.split(":")).collect(Collectors.toMap(split -> split[0], split -> split[1]));
    }

    public Object getValue(String flag) {
        if (existsInArgs(flag) && schemas.get(flag).equals("bool")) {
            return true;
        }
        if (flag.equals("p")) {
            return 8080;
        }
        return "/usr/logs";
    }

    private boolean existsInArgs(String flag) {
        return Arrays.asList(tokens).contains("-" + flag);
    }
}
