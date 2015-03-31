/*
  Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.

  The MySQL Connector/J is licensed under the terms of the GPLv2
  <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most MySQL Connectors.
  There are special exceptions to the terms and conditions of the GPLv2 as it is applied to
  this software, see the FLOSS License Exception
  <http://www.mysql.com/about/legal/licensing/foss-exception.html>.

  This program is free software; you can redistribute it and/or modify it under the terms
  of the GNU General Public License as published by the Free Software Foundation; version 2
  of the License.

  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
  See the GNU General Public License for more details.

  You should have received a copy of the GNU General Public License along with this
  program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth
  Floor, Boston, MA 02110-1301  USA

 */

package com.mysql.cj.api.io;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.net.Socket;

import com.mysql.cj.api.ExceptionInterceptor;
import com.mysql.cj.api.MysqlConnection;

public interface Protocol {

    /**
     * Returns the host this IO is connected to
     */
    public String getHost();

    public int getPort();

    public MysqlConnection getConnection();

    public void setConnection(MysqlConnection connection);

    public Socket getMysqlSocket();

    public void setMysqlSocket(Socket mysqlSocket);

    public InputStream getMysqlInput();

    public void setMysqlInput(InputStream mysqlInput);

    public BufferedOutputStream getMysqlOutput();

    public void setMysqlOutput(BufferedOutputStream mysqlOutput);

    public ExceptionInterceptor getExceptionInterceptor();

    public abstract boolean isSSLEstablished();

    public SocketFactory getSocketFactory();

    public void setSocketFactory(SocketFactory socketFactory);

    /**
     * @return Returns the lastPacketSentTimeMs.
     */
    public long getLastPacketSentTimeMs();

    public long getLastPacketReceivedTimeMs();

}
