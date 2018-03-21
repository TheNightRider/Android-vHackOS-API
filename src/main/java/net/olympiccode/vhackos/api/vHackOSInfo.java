package net.olympiccode.vhackos.api;

public class vHackOSInfo {
    private static int REST_VERSION = 11;
    public static final String API_PREFIX = String.format("https://api.vhack.cc/mobile/%d/", REST_VERSION);

    public static void setRestVersion(int version)
    {
        REST_VERSION = version;
    }

    public static int getRestVersion() {
        return REST_VERSION;
    }
}
