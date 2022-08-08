package io.yupiik.kubernetes.bindings.v1_16_9;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart {
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                        final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                        final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
