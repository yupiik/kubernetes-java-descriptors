package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe {
    private DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe(final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec exec,
                                                                     final Integer failureThreshold,
                                                                     final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                                     final Integer initialDelaySeconds,
                                                                     final Integer periodSeconds,
                                                                     final Integer successThreshold,
                                                                     final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                                     final Integer timeoutSeconds) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbe) __other;
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
