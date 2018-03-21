package net.olympiccode.vhackos.api.entities.impl;

import lombok.Getter;
import lombok.Setter;
import net.olympiccode.vhackos.api.entities.Stats;

@Setter
@Getter
public class StatsImpl implements Stats {
    private final vHackOSAPIImpl api;
    private long money, exploits, netcoins, level, experience, requiredExperience, levelPorcentage;
    private String ipAddress, username;

    public StatsImpl(vHackOSAPIImpl api) {
        this.api = api;
    }

    @Override
    public long getExploits() {
        return exploits;
    }

    @Override
    public long getMoney() {
        return money;
    }

    @Override
    public long getLevel() {
        return level;
    }

    @Override
    public long getNetcoins() {
        return netcoins;
    }

    @Override
    public long getExperience() {
        return experience;
    }

    @Override
    public long getRequiredExperience() {
        return requiredExperience;
    }

    @Override
    public long getLevelPorcentage() {
        return levelPorcentage;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getIpAddress() {
        return ipAddress;
    }

    public void setExploits(long exploits) {
        this.exploits = exploits;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public void setRequiredExperience(long requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public void setNetcoins(long netcoins) {
        this.netcoins = netcoins;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLevelPorcentage(long levelPorcentage) {
        this.levelPorcentage = levelPorcentage;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
