package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLifecyclePostStart {
    private ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private ReplicaSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStart(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                  final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                  final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (ReplicaSetSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
