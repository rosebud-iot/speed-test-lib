/*
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2016 Bertrand Martel
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.speedtest.test;

/**
 * Commong vars for tests.
 *
 * @author Bertrand Martel
 */
public class TestCommon {

    /**
     * value for valid socket timeout.
     */
    public static final int SOCKET_TO_VALID = 10000;

    /**
     * default value for socket timeout.
     */
    public static final int SOCKET_TO_DEFAULT = 10000;

    /**
     * value for invalid socket timeout.
     */
    public static final int SOCKET_TO_INVALID = -1;

    /**
     * default value of upload chunk size.
     */
    public static final int UPLOAD_CHUNK_SIZE_DEFAULT = 65535;

    /**
     * invalid value for upload chunk packet size.
     */
    public static final int UPLOAD_CHUNK_INVALID = 30000;

    /**
     * speed examples server host name.
     */
    public final static String SPEED_TEST_SERVER_HOST = "2.testdebit.info";

    /**
     * fake server host name.
     */
    public final static String SPEED_TEST_FAKE_HOST = "this.is.something.fake";

    /**
     * spedd examples server uri.
     */
    public final static String SPEED_TEST_SERVER_URI_DL = "/fichiers/100Mo.dat";

    /**
     * spedd examples 1Mo server uri.
     */
    public final static String SPEED_TEST_SERVER_URI_DL_1MO = "/fichiers/1Mo.dat";

    /**
     * speed examples server port.
     */
    public final static int SPEED_TEST_SERVER_PORT = 80;

    /**
     * spedd examples server uri.
     */
    public static final String SPEED_TEST_SERVER_URI_UL = "/";

    /**
     * message for unexpected error.
     */
    public final static String UNEXPECTED_ERROR_STR = "unexpected error : ";

    /**
     * message for download error.
     */
    public final static String DOWNLOAD_ERROR_STR = "download error : ";

    /**
     * message for upload error.
     */
    public final static String UPLOAD_ERROR_STR = "upload error : ";

    /**
     * default timeout waiting time in seconds.
     */
    public final static int WAITING_TIMEOUT_DEFAULT_SEC = 2;

    /**
     * default timeout waiting time for long operation such as DL / UL
     */
    public final static int WAITING_TIMEOUT_LONG_OPERATION = 10;

    /**
     * default timeout waiting time for long operation such as DL / UL
     */
    public final static int WAITING_TIMEOUT_VERY_LONG_OPERATION = 20;

    /**
     * file size used in those tests to test a DL/UL.
     */
    public final static int FILE_SIZE_REGULAR = 1000000;

    /**
     * file size medium.
     */
    public final static int FILE_SIZE_MEDIUM = 10000000;

    /**
     * file size used for large operations.
     */
    public final static int FILE_SIZE_LARGE = 100000000;

    /**
     * speed test duration set to 10s.
     */
    public static final int SPEED_TEST_DURATION = 10000;

    /**
     * amount of time between each speed test report set to 500ms.
     */
    public static final int REPORT_INTERVAL = 500;

    /**
     * number of expected reports based on report interval & speed test duration.
     */
    public static final int EXPECTED_REPORT = SPEED_TEST_DURATION / REPORT_INTERVAL;

    /**
     * time to wait for thread in ms.
     */
    public static final int WAIT_THREAD_TIMEOUT = 250;
}