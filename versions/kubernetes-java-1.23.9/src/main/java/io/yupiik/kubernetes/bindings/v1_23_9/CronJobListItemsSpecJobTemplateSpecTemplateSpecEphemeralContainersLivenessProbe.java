package io.yupiik.kubernetes.bindings.v1_23_9;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec exec,
                                                                                           final Integer failureThreshold,
                                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc,
                                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet,
                                                                                           final Integer initialDelaySeconds,
                                                                                           final Integer periodSeconds,
                                                                                           final Integer successThreshold,
                                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket,
                                                                                           final Integer terminationGracePeriodSeconds,
                                                                                           final Integer timeoutSeconds) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeHttpGet httpGet) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe) __other;
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
