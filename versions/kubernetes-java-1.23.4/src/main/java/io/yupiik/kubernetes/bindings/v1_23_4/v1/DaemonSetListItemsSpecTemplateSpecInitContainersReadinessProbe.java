package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe {
    private DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeGrpc grpc;
    private DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec,
                                                                          final Integer failureThreshold,
                                                                          final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeGrpc grpc,
                                                                          final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet,
                                                                          final Integer initialDelaySeconds,
                                                                          final Integer periodSeconds,
                                                                          final Integer successThreshold,
                                                                          final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket,
                                                                          final Integer terminationGracePeriodSeconds,
                                                                          final Integer timeoutSeconds) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet) {
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

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe) __other;
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
