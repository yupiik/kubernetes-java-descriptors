package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecyclePreStop {
    private JobSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private JobSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private JobSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public JobSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePreStop(final JobSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                         final JobSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                         final JobSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (JobSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
