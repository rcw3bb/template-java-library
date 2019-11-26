package xyz.ronella.template.lib.commons;

import java.nio.file.Paths;

public class PackageMgr {
    public static boolean isPackaged() {
        return Paths.get("___package___").toFile().exists();
    }
}
