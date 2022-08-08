package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe {
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec exec,
                                                                                   final Integer failureThreshold,
                                                                                   final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet,
                                                                                   final Integer initialDelaySeconds,
                                                                                   final Integer periodSeconds,
                                                                                   final Integer successThreshold,
                                                                                   final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket,
                                                                                   final Integer terminationGracePeriodSeconds,
                                                                                   final Integer timeoutSeconds) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(failureThreshold, __otherCasted.failureThreshold) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(initialDelaySeconds, __otherCasted.initialDelaySeconds) &&
            Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(successThreshold, __otherCasted.successThreshold) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket) &&
            Objects.equals(terminationGracePeriodSeconds, __otherCasted.terminationGracePeriodSeconds) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }
}
