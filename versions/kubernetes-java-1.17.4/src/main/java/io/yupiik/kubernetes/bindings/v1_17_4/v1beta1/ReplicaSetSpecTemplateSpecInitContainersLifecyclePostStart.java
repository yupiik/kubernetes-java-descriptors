package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart {
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                      final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                      final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
