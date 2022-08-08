package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersLifecyclePostStart {
    private JobSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private JobSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private JobSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStart(final JobSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                               final JobSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                               final JobSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (JobSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
