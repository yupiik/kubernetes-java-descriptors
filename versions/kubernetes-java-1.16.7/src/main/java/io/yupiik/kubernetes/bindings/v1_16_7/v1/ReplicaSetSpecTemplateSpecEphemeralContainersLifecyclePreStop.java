package io.yupiik.kubernetes.bindings.v1_16_7.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                         final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                         final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
