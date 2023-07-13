/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2021 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.retrooper.packetevents.util.google.versions;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.google.common.collect.BiMap;
import com.google.common.collect.MapMaker;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class GuavaUtils_8 {

    public static <T, K> ConcurrentMap<T, K> makeMap() {
        return new MapMaker().weakValues().makeMap();
    }

    public static Object inverseAndGet(Map<?, ?> map, Object key) {
        if (!(map instanceof BiMap)) return map;

        return ((BiMap<?, ?>) map).inverse().get(key);
    }

}