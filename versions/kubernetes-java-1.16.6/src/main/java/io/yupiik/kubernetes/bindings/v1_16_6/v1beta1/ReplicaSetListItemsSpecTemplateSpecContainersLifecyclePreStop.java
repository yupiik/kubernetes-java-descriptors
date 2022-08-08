package io.yupiik.kubernetes.bindings.v1_16_6.v1beta1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                         final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                         final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
