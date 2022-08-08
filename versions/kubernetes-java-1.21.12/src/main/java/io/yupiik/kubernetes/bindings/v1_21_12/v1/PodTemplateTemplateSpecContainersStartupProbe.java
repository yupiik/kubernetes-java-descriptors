package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersStartupProbe {
    private PodTemplateTemplateSpecContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private PodTemplateTemplateSpecContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodTemplateTemplateSpecContainersStartupProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public PodTemplateTemplateSpecContainersStartupProbe() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersStartupProbe(final PodTemplateTemplateSpecContainersStartupProbeExec exec,
                                                         final Integer failureThreshold,
                                                         final PodTemplateTemplateSpecContainersStartupProbeHttpGet httpGet,
                                                         final Integer initialDelaySeconds,
                                                         final Integer periodSeconds,
                                                         final Integer successThreshold,
                                                         final PodTemplateTemplateSpecContainersStartupProbeTcpSocket tcpSocket,
                                                         final Integer terminationGracePeriodSeconds,
                                                         final Integer timeoutSeconds) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodTemplateTemplateSpecContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecContainersStartupProbeHttpGet httpGet) {
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

    public PodTemplateTemplateSpecContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersStartupProbe)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersStartupProbe __otherCasted = (PodTemplateTemplateSpecContainersStartupProbe) __other;
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
