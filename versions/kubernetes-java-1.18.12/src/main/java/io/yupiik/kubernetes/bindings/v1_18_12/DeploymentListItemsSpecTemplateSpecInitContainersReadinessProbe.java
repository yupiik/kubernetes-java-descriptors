package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe {
    private DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe(final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec,
                                                                           final Integer failureThreshold,
                                                                           final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet,
                                                                           final Integer initialDelaySeconds,
                                                                           final Integer periodSeconds,
                                                                           final Integer successThreshold,
                                                                           final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket,
                                                                           final Integer timeoutSeconds) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeHttpGet httpGet) {
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

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe) __other;
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
