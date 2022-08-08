package io.yupiik.kubernetes.bindings.v1_21_2;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop {
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                    final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                    final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
