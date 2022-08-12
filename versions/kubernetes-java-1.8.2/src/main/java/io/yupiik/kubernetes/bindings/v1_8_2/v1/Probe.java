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
package io.yupiik.kubernetes.bindings.v1_8_2.v1;

import io.yupiik.kubernetes.bindings.v1_8_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_2.Validable;
import io.yupiik.kubernetes.bindings.v1_8_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Probe implements Validable<Probe>, Exportable {
    private ExecAction exec;
    private Integer failureThreshold;
    private HTTPGetAction httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private TCPSocketAction tcpSocket;
    private Integer timeoutSeconds;

    public Probe() {
        // no-op
    }

    public Probe(final ExecAction exec,
                 final Integer failureThreshold,
                 final HTTPGetAction httpGet,
                 final Integer initialDelaySeconds,
                 final Integer periodSeconds,
                 final Integer successThreshold,
                 final TCPSocketAction tcpSocket,
                 final Integer timeoutSeconds) {
        // no-op
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(final ExecAction exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(final Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(final Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(final Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                failureThreshold,
                httpGet,
                initialDelaySeconds,
                periodSeconds,
                successThreshold,
                tcpSocket,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Probe)) {
            return false;
        }
        final Probe __otherCasted = (Probe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }

    public Probe exec(final ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public Probe failureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    public Probe httpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public Probe initialDelaySeconds(final Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    public Probe periodSeconds(final Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public Probe successThreshold(final Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    public Probe tcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    public Probe timeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public Probe validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (exec != null ? "\"exec\":" + exec.asJson() : ""),
                    (failureThreshold != null ? "\"failureThreshold\":" + failureThreshold : ""),
                    (httpGet != null ? "\"httpGet\":" + httpGet.asJson() : ""),
                    (initialDelaySeconds != null ? "\"initialDelaySeconds\":" + initialDelaySeconds : ""),
                    (periodSeconds != null ? "\"periodSeconds\":" + periodSeconds : ""),
                    (successThreshold != null ? "\"successThreshold\":" + successThreshold : ""),
                    (tcpSocket != null ? "\"tcpSocket\":" + tcpSocket.asJson() : ""),
                    (timeoutSeconds != null ? "\"timeoutSeconds\":" + timeoutSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
