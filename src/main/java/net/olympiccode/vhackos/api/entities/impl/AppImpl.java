package net.olympiccode.vhackos.api.entities.impl;

import lombok.Getter;
import lombok.Setter;
import net.olympiccode.vhackos.api.appstore.App;
import net.olympiccode.vhackos.api.appstore.InstallableApp;
import net.olympiccode.vhackos.api.appstore.UpdateableApp;
import net.olympiccode.vhackos.api.entities.AppType;

@Getter
@Setter
public class AppImpl implements App {
    private AppType type;
    private long price;
    private int level;
    private int requiredLevel;
    private boolean oneTime;
    private int maxLevel;
    private vHackOSAPIImpl api;
    private boolean installed;

    public AppImpl(vHackOSAPIImpl api, AppType type, long price, int level, int requiredLevel, int maxLevel) {
        this.type = type;
        this.price = price;
        this.level = level;
        this.requiredLevel = requiredLevel;
        this.oneTime = maxLevel < 2;
        this.api = api;
        this.installed = level > 0;
        this.maxLevel = maxLevel;
    }

    public InstallableApp getAsInstallable() {
        return new InstallableAppImpl(api, type, price, level, requiredLevel, maxLevel);
    }


    public UpdateableApp getAsUpdateable() {
        return new UpdateableAppImpl(api, type, price, level, requiredLevel, maxLevel);
    }

    @Override
    public AppType getType() {
        return type;
    }

    @Override
    public boolean isOneTime() {
        return oneTime;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public long getPrice() {
        return price;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setType(AppType type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public void setOneTime(boolean oneTime) {
        this.oneTime = oneTime;
    }

    @Override
    public boolean isInstalled() {
        return installed;
    }
}
