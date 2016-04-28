/*
 * This file is part of HistacomAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2016, Histacom Development Team <https://github.com/histacom>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package uk.jamierocks.histacom;

import com.google.common.base.Preconditions;
import uk.jamierocks.histacom.api.Game;
import uk.jamierocks.histacom.api.era.EraManager;
import uk.jamierocks.histacom.api.plugin.PluginManager;
import xyz.lexteam.eventbus.IEventBus;

/**
 * Allows for static access to the {@link Game}.
 */
public class Histacom {

    private static final Game game = null;

    /**
     * Gets the {@link Game}.
     *
     * @return The game
     */
    public static Game getGame() {
        Preconditions.checkNotNull(game, "Histacom not yet initialised!");

        return game;
    }

    /**
     * Gets the {@link IEventBus}.
     *
     * @return The event bus
     * @see Game#getEventBus()
     */
    public static IEventBus getEventBus() {
        return getGame().getEventBus();
    }

    /**
     * Gets the {@link EraManager}.
     *
     * @return The era manager
     * @see Game#getEraManager()
     */
    public static EraManager getEraManager() {
        return getGame().getEraManager();
    }

    /**
     * Gets the {@link PluginManager}
     *
     * @return The plugin manager
     * @see Game#getPluginManager()
     */
    public static PluginManager getPluginManager() {
        return getGame().getPluginManager();
    }
}
