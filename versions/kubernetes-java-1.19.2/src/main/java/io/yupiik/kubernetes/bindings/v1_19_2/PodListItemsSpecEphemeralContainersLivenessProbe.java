package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLivenessProbe {
    private PodListItemsSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private PodListItemsSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodListItemsSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public PodListItemsSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLivenessProbe(final PodListItemsSpecEphemeralContainersLivenessProbeExec exec,
                                                            final Integer failureThreshold,
                                                            final PodListItemsSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                            final Integer initialDelaySeconds,
                                                            final Integer periodSeconds,
                                                            final Integer successThreshold,
                                                            final PodListItemsSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                            final Integer timeoutSeconds) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodListItemsSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public PodListItemsSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLivenessProbe __otherCasted = (PodListItemsSpecEphemeralContainersLivenessProbe) __other;
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
