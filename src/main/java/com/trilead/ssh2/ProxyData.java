package com.trilead.ssh2;

import java.io.IOException;
import java.net.Socket;

/**
 * An abstract interface implemented by all proxy data implementations.
 *
 * @author Christian Plattner, plattner@trilead.com
 * @version $Id: ProxyData.java,v 1.1 2007/10/15 12:49:56 cplattne Exp $
 * @see HTTPProxyData
 */

public interface ProxyData {
    /**
     * Connects the socket to the given destination using the proxy method that this instance
     * represents.
     *
     * @param hostname       hostname of end host (not proxy)
     * @param port           port of end host (not proxy)
     * @param connectTimeout number of seconds before giving up on connecting to end host
     * @return connected socket instance
     * @throws IOException if the connection could not be completed
     */
    Socket openConnection(String hostname, int port, int connectTimeout) throws IOException;
}
