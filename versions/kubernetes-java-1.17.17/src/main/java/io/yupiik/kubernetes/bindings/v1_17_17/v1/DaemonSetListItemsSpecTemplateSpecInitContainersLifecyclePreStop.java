package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
