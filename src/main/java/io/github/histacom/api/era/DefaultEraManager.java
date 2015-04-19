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
package io.github.histacom.api.era;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by jamie on 19/04/15.
 */
public class DefaultEraManager implements EraManager {

    private List<Era> eras = Lists.newArrayList();
    private Era currentEra;
    private int lastEra = 0;

    /**
     * {@inheritDoc}
     */
    @Override
    public Era getCurrentEra() {
        if (currentEra == null) {
            currentEra = Preconditions.checkNotNull(eras.get(lastEra));
        }
        return currentEra;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Era advanceEra() {
        return currentEra = Preconditions.checkNotNull(eras.get(++lastEra));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addEra(Era era) {
        eras.add(Preconditions.checkNotNull(era));
    }
}
