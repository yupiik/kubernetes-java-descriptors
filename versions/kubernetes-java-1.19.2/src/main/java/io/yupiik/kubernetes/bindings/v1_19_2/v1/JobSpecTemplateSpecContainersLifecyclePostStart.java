package io.yupiik.kubernetes.bindings.v1_19_2.v1;

import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecyclePostStart {
    private JobSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private JobSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public JobSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePostStart(final JobSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                           final JobSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                           final JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final JobSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public JobSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final JobSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final JobSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (JobSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
