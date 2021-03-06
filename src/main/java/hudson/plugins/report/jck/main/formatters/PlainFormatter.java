/*
 * The MIT License
 *
 * Copyright 2016 jvanek.
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
package hudson.plugins.report.jck.main.formatters;

import java.io.PrintStream;

public class PlainFormatter extends BasicFormatter {

    public PlainFormatter(PrintStream stream) {
        super(stream);
    }

    @Override
    public void startBold() {
        //no op
    }

    @Override
    public void startColor(SupportedColors color) {
        //no op
    }

    @Override
    public void reset() {
        //no op
    }

    @Override
    public void initDoc() {
        //no op
    }

    @Override
    public void closeDoc() {
        //no op
    }

    @Override
    public void startTitle2() {
        //no op
    }

    @Override
    public void startTitle1() {
        //no op
    }

    @Override
    public void startTitle3() {
        //no op
    }

    @Override
    public void startTitle4() {
        //no op
    }
}
