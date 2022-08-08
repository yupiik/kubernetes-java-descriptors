package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                    final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                    final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
