package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe {
    private DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec exec;
    private Integer failureThreshold;
    private DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeGrpc grpc;
    private DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe(final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec exec,
                                                                    final Integer failureThreshold,
                                                                    final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeGrpc grpc,
                                                                    final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet,
                                                                    final Integer initialDelaySeconds,
                                                                    final Integer periodSeconds,
                                                                    final Integer successThreshold,
                                                                    final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket,
                                                                    final Integer terminationGracePeriodSeconds,
                                                                    final Integer timeoutSeconds) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(final Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeGrpc getGrpc() {
        return grpc;
    }

    public void setGrpc(final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeGrpc grpc) {
        this.grpc = grpc;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeHttpGet httpGet) {
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

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersStartupProbe) __other;
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
