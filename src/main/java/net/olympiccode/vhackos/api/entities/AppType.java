package net.olympiccode.vhackos.api.entities;

import lombok.Getter;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public enum AppType {
            Notepad("Notepad", 0),
            Antivirus ("Antivirus", 1),
            Firewall ("Firewall", 2),
            Spam ("Spam", 3),
            BruteForce ("Bruteforce", 4),
            BankingProtection ("Banking Protection", 5),
            SDK ("Software Development Kit", 6),
            Community ("Community", 7),
            Missions ("Missions", 8),
            Leaderboards ("Leaderboards", 9),
            IPSP ("IP-Spoofing", 10),
            NCMiner ("NCMiner", 11),
            Crew("Crew", 12),
            Server("Server", 13),
            MalwareKit ("Malware Kit", 14),
            Jobs ("Jobs", 15);

    private String name;
    private int id;

    AppType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static AppType byId(final int id) {
        return (AppType) Arrays.stream(AppType.values()).filter(new Predicate<AppType>() {
            @Override
            public boolean test(AppType appType) {
                return appType.id == id;
            }
        }).collect(Collectors.toList()).get(0);
    }
    
}
