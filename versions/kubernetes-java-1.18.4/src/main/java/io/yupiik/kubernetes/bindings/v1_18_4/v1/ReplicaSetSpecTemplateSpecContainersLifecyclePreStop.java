package io.yupiik.kubernetes.bindings.v1_18_4.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLifecyclePreStop {
    private ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private ReplicaSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStop(final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (ReplicaSetSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
