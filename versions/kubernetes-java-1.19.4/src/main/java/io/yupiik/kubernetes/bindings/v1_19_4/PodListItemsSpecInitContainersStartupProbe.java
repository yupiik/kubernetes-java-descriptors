package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class PodListItemsSpecInitContainersStartupProbe {
    private PodListItemsSpecInitContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private PodListItemsSpecInitContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodListItemsSpecInitContainersStartupProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public PodListItemsSpecInitContainersStartupProbe() {
        // no-op
    }

    public PodListItemsSpecInitContainersStartupProbe(final PodListItemsSpecInitContainersStartupProbeExec exec,
                                                      final Integer failureThreshold,
                                                      final PodListItemsSpecInitContainersStartupProbeHttpGet httpGet,
                                                      final Integer initialDelaySeconds,
                                                      final Integer periodSeconds,
                                                      final Integer successThreshold,
                                                      final PodListItemsSpecInitContainersStartupProbeTcpSocket tcpSocket,
                                                      final Integer timeoutSeconds) {
        // no-op
    }

    public PodListItemsSpecInitContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecInitContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodListItemsSpecInitContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecInitContainersStartupProbeHttpGet httpGet) {
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

    public PodListItemsSpecInitContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecInitContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersStartupProbe)) {
            return false;
        }
        final PodListItemsSpecInitContainersStartupProbe __otherCasted = (PodListItemsSpecInitContainersStartupProbe) __other;
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
