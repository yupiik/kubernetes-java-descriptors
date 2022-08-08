package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                  final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                  final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
