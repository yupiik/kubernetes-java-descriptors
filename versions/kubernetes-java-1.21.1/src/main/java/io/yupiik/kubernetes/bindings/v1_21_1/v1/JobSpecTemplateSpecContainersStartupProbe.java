package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersStartupProbe {
    private JobSpecTemplateSpecContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private JobSpecTemplateSpecContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private JobSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public JobSpecTemplateSpecContainersStartupProbe() {
        // no-op
    }

    public JobSpecTemplateSpecContainersStartupProbe(final JobSpecTemplateSpecContainersStartupProbeExec exec,
                                                     final Integer failureThreshold,
                                                     final JobSpecTemplateSpecContainersStartupProbeHttpGet httpGet,
                                                     final Integer initialDelaySeconds,
                                                     final Integer periodSeconds,
                                                     final Integer successThreshold,
                                                     final JobSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket,
                                                     final Integer terminationGracePeriodSeconds,
                                                     final Integer timeoutSeconds) {
        // no-op
    }

    public JobSpecTemplateSpecContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public JobSpecTemplateSpecContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecContainersStartupProbeHttpGet httpGet) {
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

    public JobSpecTemplateSpecContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersStartupProbe)) {
            return false;
        }
        final JobSpecTemplateSpecContainersStartupProbe __otherCasted = (JobSpecTemplateSpecContainersStartupProbe) __other;
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
