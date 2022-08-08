package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecyclePostStart {
    private DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private DaemonSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStart(final DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                 final DaemonSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                 final DaemonSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
