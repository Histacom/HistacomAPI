/*
 * This file is part of HistacomAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015, Histacom Development Team <https://github.com/histacom>
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
package io.github.histacom;

import com.google.common.base.Preconditions;
import io.github.histacom.api.Game;

/**
 * Created by jamie on 19/04/15.
 */
public class Histacom {

    private static Game game;

    /**
     * Attempts to set the currently running {@link Game}
     * This will not work, if one is already running!
     *
     * <b>THIS SHOULD ONLY BE USED BY THE IMPLEMENTATION!</b>
     *
     * @param game the {@link Game} to set.
     */
    public static void setGame(Game game) {
        if (Histacom.game != null) {
            throw new UnsupportedOperationException("There is only one Game!");
        }
        Histacom.game = Preconditions.checkNotNull(game);
    }

    /**
     * Gets the currently running {@link Game}
     *
     * @return the {@link Game} instance being run
     */
    public static Game getGame() {
        return game;
    }
}
