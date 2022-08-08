package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLifecyclePostStart {
    private PodTemplateTemplateSpecInitContainersLifecyclePostStartExec exec;
    private PodTemplateTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStart(final PodTemplateTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                   final PodTemplateTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                   final PodTemplateTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLifecyclePostStart __otherCasted = (PodTemplateTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
