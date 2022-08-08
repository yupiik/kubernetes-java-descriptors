package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersLifecyclePreStop {
    private JobSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private JobSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private JobSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public JobSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePreStop(final JobSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                             final JobSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                             final JobSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (JobSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
