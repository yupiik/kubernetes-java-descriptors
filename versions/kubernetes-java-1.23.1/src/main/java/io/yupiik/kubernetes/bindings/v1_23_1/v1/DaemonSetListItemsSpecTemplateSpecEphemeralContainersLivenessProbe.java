package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec exec,
                                                                              final Integer failureThreshold,
                                                                              final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc,
                                                                              final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                                              final Integer initialDelaySeconds,
                                                                              final Integer periodSeconds,
                                                                              final Integer successThreshold,
                                                                              final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                                              final Integer terminationGracePeriodSeconds,
                                                                              final Integer timeoutSeconds) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe) __other;
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
