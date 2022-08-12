/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_15_6.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_6.Validable;
import io.yupiik.kubernetes.bindings.v1_15_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Handler implements Validable<Handler>, Exportable {
    private ExecAction exec;
    private HTTPGetAction httpGet;
    private TCPSocketAction tcpSocket;

    public Handler() {
        // no-op
    }

    public Handler(final ExecAction exec,
                   final HTTPGetAction httpGet,
                   final TCPSocketAction tcpSocket) {
        // no-op
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(final ExecAction exec) {
        this.exec = exec;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Handler)) {
            return false;
        }
        final Handler __otherCasted = (Handler) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }

    public Handler exec(final ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public Handler httpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public Handler tcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    @Override
    public Handler validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (exec != null ? "\"exec\":" + exec.asJson() : ""),
                    (httpGet != null ? "\"httpGet\":" + httpGet.asJson() : ""),
                    (tcpSocket != null ? "\"tcpSocket\":" + tcpSocket.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
