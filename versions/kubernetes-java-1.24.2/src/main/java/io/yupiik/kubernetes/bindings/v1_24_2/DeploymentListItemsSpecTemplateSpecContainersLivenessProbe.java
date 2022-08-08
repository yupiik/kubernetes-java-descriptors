package io.yupiik.kubernetes.bindings.v1_24_2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLivenessProbe {
    private DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private DeploymentListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc;
    private DeploymentListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DeploymentListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbe() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbe(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec exec,
                                                                      final Integer failureThreshold,
                                                                      final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc,
                                                                      final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet,
                                                                      final Integer initialDelaySeconds,
                                                                      final Integer periodSeconds,
                                                                      final Integer successThreshold,
                                                                      final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket,
                                                                      final Integer terminationGracePeriodSeconds,
                                                                      final Integer timeoutSeconds) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeHttpGet httpGet) {
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

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLivenessProbe)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLivenessProbe __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLivenessProbe) __other;
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
