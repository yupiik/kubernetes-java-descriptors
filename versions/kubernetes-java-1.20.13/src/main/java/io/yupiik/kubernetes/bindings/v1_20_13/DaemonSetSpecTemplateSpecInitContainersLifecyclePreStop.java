package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop {
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop(final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                   final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                   final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
