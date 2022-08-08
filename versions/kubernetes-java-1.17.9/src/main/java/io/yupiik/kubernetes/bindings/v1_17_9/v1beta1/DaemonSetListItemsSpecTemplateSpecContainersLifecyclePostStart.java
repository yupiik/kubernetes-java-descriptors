package io.yupiik.kubernetes.bindings.v1_17_9.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                          final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                          final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
