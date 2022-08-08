package io.yupiik.kubernetes.bindings.v1_22_5;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe(final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec exec,
                                                                                final Integer failureThreshold,
                                                                                final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet,
                                                                                final Integer initialDelaySeconds,
                                                                                final Integer periodSeconds,
                                                                                final Integer successThreshold,
                                                                                final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket,
                                                                                final Integer terminationGracePeriodSeconds,
                                                                                final Integer timeoutSeconds) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet) {
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

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbe) __other;
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
