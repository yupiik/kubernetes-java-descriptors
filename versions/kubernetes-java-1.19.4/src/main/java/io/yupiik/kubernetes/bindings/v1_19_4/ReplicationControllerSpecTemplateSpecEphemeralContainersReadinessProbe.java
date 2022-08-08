package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket;
    private Integer timeoutSeconds;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe(final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeExec exec,
                                                                                  final Integer failureThreshold,
                                                                                  final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet,
                                                                                  final Integer initialDelaySeconds,
                                                                                  final Integer periodSeconds,
                                                                                  final Integer successThreshold,
                                                                                  final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket,
                                                                                  final Integer timeoutSeconds) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet) {
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

    public ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersReadinessProbe) __other;
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
