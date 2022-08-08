package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe {
    private ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec exec,
                                                                                 final Integer failureThreshold,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet,
                                                                                 final Integer initialDelaySeconds,
                                                                                 final Integer periodSeconds,
                                                                                 final Integer successThreshold,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket,
                                                                                 final Integer terminationGracePeriodSeconds,
                                                                                 final Integer timeoutSeconds) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet) {
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

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe) __other;
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
