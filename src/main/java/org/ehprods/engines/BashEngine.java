package org.ehprods.engines;

import org.ehprods.utils.AppData;

import java.lang.reflect.Array;

public class BashEngine {

    public static int switcherBashEngine(Object command){

        ProcessBuilder pb = new ProcessBuilder();
        int exitCode = 0;

        if (command instanceof String) {
            pb.command("bash", String.valueOf(command));
        }
        if (command instanceof String[]) {
            String loc = String.valueOf(Array.get(command, 0));
            String stop = String.valueOf(Array.get(command, 1));
            String start = String.valueOf(Array.get(command, 2));
            pb.command("bash", loc + stop, "&&", loc + start);
        }



        try {
            Process runner = pb.start();
            exitCode = runner.waitFor();
        } catch (Exception exception) {
            exception.printStackTrace();
            exitCode = -1;
        }


        return exitCode;
    }


    public static int PIDKiller(String service) {

        ProcessBuilder pb = new ProcessBuilder();
        int exitCode = 0;
        pb.command("pkill", "-f", service);

        try {

            Process runner = pb.start();
            exitCode = runner.waitFor();

        } catch (Exception ex) {
           ex.printStackTrace();
           exitCode = -1;

        }

        return exitCode;
    }


}
