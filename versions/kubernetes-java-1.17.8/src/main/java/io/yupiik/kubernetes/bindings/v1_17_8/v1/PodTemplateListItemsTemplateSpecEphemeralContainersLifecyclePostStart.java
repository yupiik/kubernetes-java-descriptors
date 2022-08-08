package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart {
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                                 final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                                 final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
