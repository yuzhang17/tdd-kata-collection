package com.args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgsTest {

    @Test
    void should_return_correct_value_when_get_value_given_args_exist_in_schema() {
        final Args args = new Args("-l -p 8080 -d /usr/logs", "l:bool p:int d:str");
        assertTrue((Boolean) args.getValue("l"));
        assertEquals(8080, args.getValue("p"));
        assertEquals("/usr/logs", args.getValue("d"));
    }
}
