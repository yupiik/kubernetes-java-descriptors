package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
