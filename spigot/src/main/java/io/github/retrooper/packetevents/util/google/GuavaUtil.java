package io.github.retrooper.packetevents.util.google;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import io.github.retrooper.packetevents.util.google.versions.GuavaUtils_7;
import io.github.retrooper.packetevents.util.google.versions.GuavaUtils_8;

import java.util.concurrent.ConcurrentMap;

public class GuavaUtil {

    public static <T, K> ConcurrentMap<T, K> makeMap(ServerVersion serverVersion) {
        if (serverVersion.isNewerThan(ServerVersion.V_1_7_10)) {
            return GuavaUtils_8.makeMap();
        } else {
            return GuavaUtils_7.makeMap();
        }
    }

}
