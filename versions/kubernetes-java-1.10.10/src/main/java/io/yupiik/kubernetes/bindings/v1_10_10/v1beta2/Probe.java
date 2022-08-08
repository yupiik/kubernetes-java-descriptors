package io.yupiik.kubernetes.bindings.v1_10_10.v1beta2;

import io.yupiik.kubernetes.bindings.v1_10_10.Validable;
import io.yupiik.kubernetes.bindings.v1_10_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Probe implements Validable<Probe> {
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
}
