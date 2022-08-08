package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersReadinessProbe {
    private PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec exec;
    private Integer failureThreshold;
    private PodTemplateTemplateSpecEphemeralContainersReadinessProbeGrpc grpc;
    private PodTemplateTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private PodTemplateTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbe() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbe(final PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec exec,
                                                                    final Integer failureThreshold,
                                                                    final PodTemplateTemplateSpecEphemeralContainersReadinessProbeGrpc grpc,
                                                                    final PodTemplateTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet,
                                                                    final Integer initialDelaySeconds,
                                                                    final Integer periodSeconds,
                                                                    final Integer successThreshold,
                                                                    final PodTemplateTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket,
                                                                    final Integer terminationGracePeriodSeconds,
                                                                    final Integer timeoutSeconds) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final PodTemplateTemplateSpecEphemeralContainersReadinessProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecEphemeralContainersReadinessProbeHttpGet httpGet) {
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

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecEphemeralContainersReadinessProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersReadinessProbe)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersReadinessProbe __otherCasted = (PodTemplateTemplateSpecEphemeralContainersReadinessProbe) __other;
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
