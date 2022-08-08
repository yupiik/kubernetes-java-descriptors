package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
