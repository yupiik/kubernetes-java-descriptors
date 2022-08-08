package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class PodListItemsSpecInitContainersLivenessProbe {
    private PodListItemsSpecInitContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private PodListItemsSpecInitContainersLivenessProbeGrpc grpc;
    private PodListItemsSpecInitContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodListItemsSpecInitContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public PodListItemsSpecInitContainersLivenessProbe() {
        // no-op
    }

    public PodListItemsSpecInitContainersLivenessProbe(final PodListItemsSpecInitContainersLivenessProbeExec exec,
                                                       final Integer failureThreshold,
                                                       final PodListItemsSpecInitContainersLivenessProbeGrpc grpc,
                                                       final PodListItemsSpecInitContainersLivenessProbeHttpGet httpGet,
                                                       final Integer initialDelaySeconds,
                                                       final Integer periodSeconds,
                                                       final Integer successThreshold,
                                                       final PodListItemsSpecInitContainersLivenessProbeTcpSocket tcpSocket,
                                                       final Integer terminationGracePeriodSeconds,
                                                       final Integer timeoutSeconds) {
        // no-op
    }

    public PodListItemsSpecInitContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecInitContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodListItemsSpecInitContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final PodListItemsSpecInitContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public PodListItemsSpecInitContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecInitContainersLivenessProbeHttpGet httpGet) {
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

    public PodListItemsSpecInitContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecInitContainersLivenessProbeTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(final Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
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
                grpc,
                httpGet,
                initialDelaySeconds,
                periodSeconds,
                successThreshold,
                tcpSocket,
                terminationGracePeriodSeconds,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersLivenessProbe)) {
            return false;
        }
        final PodListItemsSpecInitContainersLivenessProbe __otherCasted = (PodListItemsSpecInitContainersLivenessProbe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(grpc, __otherCasted.grpc) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
