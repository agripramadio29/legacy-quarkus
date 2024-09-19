package org.ehprods.engines;

public class SystemdEngine {
    public static int systemdEngine(String command, String serviceName) {
        ProcessBuilder proc = new ProcessBuilder();
        proc.command("systemctl", command, serviceName);
        int code = 0;

        try {
            Process run = proc.start();
            code = run.waitFor();
        } catch (Exception s) {
            s.printStackTrace();
            code = -1;
        }


        return code;
    }
}
