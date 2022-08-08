package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeGrpc grpc;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec exec,
                                                                                   final Integer failureThreshold,
                                                                                   final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeGrpc grpc,
                                                                                   final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeHttpGet httpGet,
                                                                                   final Integer initialDelaySeconds,
                                                                                   final Integer periodSeconds,
                                                                                   final Integer successThreshold,
                                                                                   final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket,
                                                                                   final Integer terminationGracePeriodSeconds,
                                                                                   final Integer timeoutSeconds) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeHttpGet httpGet) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbe) __other;
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
