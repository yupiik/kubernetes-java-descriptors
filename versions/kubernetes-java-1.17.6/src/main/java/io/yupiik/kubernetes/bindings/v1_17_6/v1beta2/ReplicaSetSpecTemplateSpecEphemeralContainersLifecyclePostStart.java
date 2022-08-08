package io.yupiik.kubernetes.bindings.v1_17_6.v1beta2;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                           final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                           final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
