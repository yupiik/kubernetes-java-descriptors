package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart {
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                     final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                     final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
