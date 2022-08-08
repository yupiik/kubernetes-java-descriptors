package io.yupiik.kubernetes.bindings.v1_19_9;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                      final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                      final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
