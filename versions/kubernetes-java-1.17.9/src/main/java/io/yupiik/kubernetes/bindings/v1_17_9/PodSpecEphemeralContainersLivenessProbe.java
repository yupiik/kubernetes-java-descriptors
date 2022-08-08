package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.Objects;

public class PodSpecEphemeralContainersLivenessProbe {
    private PodSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private PodSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public PodSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public PodSpecEphemeralContainersLivenessProbe(final PodSpecEphemeralContainersLivenessProbeExec exec,
                                                   final Integer failureThreshold,
                                                   final PodSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                   final Integer initialDelaySeconds,
                                                   final Integer periodSeconds,
                                                   final Integer successThreshold,
                                                   final PodSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                   final Integer timeoutSeconds) {
        // no-op
    }

    public PodSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public PodSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final PodSpecEphemeralContainersLivenessProbe __otherCasted = (PodSpecEphemeralContainersLivenessProbe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
