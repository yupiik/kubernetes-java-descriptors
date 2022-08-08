package io.yupiik.kubernetes.bindings.v1_18_14.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec exec;
    private Integer failureThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec exec,
                                                                                      final Integer failureThreshold,
                                                                                      final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeHttpGet httpGet,
                                                                                      final Integer initialDelaySeconds,
                                                                                      final Integer periodSeconds,
                                                                                      final Integer successThreshold,
                                                                                      final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeTcpSocket tcpSocket,
                                                                                      final Integer timeoutSeconds) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeHttpGet httpGet) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe) __other;
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
