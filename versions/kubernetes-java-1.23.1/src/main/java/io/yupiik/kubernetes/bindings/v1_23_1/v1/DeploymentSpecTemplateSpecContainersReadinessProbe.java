package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersReadinessProbe {
    private DeploymentSpecTemplateSpecContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private DeploymentSpecTemplateSpecContainersReadinessProbeGrpc grpc;
    private DeploymentSpecTemplateSpecContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DeploymentSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public DeploymentSpecTemplateSpecContainersReadinessProbe() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbe(final DeploymentSpecTemplateSpecContainersReadinessProbeExec exec,
                                                              final Integer failureThreshold,
                                                              final DeploymentSpecTemplateSpecContainersReadinessProbeGrpc grpc,
                                                              final DeploymentSpecTemplateSpecContainersReadinessProbeHttpGet httpGet,
                                                              final Integer initialDelaySeconds,
                                                              final Integer periodSeconds,
                                                              final Integer successThreshold,
                                                              final DeploymentSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket,
                                                              final Integer terminationGracePeriodSeconds,
                                                              final Integer timeoutSeconds) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final DeploymentSpecTemplateSpecContainersReadinessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecContainersReadinessProbeHttpGet httpGet) {
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

    public DeploymentSpecTemplateSpecContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersReadinessProbe)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersReadinessProbe __otherCasted = (DeploymentSpecTemplateSpecContainersReadinessProbe) __other;
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
