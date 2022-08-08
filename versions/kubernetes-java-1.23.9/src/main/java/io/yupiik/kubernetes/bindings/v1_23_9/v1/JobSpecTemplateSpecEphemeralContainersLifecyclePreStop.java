package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private JobSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private JobSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private JobSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStop(final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                  final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                  final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (JobSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
