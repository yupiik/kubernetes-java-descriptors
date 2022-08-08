package io.yupiik.kubernetes.bindings.v1_14_2.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                           final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                           final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
