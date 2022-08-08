package io.yupiik.kubernetes.bindings.v1_14_6.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersLifecyclePostStart {
    private PodTemplateTemplateSpecContainersLifecyclePostStartExec exec;
    private PodTemplateTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStart(final PodTemplateTemplateSpecContainersLifecyclePostStartExec exec,
                                                               final PodTemplateTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                               final PodTemplateTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLifecyclePostStart __otherCasted = (PodTemplateTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
