package net.olympiccode.vhackos.api;

import at.atvg_studios.gitlab.whiteiron.app.Config;

public class vHackOSInfo {
    private static int REST_VERSION = Config.getAPILevel();
    public static final String API_PREFIX = String.format("https://api.vhack.cc/mobile/%d/", REST_VERSION);

    public static void setRestVersion(int version)
    {
        REST_VERSION = version;
    }

    public static int getRestVersion() {
        return REST_VERSION;
    }
}
