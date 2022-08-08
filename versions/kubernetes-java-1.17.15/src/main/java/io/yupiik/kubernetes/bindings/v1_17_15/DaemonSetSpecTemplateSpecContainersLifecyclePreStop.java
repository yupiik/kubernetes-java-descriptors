package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecyclePreStop {
    private DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private DaemonSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStop(final DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                               final DaemonSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                               final DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
