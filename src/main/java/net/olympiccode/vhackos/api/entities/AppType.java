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
            MalwareKit ("Malware Kit", 12),
            Jobs ("Jobs", 13);

    @Getter
    private String name;
    @Getter
    private int id;

    AppType(String name, int id) {
        this.name = name;
        this.id = id;
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
